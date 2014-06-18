package jpx;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Vector;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.datatype.XMLGregorianCalendar;

import processing.core.PApplet;
import processing.data.XML;
import processing.data.JSONObject;
import tcx.ActivityLapT;
import tcx.ActivityListT;
import tcx.ActivityT;
import tcx.TrainingCenterDatabaseT;

// GPX is an activity for TCX formalism which contains a list of LAP which contain one list of TrckPoint
// GPX is a list of TRK ( LAP)
public class JPX {
	private static final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'hh:mm:ssZ");
	private static final SimpleDateFormat msdateFormat = new SimpleDateFormat("yyyy-MM-dd'T'hh:mm:ss.SSS'Z'z"); // allow millis too

	  public static boolean debug = false;
	  
	  private boolean hasTime = false;
	  private boolean hasName = false;
	  
	  PApplet parent;
	  private JPXPoint ptNorthWest;
	  
	  private JPXPoint ptSouthEast;
	  private String sName;
	  public GregorianCalendar StartTime= new GregorianCalendar();
	  public GregorianCalendar EndTime= new GregorianCalendar();
		  
	  
	  private List<JPXTrack> tracks = new ArrayList<JPXTrack>();

	  private Vector<GPXWayPoint> wayPoints = new Vector<GPXWayPoint>();
	  public JPX(PApplet parent) {
	    this.parent = parent;
	    ptNorthWest= new JPXPoint();
	    ptSouthEast= new JPXPoint();
	    
	  }

	  public void addTrack(JPXTrack trk) {
	    tracks.add(trk);
	  }

	  public void addWayPoint(GPXWayPoint wpt) {
	    wayPoints.addElement(wpt);
	  }
	  
	  public void  FillListPoints (List<JPXPoint> e_buff)
	  {
			for(JPXTrack l_lap : this.tracks){
	    		for (JPXTrackSeg l_track : l_lap)
	    		{
	    			Collections.sort(l_track,JPXPoint.POSITION_ORDER);
	    			e_buff.addAll( l_track);
	    		}
	    	}
		//	Collections.sort(e_buff,GPXPoint.POSITION_ORDER);
	  }
	  public void  FillParcoursPoints (List<JPXPoint> e_buff)
	  {
		    JPXList listparcours = JPXList.getInstance();
		      //listparcours.setparent(l_applet);
		      //listparcours.LoadParcours(args[0]);
		      JPXLapSeg gpx;
	        int lnumtrack =0;
	    	for(JPXTrack l_lap : this.tracks){
	    		for (JPXTrackSeg l_track : l_lap)
	    		{
	    			lnumtrack++;
	    		  for (int l_i = 0; l_i < listparcours.getParcours().size(); l_i++) 
	   	          {
	   	        	  gpx = listparcours.getParcours().get(l_i);
	   	     	      // System.out.println( gpx.Name + " : "+ gpx.IdLapSeg);
	   	    	    
	   			         // JPXPoint pt2 = ;
	   			       //   System.out.println("limite Nord WEst (" + pt2.lat + "," + pt2.lon + ")");
	   			       //JPXPoint pt3 = gpx.ptSouthEast;
	   			         // System.out.println("limite Sud Est (" + pt2.lat + "," + pt2.lon + ")");
	   			    if (
	   			    		gpx.ptNorthWest.IsEqual(l_track.getNothWest()) && 
	   			    		gpx.ptSouthEast.IsEqual(l_track.getSouthEast())
	   			    		){
	   			    	System.out.println("portion num " + lnumtrack + " :Identified " + gpx.Name + " : "+ gpx.IdLapSeg);
	   			    	//Collections.sort(l_track,JPXPoint.POSITION_ORDER);
		    			//e_buff.addAll( l_track);
	   			    }
	   	           }			
	    		}
	    	}
		//	Collections.sort(e_buff,GPXPoint.POSITION_ORDER);
	  }
	  public void getDataFromActi(ActivityT acti) {
		 	List<ActivityLapT> laps = acti.getLap();
	    	
    	for(ActivityLapT l_lap : laps){
    		addTrack(new JPXTrack(l_lap));
    		
    	}
    	/* recherhce min max lat et lon */
	      SetBounds();
	}

	  public List<JPXTrack> getLap () {
		  return tracks ;
		  }

	public JPXPoint getNothWest()
	  {
		  
		  return (ptNorthWest);
				  
	  }

	public String getsName() {
		return sName;
	}

	  public JPXPoint getSouthEast()
	  {
		  
		  return (ptSouthEast);
				  
	  }

	  public JPXTrack getTrack(int i) {
	    return tracks.get(i);
	  }

	  public int getTrackCount() {
	    return tracks.size();
	  }

	  /* WayPoints */

	  public GPXWayPoint getWayPoint(int i) {
	    return wayPoints.elementAt(i);
	  }

	  public int getWayPointCount() {
	    return wayPoints.size();
	  }

	  public void parse(String url) {
	    try {
	    if (url.contains(".gpx"))
	    {
	      XML xmldata = parent.loadXML(url);
	      for (XML xmlthing : xmldata.getChildren()) {
	        if (xmlthing.getName().equals("trk")) {
	          addTrack(new JPXTrack(xmlthing));
	        }
	        else if (xmlthing.getName().equals("wpt")) {
	          addWayPoint(new GPXWayPoint(xmlthing));
	        }
	        else if (xmlthing.getName().equals("metadata")) {
		          for (XML element : xmlthing.getChildren()) {
		        	  if (element.getName().equals("time")) {
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
		        	          this.StartTime.setTime(l_date);
		        	          this.EndTime.setTime(l_date);
		        	          this.hasTime=true;
		        	        }
		        	        catch(Exception e) {
		        	          if (JPX.debug) {
		        	            e.printStackTrace();
		        	            System.err.println("error parsing time in: " + element);
		        	          }
		        	          
		        	        }
		        	      }
		        }
	        }
	      }
	      }
	      else if (url.contains(".tcx"))
	      {
	    	  try{
	    		// create a JAXBContext capable of handling classes generated into
	    	       // the primer.po package
	    	       JAXBContext jc = JAXBContext.newInstance( "tcx" );
	    	       
	    	       // create an Unmarshaller
	    	       Unmarshaller u = jc.createUnmarshaller();
	            // unmarshal a po instance document into a tree of Java content
		            // objects composed of classes from the primer.po package.
		           JAXBElement l_poe = 
		                (JAXBElement)u.unmarshal( new FileInputStream(url ) );
		            TrainingCenterDatabaseT po = (TrainingCenterDatabaseT)l_poe.getValue();

		            // 
		            ActivityListT list_act = po.getActivities();
		            ActivityT acti=list_act.getActivity().get(0);
		            this.StartTime=acti.getId().toGregorianCalendar();
		            this.hasTime=true;
		   	        getDataFromActi(acti);
		   	        this.EndTime=this.StartTime;
				     
		   	        
				  } catch( IOException ioe ) {
			            ioe.printStackTrace();
			        }
	    	  		catch( JAXBException je ) {
			            je.printStackTrace();
	    	  
	    	  		}
	      }
	    	  
	      /* recherhce min max lat et lon */
	      SetBounds();
	    }
	    catch(Exception e) {
	      e.printStackTrace();
	    }
	  }

	  public void removeTrack(JPXTrack trk) {
	    tracks.remove(trk);
	  }
	  
	  public void removeWayPoint(GPXWayPoint wpt) {
	    wayPoints.removeElement(wpt);
	  }
	  

	  public void SetBounds() {
		    try {
		      
		      /* recherhce min max lat et lon */
		      for (int i = 0; i < getTrackCount(); i++) {
			        JPXTrack trk = getTrack(i);
			        for (int j = 0; j < trk.size(); j++) {
			          JPXTrackSeg trkseg = trk.getTrackSeg(j);
			          if ((i==0) && (j== 0))
			          {
			        	  this.ptNorthWest=trkseg.getNothWest();
			        	  this.ptSouthEast=trkseg.getSouthEast();
			          }
			          else
			          {
				          JPXPoint pt2 = trkseg.getNothWest();
			       // 	  System.out.println("limite Nord WEst (" + pt2.lat + "," + pt2.lon + ")");
			        	  if (pt2.lat >this.ptNorthWest.lat ) this.ptNorthWest.lat= pt2.lat;
			        	  if (pt2.lon <this.ptNorthWest.lon ) this.ptNorthWest.lon= pt2.lon;
			          
			        	  pt2 = trkseg.getSouthEast();
			        //	  System.out.println("limite Sud Est (" + pt2.lat + "," + pt2.lon + ")");
			        	  if (pt2.lat <this.ptSouthEast.lat ) this.ptSouthEast.lat= pt2.lat;
			        	  if (pt2.lon >this.ptSouthEast.lon ) this.ptSouthEast.lon= pt2.lon;
			          }
			        }
		      }
		      //   System.out.println("gpx limite Nord WEst (" + ptNorthWest.lat + "," + ptNorthWest.lon + ")");
		     //     System.out.println("gpx limite Sud Est (" + ptSouthEast.lat + "," + ptSouthEast.lon + ")");


		    }
		    catch(Exception e) {
		      e.printStackTrace();
		    }
		  }
	  /* Tracks */
	public void setsName(String sName) {
		this.sName = sName;
	}
	
	// Testing program
	public static void main(String[] args) {
		PApplet l_Applet = new PApplet ();
	    if (args.length >= 1) {
	      System.out.println("Read " + args[0] + "... ");
          String l_dirin,l_FileToread;
          l_dirin =args[0];
          File[] listOfFiles;
          if (args.length >= 2)
          {
        	  l_FileToread = args[1];
        	  listOfFiles= new File [1];
        	  File folder = new File(l_dirin+l_FileToread);
        	  listOfFiles[0]= folder;
          }	  
          else
          {
        	  File folder = new File(l_dirin);
        	  listOfFiles = folder.listFiles();
          }
          String files;
          for (int l_i = 0; l_i < listOfFiles.length; l_i++) 
          {
         
           if (listOfFiles[l_i].isFile())  
        		   
           {
          	  files = l_dirin + listOfFiles[l_i].getName();
    	      System.out.println("Got " + files + "...");
    	       JPX gpx = new JPX(l_Applet);
    	      JPX.debug = true;
    	      gpx.setsName(listOfFiles[l_i].getName());
    	      gpx.parse(files);
		      System.out.println("parsing done." + files);
		      System.out.println("****");
		      System.out.println("name " + gpx.getsName());
		      ArrayList<JPXPoint> l_buf = new ArrayList<JPXPoint>() ;
		      gpx.FillParcoursPoints(l_buf);
		      if (gpx.hasTime)
		      {
		      System.out.println("StartActivity " + gpx.getStartTime().getTime().toLocaleString());
		      System.out.println("EndActivity " + gpx.getStartTime().getTime());
		      }
		      else
		      {
		    	  System.out.println("It's a track with no time indicator");
		      }
			      System.out.println(gpx.getTrackCount() + " tracks parsed:");
		      for (int i = 0; i < gpx.getTrackCount(); i++) {
		        JPXTrack trk = gpx.getTrack(i);
		        System.out.println("Track " + i + " has " + trk.size() + " track segments");
		        for (int j = 0; j < trk.size(); j++) {
		          JPXTrackSeg trkseg = trk.getTrackSeg(j);
		          System.out.println("Segment (" + i + "," + j + ") has " + trkseg.size() + " track points");
		         // for (int k = 0; k < trkseg.size(); k++) {
		         //   GPXPoint pt = trkseg.getPoint(k);
		        //    System.out.println("Point (" + pt.lat + "," + pt.lon + ")");
		       //   }
		          JPXPoint pt2 = trkseg.getNothWest();
		          System.out.println("PT2 : " + pt2.toString());
		          String l =pt2.toString();
		          JSONObject pt3 =  new JSONObject();
		          pt3= JSONObject.parse(l) ;
		          System.out.println("PT3 : " + pt3.toString());
		          
		          
		          System.out.println("limite Nord WEst (" + pt2.lat + "," + pt2.lon + ")");
		          pt2 = trkseg.getSouthEast();
		          System.out.println("limite Sud Est (" + pt2.lat + "," + pt2.lon + ")");
		        }
		      }
    	    
           }
           else {
        	   System.err.println("no filename supplied");
           }
           
           //System.out.println("Read with success");
          }
	    }
	    System.out.println("END");
	  }

	public GregorianCalendar getStartTime() {
		return StartTime;
	}
	public GregorianCalendar getEndTime() {
		return EndTime;
	}

	
	  
}
