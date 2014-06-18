package RunnerGui

import java.awt.BorderLayout
//import javax.swing._
import BorderLayout._
import javax.swing.border.TitledBorder
import scala.swing._
import com.google.inject.Inject

class ScalaOverviewPanel @Inject() (summaryPanel:ScalaSummaryPanel,
	map: ScalaMapViewer,map2: ScalaMapViewer, chartComponent: ScalaChartComponent) extends GridPanel(2,2) {
  
  contents += new BorderPanel {
    border = new TitledBorder("Summary")
    this.peer.add(summaryPanel, BorderLayout.CENTER)
  }
  contents += new BorderPanel {
    border = new TitledBorder("Map")
    this.peer.add(map)
  }
//  contents += new BorderPanel {
//    border = new TitledBorder("Map details")
//    this.peer.add(map2)
//  }
//  
  contents += new BorderPanel {
    border = new TitledBorder("Chart")
    add(chartComponent, BorderPanel.Position.Center)
  }
}
