/**
 * Author: Daniel Cousino
 * Purpose : To create 5 polygons representing different
 * 5 test cases
 * cases you just created.
 */
package week4;

public class PolygonTest {

	public static void main(String[] args) {
		//Create a instance of Polygon using the 
		//default constructor
		Polygon polyDefault= new Polygon();
		printProperties(polyDefault);
		
		Polygon polyZeros = new Polygon(0,0,0,0);
		printProperties(polyZeros);
		
		Polygon polyStandard = new Polygon(5,10,4,10);
		printProperties(polyStandard);
		
		Polygon polyBigNumOfSides = new Polygon(1000,5.2,10.3,4.44343);
		printProperties(polyBigNumOfSides);
		
		Polygon polyNegatives = new Polygon(-1,-1,-1,-1);
		printProperties(polyNegatives);
	}
	public static void printProperties(Polygon polygon) {
		System.out.println("toString(): " + polygon.toString());
    	System.out.println(String.format("getNumOfSides(): %d", polygon.getNumberOfSides()));
    	System.out.println(String.format("getSideLength(): %.1f", polygon.getSideLength()));
    	System.out.println(String.format("getXCoordinate(): %.1f", polygon.getXCoordinate()));
    	System.out.println(String.format("getYCoordinate(): %.1f", polygon.getYCoordinate()));
    	System.out.println(String.format("getPerimeter: %.1f", polygon.getPerimeter()));
	}
	
		
		
}

