package RunnerGui

import java.awt.datatransfer.{DataFlavor,Transferable}
import java.io.File
import java.net.URI
import java.util.concurrent.Executors
import java.util.AbstractCollection
import javax.swing.TransferHandler
import TransferHandler.TransferSupport

import com.google.inject.Inject
import importer._

//import tcx._

/**
 * Implementation of the file transfer handler. This class is used
 * to allow dropping of files onto the GUI. It will then send all those
 * files to the importer.
 */
class ScalaFileTransferHandler @Inject() (applicationState:ApplicationState, importer: TcxImporter) 
	extends TransferHandler with LoggerHelper {
  val uriListDataFlavor = new DataFlavor("text/uri-list;class=java.lang.String")
  val executor = Executors.newSingleThreadExecutor()
  
  override def canImport(support: TransferSupport): Boolean = {
    (support.isDrop && (
      support.isDataFlavorSupported(uriListDataFlavor) || support.isDataFlavorSupported(DataFlavor.javaFileListFlavor)
    ))
  }
  
  private def extractFilesFromUriList(transferable: Transferable): List[File] = {
    transferable.getTransferData(uriListDataFlavor)
      .asInstanceOf[String]
      .split("\n").toList
      .map(str=> new File(new URI(str.trim)))
  }
  
  private def extractFilesFromJavaFileList(transferable: Transferable): List[File] = {
    val l_arraylist = transferable.getTransferData(DataFlavor.javaFileListFlavor)
    val l_list = l_arraylist.asInstanceOf[java.util.AbstractCollection[File]].toArray.toList
    println("cast DONE\n")
      return l_list.asInstanceOf[List[File]]
      
 //   transferable.getTransferData(DataFlavor.javaFileListFlavor).asInstanceOf[List[File]]
  }
  
  private def extractFileList(support: TransferSupport): List[File] = {
    val transferable = support.getTransferable
    
    if (support.isDataFlavorSupported(uriListDataFlavor)) {
      extractFilesFromUriList(transferable)
    } else {
      extractFilesFromJavaFileList(transferable) 
    }
  }
  
  override def importData(support: TransferSupport): Boolean = {
    if (canImport(support)) {
      debug("Can import!")
      
      
      val files:List[File] = try {
        extractFileList(support)
      } catch {
        case e:Exception => {
          println("Cannot except drop"+e)
          null
          //val list2:List[File]= new List
          //ficdefaut
        }
      }
      parseFiles(files)
      
      true
    } else {
      false
    }
  }
  
  private def parseFiles(files: List[File]): Unit = {
    executor.execute(new Runnable {
      def run = {
        if (files == null ){ 
     val ficdefaut: File = new File ("C:\\Users\\jacques\\AppData\\Roaming\\GARMIN\\Devices\\3815048768\\History\\2012-04-03-190601.TCX")
            importer.importTcx(ficdefaut)
        }
        else
        {
        files.foreach { file =>
          try {
            importer.importTcx(file)
          } catch {
            case e: TcxImportException => applicationState.errorMessage = Some(e.getMessage)
          }
        }
        }
      }
    })
  }
}
