package importer

import java.io.{File,FileInputStream,FileNotFoundException}
import scala.collection._
import RunnerGui.ApplicationState
import jpx._
import com.google.inject.{Inject,Provider}
import RunnerGui.LoggerHelper
import processing.core.PApplet;

import scala.collection.JavaConversions._

/**
 * Importer for Tcx,gpx and jpx files.
 * @param applicationState the Application's State
 * @param tcxParserProvider provider which generates TcxParser objects.
 */
class TcxImporterImpl @Inject() (applicationState: ApplicationState) 
    extends TcxImporter with LoggerHelper {
   private val m_PApplet : PApplet = new PApplet() 
  /**
   * Import a file. Sends the contents of the tcxFile to a tcx parser. On 
   * succesful parsing, sets the parsed activity as the current activity
   * in the program.
   * @param tcxFile file holding activity.
   * @throws TcxImportException if anything goes wrong.
   */
  @throws(classOf[TcxImportException])
  override def importTcx(eFile: File) {
       val  jpx : JPX = new JPX(m_PApplet);
				      jpx.setsName(eFile.getName());
				      jpx.parse(eFile.getAbsolutePath());
      applicationState.currentActivity = Some(jpx);
    }
  }         

