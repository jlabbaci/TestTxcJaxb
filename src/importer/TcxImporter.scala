package importer

import java.io.File

/**
 * Interface for importer for tcx  and gpx files.
 * @author "Ilja Booij <ibooij@gmail.com>"
 */
trait TcxImporter {
  /**
   * Import a tcx or gpx file
   * @param tcxFile the file to import
   * @throws TcxImportException if there was an error importing the tcx file
   */
  def importTcx(eFile: File)
}
