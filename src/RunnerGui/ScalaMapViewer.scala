package RunnerGui

import java.awt.{BasicStroke,Color,Graphics,Graphics2D,Point}
import java.awt.geom.Path2D
import java.io.File
import com.google.inject.Inject
import org.openstreetmap.gui.jmapviewer._

import jpx._
import scala.collection._
import scala.collection.mutable.ListBuffer
import scala.collection.JavaConversions._


class ScalaMapViewer @Inject() (applicationState: ApplicationState)
    extends JMapViewer with SwingHelper {
  private val CACHE_DIR:File = new File(new File(System
			.getProperty("user.home"), ".garminTrainer"), "tileCache");
    private val mBuffer = new ListBuffer[JPXPoint]
 private val mBuffer2 = new ListBuffer[JPXPoint]

  setName("Map")
  setTileSource(new OsmTileSource.Mapnik)
  setTileLoader(new OsmFileCacheTileLoader(this, CACHE_DIR))
  applicationState.addActivityChangeListener(updateMap)
      
  private def updateMap(activityOption:Option[JPX]) {
    onEdt {
      zoomToActivity(activityOption)
      repaint()
    }
  }
  
  private def boundingBox(coordinates:List[Coordinate]) = {
    var lati = coordinates.map (_.getLat)
    var longi = coordinates.map (_.getLon)
    var north = lati.sortWith(_ > _).head
    var south = lati.sortWith(_>_).last
    var west = longi.sortWith(_>_).last
    var east = longi.sortWith(_>_).head
    println ("nord " + north)
    println ("sud " + south)
    println ("est " + east)
    println ("ouest " + west)
    List(new Coordinate(north, west), new Coordinate(south,east))
  }
  
  private def centerBetween(northWest: Coordinate, southEast: Coordinate) = {
    val lat = (northWest.getLat + southEast.getLat) / 2.0
    val lon = (northWest.getLon + southEast.getLon) / 2.0
	  println ("center " + lat + ":" + lon)
    new Coordinate(lat,lon)
  }
  private def trackPoints(activity: JPX) = {
    mBuffer.clear()
    activity.FillListPoints (mBuffer)
    mBuffer.toList
    
  }
  private def ParcoursPoints(activity: JPX) = {
    mBuffer2.clear()
    activity.FillParcoursPoints (mBuffer2)
    mBuffer2.toList
    
  }
  private def zoomToActivity(activity: Option[JPX]) {
    /** perform these computations in a background thread */
    def doInBackground = {
      val wholeMap = Pair(new Coordinate(-180.0, 90.0),new Coordinate(180.0, -90.0)) 
      if (activity.isDefined) {
        val coordinates = trackPoints(activity.get).filter(tp => (tp.lat != 0.0 && tp.lon != 0.0)).map(tp => new Coordinate(tp.lat, tp.lon))
        if (coordinates.isEmpty) wholeMap
        else {
          val bounds = boundingBox(coordinates)
          Pair(bounds(0), bounds(1))
        }
      } else wholeMap
    }
    
    /** zooming to bounding box has to happen on the EDT */
    def onEdt(bounds: Pair[Coordinate,Coordinate]) {
      val (northWest,southEast) = bounds
      zoomToBoundingBox(northWest, southEast)  
    }
    
    inSwingWorker(doInBackground, onEdt)
  }
  
  private def zoomToBoundingBox(northWest:Coordinate, southEast:Coordinate) {
    val mapZoomMax = tileController.getTileSource.getMaxZoom
    val nwPoint = new Point(OsmMercator.LonToX(northWest.getLon, mapZoomMax),
                            OsmMercator.LatToY(northWest.getLat, mapZoomMax))
    val sePoint = new Point(OsmMercator.LonToX(southEast.getLon, mapZoomMax),
                            OsmMercator.LatToY(southEast.getLat, mapZoomMax))
    var width = sePoint.x - nwPoint.x
    var height = sePoint.y - nwPoint.y
    
    var zoomLevel = mapZoomMax
    while(width > getWidth || height > getHeight) {
      zoomLevel -= 1
      width >>= 1
      height >>= 1
    }
      
    setZoom(zoomLevel)
   val centerCoordinate = centerBetween(northWest, southEast)
  center = new Point(OsmMercator.LonToX(centerCoordinate.getLon, zoomLevel),
                   OsmMercator.LatToY(centerCoordinate.getLat, zoomLevel))
    repaint()
  }
  
  /** This method should be protected, but I cannot get it to compile if
   it is..
   */
  override def paintComponent(g: Graphics) {
    super.paintComponent(g)
    val listparcours = JPXList.getInstance()
    
    if (applicationState.currentActivity.isEmpty) return
    val activity = applicationState.currentActivity.get
    val l_list_point= trackPoints(activity)
    if (l_list_point.isEmpty) return
    val mapPoints =  l_list_point.filter(tp => (tp.lat != 0.0 && tp.lon != 0.0)).map(tp => getMapPosition(tp.lat, tp.lon, false))
    if (mapPoints.isEmpty) return
      
    val path = new Path2D.Double
    path.moveTo(mapPoints.head.x, mapPoints.head.y)
    mapPoints.tail.foreach {mapPoint => path.lineTo(mapPoint.x, mapPoint.y)}
    val g2d = g.asInstanceOf[Graphics2D]
    g2d.setColor(new Color(1.0f, 0.5f, 0, 0.5f))
	g2d.setStroke(new BasicStroke(4, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND))
	g2d.draw(path)
  }
}
