package jpx;


import processing.data.XML;

/** simple GPX waypoint, only understands latitude, longitude, name and type
FIXME extend parsing to understand other properties */
public class GPXWayPoint {

  public double lat,lon;
  public String name;
  public String type;

  public GPXWayPoint() {
    this.lat = 0.0;
    this.lon = 0.0;
    this.name = "";
    this.type = "";
  }

  public GPXWayPoint(double lat, double lon, String name, String type) {
    this.lat = lat;
    this.lon = lon;
    this.name = name;
    this.type = type;
  }

  /** parses a GPXWayPoint from the given XML */
  public GPXWayPoint(XML trkpt) {
    this.lat = trkpt.getDouble("lat");
    this.lon = trkpt.getDouble("lon");
    this.name = trkpt.getChild("name").getContent();
    this.type = trkpt.getChild("type").getContent();
  }

}
