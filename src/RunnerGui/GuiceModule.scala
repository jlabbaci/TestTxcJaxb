package RunnerGui

import com.google.inject.Binder
import com.google.inject.Module
import com.google.inject.matcher.Matchers

import tcx._
import importer._

/**
 * Module file for Guice.
 */
class GuiceModule extends Module {
	override def configure(binder: Binder) {
		binder.bind(classOf[ApplicationState]).to(classOf[ApplicationStateImpl])
		binder.bind(classOf[TcxImporter]).to(classOf[TcxImporterImpl])
	}
}
