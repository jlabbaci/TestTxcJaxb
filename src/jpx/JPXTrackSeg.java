package jpx;
import java.util.Collections;
import java.util.Date;
import java.util.Vector;

import processing.data.XML;
import tcx.PositionT;
import tcx.TrackT;
import tcx.TrackpointT;

/** a collection of GPXPoint objects, with type-safe convenience methods for adding/removing/getting points */
public class JPXTrackSeg extends Vector<JPXPoint> {

  private JPXPoint ptNorthWest;

  private JPXPoint ptSouthEast;

public JPXTrackSeg(TrackT l_Trackseg) {
	 int l_pos =0;
	  for (TrackpointT l_Pt : l_Trackseg.getTrackpoint()) {
		  PositionT L_coord = l_Pt.getPosition();
		  if (L_coord != null)
		  {
			  l_pos++;
			  JPXPoint l_point = new JPXPoint(l_Pt);
			  l_point.idf=l_pos;
			  addPoint(l_point);
		  }
		
    }
    setNothWestSouthEast();
 //   System.out.println("sud est : " + this.ptSouthEast.getDouble("lon",0.0));
	  
}

  public JPXTrackSeg(XML trkseg) {
	  int l_pos =0;
    for (XML child : trkseg.getChildren("trkpt")) {
    	JPXPoint l_point = new JPXPoint(child);
    	l_point.idf=l_pos++;
      addPoint(l_point);
    }
    setNothWestSouthEast();
  }

  public void addPoint(JPXPoint trkpt) {
    this.addElement(trkpt);
  }
  public JPXPoint getNothWest()
  {
	  
	  return (ptNorthWest);
			  
  }
  public JPXPoint getPoint(int i) {
    return get(i);
  }
  
  public JPXPoint getSouthEast()
  {
	  
	  return (ptSouthEast);
			  
  }
  public void removePoint(JPXPoint trkpt) {
    remove(trkpt);
  }
  private void setNothWestSouthEast()
  {
	  double l_sud,l_nord,l_est,l_ouest;
	  Collections.sort(this);
	  l_sud=this.firstElement().getDouble("lat",0.0);
	  l_nord=this.lastElement().getDouble("lat",0.0);
	  Collections.sort(this,JPXPoint.LONGITUDE_ORDER);
	  l_ouest=this.firstElement().getDouble("lon",0.0);
	  l_est=this.lastElement().getDouble("lon",0.0);
	  ptNorthWest = new JPXPoint( l_nord,l_ouest,0.0)  ;
	  ptSouthEast = new JPXPoint( l_sud,l_est,0.0)  ;
	  Collections.sort(this,JPXPoint.POSITION_ORDER);
  }
}

