package jpx;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import processing.core.PApplet;


public class JPXList {
	private static final JPXList INSTANCE = new JPXList();
	private static final String _directory="D:\\googledrive\\infocourse\\parcours\\base\\";
	 public void setparent(PApplet parent) {
		    this.parent = parent;
		    
		  }
	 public JPXList(){
		 this.parent = new PApplet();
		 LoadParcours(_directory);
		 System.out.println("Parcours loaded"); 
	 }
	 public static JPXList getInstance() {
	        return INSTANCE;
	    }
	 
	 public static void main(String[] args) {
    	//PApplet l_applet = new PApplet();
    	if (args.length >= 1) {
	    	
	      System.out.println("Read " + args[0] + "... "); 
	      JPXList listparcours = JPXList.getInstance();
	      //listparcours.setparent(l_applet);
	      //listparcours.LoadParcours(args[0]);
	      JPXLapSeg gpx;
          for (int l_i = 0; l_i < listparcours.getParcours().size(); l_i++) 
          {
        	  gpx = listparcours.getParcours().get(l_i);
     	      System.out.println( gpx.Name + " : "+ gpx.IdLapSeg);
    	    
		          JPXPoint pt2 = gpx.ptNorthWest;
		          System.out.println("limite Nord WEst (" + pt2.lat + "," + pt2.lon + ")");
		          pt2 = gpx.ptSouthEast;
		          System.out.println("limite Sud Est (" + pt2.lat + "," + pt2.lon + ")");
		    
           }
           
	    }
	    System.out.println("THE END");
	  }
    protected List<JPXLapSeg> parcours;
    PApplet parent;
	  
    public List<JPXLapSeg> getParcours() {
        if (parcours == null) {
        	parcours = new ArrayList<JPXLapSeg>();
        }
        return this.parcours;
    }
    
    public void LoadParcours(String eFolder)
	  {
       try { 
        File folder = new File(eFolder);
        File[] listOfFiles = folder.listFiles(); 
        String files;
        Integer Id= 0;
        for (int l_i = 0; l_i < listOfFiles.length; l_i++) 
        {      
			 if (listOfFiles[l_i].isFile())  			   
			 {
				  files = eFolder + listOfFiles[l_i].getName();
				  System.out.println("Got " + files + "...");
				  
				      JPX jpx = new JPX(parent);
				      jpx.setsName(listOfFiles[l_i].getName());
				      JPX.debug = true;
				      jpx.parse(files);
				      Id++;
				      JPXLapSeg l_root = new JPXLapSeg (Id,jpx.getsName(), true);
				      l_root.ptNorthWest=jpx.getNothWest();
				      l_root.ptSouthEast=jpx.getSouthEast();
				      
                      int l_numtrack=0;
					  for (int i = 0; i < jpx.getTrackCount(); i++) {
					        JPXTrack trk = jpx.getTrack(i);
					        for (int j = 0; j < trk.size(); j++) {
					          JPXTrackSeg trkseg = trk.getTrackSeg(j);
					          Id++;
					          JPXLapSeg l_child = new JPXLapSeg(Id,trkseg);
					          l_child.Name=jpx.getsName() + "_" + l_numtrack;
					          l_numtrack++;
					          getParcours().add(l_child);
					          l_root.ListIdlapSeg.add(Id);
				     // System.out.println("parsing done." + files);
				      // System.out.println(gpx.getTrackCount() + " tracks parsed:");	
							 }
					  }
				      getParcours().add(l_root);
			 }
        }
       } catch( Exception je ) {
           je.printStackTrace();
       }
	  }

}
