package RunnerGui.chart

import java.awt.geom.Path2D
import java.awt.{BasicStroke,Color,Graphics2D,RenderingHints}
import java.awt.image.BufferedImage

import scala.collection._
import scala.collection.mutable.ListBuffer
import scala.collection.JavaConversions._


//import org.joda.time.Duration

import RunnerGui.LoggerHelper
import jpx.JPX
import jpx.JPXPoint
import jpx.JPXTrack

private object AltitudeDiagramPainter {
  private val LeftOffset = 30
  private val RightOffset = 30
  private val TopOffset = 10
  private val BottomOffset = 10
  private val AltitudeColor = new Color(0xc5af06)
  private val GuideColor = Color.black
  private val MaximumTicks = 10
  private val TickLength = 5
  private val MinimumPixelsPerTick = 100
}
class AltitudeDiagramPainter extends LoggerHelper {
  import AltitudeDiagramPainter._
  
  def paintDiagram(activity: JPX, image: BufferedImage) = {
    val g2d = image.createGraphics
    g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
    
    val width = image.getWidth
    val height = image.getHeight
    
    paintAltitude(activity, g2d, width, height)  
    paintScaleLine(activity, g2d, width, height)
  }
private def trackPoints(e_activity: JPX) = {
    var buffer = new ListBuffer[JPXPoint]
    //e_activity.FillListPoints(buffer)
   
       
    buffer.toList
  }  
	
  private def paintAltitude(activity: JPX, g2d: Graphics2D,
                            width: Int, height: Int) = {
    val minAltitude = 0.0 
    //val minAltitude = 0.0 min activity.minimumAltitude.siValue
    val maxAltitude = 1000.0
    
    val altitudeRange = maxAltitude - minAltitude
    var durationInSeconds = 0.0 ///altitude/activity.grossDuration.seconds
      var distance:Double = 0.0
      var nrLaps =0
     val laps: List[JPXTrack] = activity.getLap().toList
   	   laps.foreach{l_lap =>
	    		 nrLaps += 1;
      distance += 1;// l_lap.getDistanceMeters();
      durationInSeconds +=2;// l_lap.getTotalTimeSeconds();
      }  
    val path = new Path2D.Double
    path.moveTo(LeftOffset, height - BottomOffset)
    
    def xt = xForTrackPoint(activity, width)_
    def yt = yForTrackPoint(height, minAltitude, altitudeRange)_
    
    def nextPoint(trackPoint:JPXPoint) = {
      val x = xt(trackPoint)
      val y = yt(trackPoint)
      
      path.lineTo(x,y)
    }
    
    val l_trackPoints = trackPoints(activity)
    l_trackPoints.foreach(nextPoint)
    
    path.lineTo(xt(l_trackPoints.last), height - BottomOffset)
    path.closePath
    g2d.setColor(AltitudeColor)
    g2d.fill(path)
  }
  
  private def paintScaleLine(activity: JPX, g2d: Graphics2D,
			width: Int, height: Int) = {
    g2d.setColor(GuideColor)
	g2d.drawLine(LeftOffset, TopOffset, LeftOffset, height - BottomOffset);
	drawAltitudeTicks(activity, g2d, width, height);
  }
  
  private def drawAltitudeTicks(activity: JPX, g2d: Graphics2D,
			width: Int, height: Int) = {
    val ys = determineYsOfTicks(height)
    
    for (y <- ys) {
      g2d.drawLine(LeftOffset, y, LeftOffset - TickLength, y)
    }
    
    val dashPattern = List[Float](1, 10)
    g2d.setColor(Color.gray)
    val oldStroke = g2d.getStroke
    g2d.setStroke(new BasicStroke(1, BasicStroke.CAP_SQUARE,
                                  BasicStroke.JOIN_BEVEL,
                                  10, dashPattern.toArray, 0))
    for (y <- ys) {
      g2d.drawLine(LeftOffset, y, width - RightOffset, y)
    }
    g2d.setStroke(oldStroke)
  }
  
  private def determineYsOfTicks(height: Int): List[Int] = {
    val heightMinusOffsets = height - TopOffset - BottomOffset
    val nrOfTicks = MaximumTicks max (heightMinusOffsets / MinimumPixelsPerTick)
	val pixelsPerTick = heightMinusOffsets.asInstanceOf[Double] / (nrOfTicks - 1)
    
    var ys: List[Int] = List[Int]()
    
    for(tickNr <- 0 until nrOfTicks) {
      val y = - tickNr * pixelsPerTick
      
      ys = y.asInstanceOf[Int] :: ys
    }
    
    ys.map (y => y + heightMinusOffsets + TopOffset)
  }
    
  private def xForTrackPoint(activity: JPX, width: Int)(trackPoint: JPXPoint): Double = {
    (width - LeftOffset - RightOffset) * (trackPoint.getDouble("lon",0.0) / 30000.0) + LeftOffset
  }
   
  private def yForTrackPoint(height: Int, minAltitude: Double, 
                             altitudeRange: Double)
  							(trackPoint: JPXPoint): Double = {
    val relativeAltitude= (trackPoint.getDouble("ele",0.0)  - minAltitude) / altitudeRange 
    height - relativeAltitude * (height - BottomOffset - TopOffset) - BottomOffset
  }
}
