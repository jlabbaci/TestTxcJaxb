package  RunnerGui

import java.awt.{Color,Graphics,Graphics2D,GraphicsEnvironment}
import java.beans.{PropertyChangeEvent,PropertyChangeListener}
import scala.swing._
import com.google.inject.Inject

import RunnerGui.chart.AltitudeDiagramPainter
import jpx._
//import RunnerGui.LoggerHelper
import scala.collection._
import scala.collection.mutable.ListBuffer
import scala.collection.JavaConversions._


class ScalaChartComponent @Inject() 
	(val applicationState:ApplicationState,
	 val altitudeDiagramPainter: AltitudeDiagramPainter) 
	extends Component with LoggerHelper {
  applicationState.addActivityChangeListener(updateChart)
 
  private def updateChart(activityOption:Option[JPX]) = repaint
  
private def trackPoints(activity: JPX) = {
    var buffer = new ListBuffer[JPXPoint]
     val laps: List[JPXTrack] = activity.getLap().toList
  laps.foreach{l_lap =>
    l_lap.toList.foreach{l_track =>
      buffer ++= l_track.toList
    }
    }
    buffer.toList
  }  
  def reactToNewActivity: PropertyChangeListener = {
	new PropertyChangeListener {
	  def propertyChange(event: PropertyChangeEvent) = {
	    repaint
	  }
	}
  }
  
//  protected override def paintComponent(g: Graphics) = {
  //  val g2d = g.asInstanceOf[Graphics2D]
  //  g2d.setBackground(Color.white)
//	g2d.clearRect(0, 0, size.width, size.height)
 
	//val currentActivity = applicationState.currentActivity
//	if (currentActivity.isDefined) {
	//  drawChart(g2d, currentActivity.get)
//	}
 // }
  
  private def drawChart(g2d: Graphics2D, activity: JPX) = {
    val graphImage = GraphicsEnvironment
		.getLocalGraphicsEnvironment().getDefaultScreenDevice()
		.getDefaultConfiguration().createCompatibleImage(
		size.width, size.height)
		
	val imageGraphics = graphImage.createGraphics
	imageGraphics.setBackground(Color.white);
	imageGraphics.clearRect(0, 0, graphImage.getWidth, graphImage.getHeight);
		
    println("calling painter")
	altitudeDiagramPainter.paintDiagram(activity, graphImage)
	g2d.drawImage(graphImage, 0, 0, null)
  }

}
