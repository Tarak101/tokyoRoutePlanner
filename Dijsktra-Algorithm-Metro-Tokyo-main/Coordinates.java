
public class Coordinates {
	
	public static double distanceCoord(double lat1, double lng1, double lat2, double lng2) {  
        double earthRadius = 6371;//in km
        double dLat = Math.toRadians(lat2 - lat1);  
        double dLng = Math.toRadians(lng2 - lng1);  
        double sindLat = Math.sin(dLat / 2);  
        double sindLng = Math.sin(dLng / 2);  
        double va1 = Math.pow(sindLat, 2) + Math.pow(sindLng, 2)  
                * Math.cos(Math.toRadians(lat1)) * Math.cos(Math.toRadians(lat2));  
        double va2 = 2 * Math.atan2(Math.sqrt(va1), Math.sqrt(1 - va1));  
        double distance = earthRadius * va2;  
   
        return distance;

}
	
	public static void main(String args[]) {
		
	System.out.println(distanceCoord(35.689544,139.700583,35.628458,139.738802));
	}
	
	
	
	
	
}