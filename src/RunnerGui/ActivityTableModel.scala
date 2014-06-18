package RunnerGui

import javax.swing.table.AbstractTableModel
import com.google.inject.Inject
import jpx._
import scala.collection._
import scala.collection.mutable.ListBuffer
import scala.collection.JavaConversions._

class ActivityTableModel @Inject() (private val applicationState:ApplicationState) 
    extends AbstractTableModel with SwingHelper {
  private val columns = List("Id", "Lat", "Lon", 
                             "Time", "Speed", "Heart Rate")
  applicationState.addActivityChangeListener(updateTable)
  private val buffer = new ListBuffer[JPXPoint]

  /**
   * Get the value for the cell at [RowwIndex, ColumnIndex] 
   */
  private def trackPoints(activity: JPX) = {
    buffer.clear()
    activity.FillListPoints (buffer)
    buffer.toList
  }
  override def getValueAt(rowIndex:Int, columnIndex:Int): Object = {
    applicationState.currentActivity match {
      case None => null
      case Some(activity) => {
        val trackPoint = trackPoints(activity)(rowIndex)
        val column = columns(columnIndex)
        column match {
          case "Id" => 
          //  val fromStart = new Duration(activity.startTime, trackPoint.time)
            "" + trackPoint.idf
          case "Lat" => "" + (trackPoint.getDouble("lat") )
          case "Lon" => " " + trackPoint.getDouble("lat") 
          case "Time" => trackPoint.IdTime.getTime().toLocaleString()
          case "Heart Rate" => "" + "0.0"
          case "Speed" => "0.0"
          case _ => "unknown"
        }
      }
    }
  }
  
  override def getRowCount: Int = {
    applicationState.currentActivity match {
      case None => 0
      case Some(activity) => trackPoints(activity).size
    }
  }
  
  override def getColumnCount:Int = columns.length
  
  override def getColumnName(columnIndex:Int): String = columns(columnIndex)
    
  /**
   * Creates a new PropertyChangeListener that updates the model when needed. 
   */
  private def updateTable(activityOption: Option[JPX]) {
    onEdt(fireTableDataChanged)
  }
}
