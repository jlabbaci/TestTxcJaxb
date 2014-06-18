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

package jpx;

import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;
import java.util.GregorianCalendar;


import processing.data.XML;
import processing.data.JSONObject;
import tcx.TrackpointT;
import javax.xml.datatype.XMLGregorianCalendar;
//import javax.xml.datatype.Duration;

/** simple GPX point, only understands latitude, longitude, elevation and time
FIXME extend parsing to understand other properties */
public class JPXPoint extends JSONObject implements Comparable<JPXPoint> {

  static final Comparator<JPXPoint> LONGITUDE_ORDER = 
	                                        new Comparator<JPXPoint>() {
	            @Override
				public int compare(JPXPoint e1, JPXPoint e2) {
	                if (e1.lon<e2.lon) 
	                    return 0;
	                    else 
	                  	  return 1;
	            }
	   
  };
  public static final Comparator<JPXPoint> POSITION_ORDER = 
          new Comparator<JPXPoint>() {
@Override
public int compare(JPXPoint e1, JPXPoint e2) {
if (e1.idf<e2.idf) 
return 0;
else 
return 1;
}

};

private static final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'hh:mm:ssZ");
private static final SimpleDateFormat msdateFormat = new SimpleDateFormat("yyyy-MM-dd'T'hh:mm:ss.SSS'Z'z"); // allow millis too
  public double ele;
  public double lat;
  public double lon;
  public double distance;
  public int idf;

  public GregorianCalendar IdTime= new GregorianCalendar();
  //private SimpleTimeZone pdt = new SimpleTimeZone(-0 * 60 * 60 * 1000, "GMT");

  public JPXPoint() {
    this.lat = 0.0;
    this.lon = 0.0;
    this.ele = 0.0;
    this.distance =0.0;
    this.idf = 0;
   // IdTime = new GregorianCalendar();
    IdTime.setTime( new Date());
    this.setDouble("lat", 0.0);
    this.setDouble("lon",0.0);
  }
  public JPXPoint(double lat, double lon, double ele) {
	  this(lat, lon, ele, null,0.0);
  }
    public JPXPoint(double lat, double lon, double ele, GregorianCalendar time) {
	  this(lat, lon, ele, time,0.0);
  }
  private JPXPoint(double lat2, double lon2, double ele2, GregorianCalendar time2,
		double d) {
	    this.setDouble("lat", lat2);
	    this.setDouble("lon",lon2);
	 	
	  this.lat = lat2;
	    this.lon = lon2;
	    this.ele = ele2;
	    this.distance= d;
	    if (time2 != null){
	    this.IdTime = time2;
	    }
	    else
	    	this.IdTime.setTime( new Date());
	    this.idf=0;
}

public JPXPoint(TrackpointT Pt){
	  
    this.setDouble("lat", Pt.getPosition().getLatitudeDegrees());
    this.setDouble("lon",Pt.getPosition().getLongitudeDegrees());
	  this.lat=Pt.getPosition().getLatitudeDegrees();
	  this.lon=Pt.getPosition().getLongitudeDegrees();
	 // System.out.println("lon : " + lon);
	  this.distance = Pt.getDistanceMeters();	  
	  this.ele=Pt.getAltitudeMeters();
	//  Date l_date;
	//  l_date = new Date();
	  XMLGregorianCalendar l_t= Pt.getTime();
	 this.IdTime= l_t.toGregorianCalendar();
  }

  /** parses a GPXPoint from the given XML
understands 2 time formats: ISO 8601 with and without milliseconds */
  public JPXPoint(XML trkpt) {

    // NB:- this is a bit more complex than it should be
    // but it should handle a wider variety of broken
    // GPX files, and let's face it that's why you're using
    // a library instead of parsing this file yourself

    try {
      String sLat = trkpt.getString("lat");
      this.lat = Double.parseDouble(sLat);
    }
    catch (Exception e) {
      if (JPX.debug) {
        e.printStackTrace();
        System.err.println("error parsing lat in: " + trkpt);
      }
      this.lat = 0.0;
    }
    try {
      String sLon = trkpt.getString("lon");
      this.lon = Double.parseDouble(sLon);
    }
    catch (Exception e) {
      if (JPX.debug) {
        e.printStackTrace();
        System.err.println("error parsing lon in: " + trkpt);
      }
      this.lon = 0.0;
    }

    for (XML element : trkpt.getChildren()) {
      if (element.getName().equals("ele")) {
        try {
          String sEle = element.getContent();
          this.ele = Double.parseDouble(sEle);
        }
        catch (Exception e) {
          if (JPX.debug) {
            e.printStackTrace();
            System.err.println("error parsing ele in: " + trkpt);
          }
          this.ele = 0.0;
        }
      }
      else if (element.getName().equals("time")) {
        String t = element.getContent();
        Date l_date;
        try {
          if (t.length() == 20) {
        	  l_date = dateFormat.parse(t);
          }
          else if (t.length() == 24) {
        	  String l_new= t+ "GMT";
        	  l_date = msdateFormat.parse(l_new);
        	//  System.out.println(l_date.toGMTString() + " - " + l_date.toLocaleString());
        	 
          }
          else {
        	  l_date = new Date(Long.parseLong(t)); // try for unix time
        	 
          }
          IdTime.setTime(l_date);
      //    IdTime.setTimeZone(pdt);
        }
        catch(Exception e) {
          if (JPX.debug) {
            e.printStackTrace();
            System.err.println("error parsing time in: " + trkpt);
          }
          this.IdTime.setTime( new Date());
        }
      }
      else {
        if (JPX.debug) {
       //   System.err.print("skipping unknown element: ");
       //   System.err.println(element.getName());
        }
      }
    }
    this.setDouble("lat", this.lat);
    this.setDouble("lon",this.lon);

  }
  @Override
public int compareTo(JPXPoint n) {
      if (n.lat<this.lat) 
      return 1;
      else 
    	  return 0;
  }

  public boolean IsEqual(JPXPoint n) {
      double d;
	  d= Math.abs(n.lat-this.lat) +Math.abs(n.lon-this.lon);
      if (d< 1e-7)
    	  return true;
      else 
    	  return false;
  }

}
