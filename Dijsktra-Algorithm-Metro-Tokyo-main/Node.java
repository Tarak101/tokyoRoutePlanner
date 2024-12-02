import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Node {
	private String station;
	private List<Edge> edges;
	private double latitude;
	private double longitude;
	private int lines;
	
	
	
	public Node (String station, double latitude, double longitude,int lines) {
		this.station=station;
		this.latitude=latitude;
		this.longitude=longitude;
		this.lines=lines;
	}
	
	public String getStation() {
        return station;
    }
 
    public void setStation(String station) {
        this.station = station;
    }
    
    public double getLatitude() {
    	return latitude;
    }
    
    public double getLongitude() {
    	return longitude;
    }
 
    public List<Edge> getEdges() {
        return edges;
    }
    public int getLines() {
    	return lines;
    }
 
    public void addEdge(Edge edge) {
        if (edges == null) {
            edges = new ArrayList<>();
        }
        edges.add(edge);
    }
 
    
    
  
    
    
    @Override
    public String toString() {
        return "\n \tNode [station=" + station + ", edges=" + edges + "]";
    }
}
