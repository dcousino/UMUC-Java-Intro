/**
* File: Student.java
* Author: Daniel Cousino
* Date: 07-09-2017
* Purpose: Just to get familiar with enums in Java.
*/
package week3;

public enum Major {
	Software_Development("Software Development"),
	Finance("Finance"),
	Being_A_Boss("Being a boss");
		
	private final String displayName;
	//set displayName to the alternative name provided so it can be returned by overridden toString
    Major(final String display) {
        this.displayName = display;
    }
    //Overrides toString to provide the more human friendly display name
    @Override
    public String toString() {
    return this.displayName;
    }
}
