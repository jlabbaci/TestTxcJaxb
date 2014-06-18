package jpx;

import java.io.StringWriter;
import java.util.Vector;

import processing.data.JSONObject; 


// It's a vector of itself or contains a vector of JXPoint
// i.e. it can be the marathon of Paris which contains each kilometers
// all this kilometers contains a vector of Point
public class JPXLapSeg {
	 
	public Integer IdLapSeg ;
	public String  Name ; // si on ne l'a pas on le recuperera de la base
	public Vector<JPXPoint> ListPoints; // cela ne contient que ses points ,pas ceux de ses fils
	public Vector<Integer> ListIdlapSeg;
	
	//limits of this segment
	 public JPXPoint ptNorthWest;
	 public JPXPoint ptSouthEast;
	 

	 public JPXLapSeg(Integer eId, String e_Name, boolean e_listlapseg) {	
		 // avan de créer sa propre séquence
		 // prendre le gc_id*1000 pour le pere et faire +1 pour les fils 
		 this.IdLapSeg=eId;
		 this.Name = e_Name;
		 if (e_listlapseg)
		 {
			 ListIdlapSeg=new Vector<Integer>();
		 }
		 else
		 {
			 ListPoints= new Vector<JPXPoint>();
		 }
		 	
	 }
	
	 public JPXLapSeg(int e_Id, JPXTrackSeg e_jpxSeg) {	
		 this.IdLapSeg=e_Id;
		 this.ptNorthWest=e_jpxSeg.getNothWest();
		 this.ptSouthEast=e_jpxSeg.getSouthEast();
		 ListPoints= new Vector<JPXPoint>();
		 this.ListPoints.addAll(e_jpxSeg) ;
		 
		 
		 
	 }
	// get data from database or from file
	 
	 public void PutinFile(){
//		 JSONObject obj = new JSONObject();
//		 obj.put("Id",IdLapSeg);
//		  obj.put("NordWest",ptNorthWest);
//		  obj.put("Sudest",ptSouthEast);
//		  if (ListPoints != null)
//		  {
//			  obj.put(ListPoints);
//		  }
//		  else
//		  {
//			  obj.put(ListIdlapSeg);  
//		  }
//		  obj.put("name",this.Name);
//		    
//		  StringWriter out = new StringWriter();
//		  System.out.println(out.toString());
//		  String jsonString = obj.toJSONString();
//		  System.out.println(jsonString);

	 }
	 public void PutinDB()
	 {
	 }
	 
	 

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
