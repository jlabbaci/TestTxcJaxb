package jpx;

/*

Copyright (c) 2006-2011 Tom Carden

This library is free software; you can redistribute it and/or
modify it under the terms of the GNU Lesser General Public
License as published by the Free Software Foundation; either
version 2.1 of the License, or (at your option) any later version.

This library is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
Lesser General Public License for more details.

You should have received a copy of the GNU Lesser General
Public License along with this library; if not, write to the
Free Software Foundation, Inc., 59 Temple Place, Suite 330,
Boston, MA 02111-1307 USA

*/


import java.util.List;
import java.util.Vector;

import processing.data.XML;
import tcx.ActivityLapT;
import tcx.TrackT;

/** a collection of GPXTrackSeg objects, with type-safe convenience methods for adding/removing/getting track segments */
public class JPXTrack extends Vector<JPXTrackSeg> {

  public String name;

  public JPXTrack(ActivityLapT l_lap) {
	// TODO Auto-generated constructor stub
	 	List<TrackT> laps = l_lap.getTrack();
    	
    	for(TrackT l_Trackseg : laps){
    		this.addTrackSeg(new JPXTrackSeg (l_Trackseg));
    		
    	}
}

  public JPXTrack(XML xmltrk) {
    this.name = xmltrk.getChild("name").getContent();
    for (XML child : xmltrk.getChildren("trkseg")) {
      this.addTrackSeg(new JPXTrackSeg(child));
    }
  }

public void addTrackSeg(JPXTrackSeg trkseg) {
    addElement(trkseg);
  }

  public JPXTrackSeg getTrackSeg(int i) {
    return elementAt(i);
  }

  public void removeTrackSeg(JPXTrackSeg trkseg) {
    removeElement(trkseg);
  }

}
