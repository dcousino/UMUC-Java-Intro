package week4;

public class Polygon {

	private int numSides = 4;
	private double sideLength = 5.0;
	private double xCoord = 0.0;
	private double yCoord = 0.0;
	private double perimeter;
	/**
	 * Default constructor for Polygon
	 */
	public Polygon() {
		
	}
	/**
	 * Constructor for polygon that takes the number of sides,
	 * the length of the sides, the x-coordinate, and the 
	 * y-coordinate
	 * @param nSides
	 * @param sideLen
	 * @param x
	 * @param y
	 */
    public Polygon(int nSides, double sideLen, double x, double y){
    	numSides = nSides;
    	sideLength = sideLen;
    	xCoord = x;
    	yCoord = y;
    }   
    /**
     * Returns a double value representing the perimeter of the
     * Polygon.
     * @return
     */
    public double getPerimeter(){
    	
    	for (int i = 0; i < numSides; i++) {
			perimeter += sideLength;
		}
    	return perimeter;
    }
    
    //Gets    
    /**
     * Gets the number of sides of the Polygon
     * @return
     */
    public int getNumberOfSides(){
    	return numSides;
    }
    /**
     * Gets the Side Length of the Polygon
     * @return
     */
    public double getSideLength() {
    	return sideLength;		
	}
    /**
     * Gets the X Coordinate of the Polygon
     * @return
     */
    public double getXCoordinate() {
		return xCoord;
	}
    /**
     * Gets the Y Coordinate of the Polygon
     * @return
     */
    public double getYCoordinate() {
		return yCoord;
	}
    
    //End Gets
    
    //Helper Methods
    /**
     * Overrides to toString() method returning the properties of 
     * the polygon
     */
    public String toString(){
    	return String.format("(numSides=%d, "
    			+ "sideLength=%.1f, "
    			+ "xcoord=%.1f, "
    			+ "ycoord=%.1f)", 
    			numSides, sideLength,xCoord, yCoord);
    }
    
    //End Helpers
}
