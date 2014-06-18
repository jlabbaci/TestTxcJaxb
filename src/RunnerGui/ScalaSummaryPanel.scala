package RunnerGui

import javax.swing.{JLabel,JPanel,SpringLayout}
import scala.swing.{Label,LayoutContainer,Panel}
import com.google.inject.Inject
import java.util.{Date, Locale}
import java.text.DateFormat
import java.text.DateFormat._
import jpx._
import scala.collection.JavaConversions._
import java.awt.Dimension

class ScalaSummaryPanel @Inject() (
    state:ApplicationState
    ) 
	extends JPanel with SwingHelper {
  setLayout(new SpringLayout())
  
  val dateLabel = new JLabel
  val distanceLabel = new JLabel
  val totalTimeLabel = new JLabel
  val notesLabel = new JLabel
  val lapsLabel = new JLabel
  val climbedLabel = new JLabel
  
  add(new JLabel("Date")) 
  add(dateLabel)
  add(new JLabel("Distance"))
  add(distanceLabel)
  add(new JLabel("Total Time"))
  add(totalTimeLabel)
  add(new JLabel("Notes"))
  add(notesLabel)
  add(new JLabel("Nr of Laps"))
  add(lapsLabel)
  add(new JLabel("Meters Climbed"))
  add(climbedLabel)
  
  ScalaSpringUtilities.makeGrid(this, 6, 2, 5, 5, 5, 5)
  
  state.addActivityChangeListener(updateSummary)
  
  private def updateSummary(activity:Option[JPX]) {
   // def durationToString(duration:DurationT) = {
   //   val period = duration.toString()
	
  //  }
    
    def doInBackground(activity: JPX):Map[String,String] = {
 
     //   println (df.format(date))
  	  var distance:Double = 0.0
      var nrLaps =0
      var netDuration = 0.0
     val laps: List[JPXTrack] = activity.getLap().toList
     val startTime = laps.get(0).get(0).getPoint(0).IdTime.getTime().toLocaleString()
      
      
   	   laps.foreach{l_lap =>
	    		 nrLaps += 1;
           }
  	  
      val notes = "Test " //activity.getNotes()
      val altitudeGain = 0
      Map("startTime" -> startTime,
          "distance" -> distance.toString(),
          "nrOfLaps" -> nrLaps.toString(),
          "notes" -> notes,
          "netDuration" -> netDuration.toString(),
          "altitudeGain" -> altitudeGain.toString()
      )
    }
    
    /**
     * The SwingWorker will perform this method on the Swing Event Dispatch Thread.
     */
    def done(values: Map[String,String]) {
      assert(isEdt)
      dateLabel.setText(values("startTime"))
      distanceLabel.setText(values("distance"))
      lapsLabel.setText(values("nrOfLaps"))
      notesLabel.setText(values("notes"))
      totalTimeLabel.setText(values("netDuration"))
      climbedLabel.setText(values("altitudeGain"))
    }
      
    if (activity.isDefined) 
      inSwingWorker(doInBackground(activity.get), done)
  }
}
