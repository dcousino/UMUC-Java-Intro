/**
* File: Week3Discussion.java
* Author: Daniel Cousino
* Date: 07-09-2017
* Purpose: To demonstrate a few different ways to iterate over a list.
*/

package week3;
import static java.lang.System.out;
import java.util.Arrays;
import java.util.List;
import propel.core.*;

public class Week3Discussion {

	public static void main(String[] args) {
		
		//Instantiate new Student, daniel
		Student daniel = new Student("Daniel", Major.Software_Development, 31, 3.8);
		//Instantiate new Student, amber
		Student amber = new Student("Amber", Major.Finance, 30, 3.7);
		//Instantiate new Student, danielJr
		Student danielJr = new Student("Daniel Jr", Major.Being_A_Boss, 2, 4.0);
		
		//Instantiate a list of Students
		List<Student> studentList = Arrays.asList(daniel, amber, danielJr);
		
		//Loop over list of students and printing their properties using 
		//tradition for loop
		for (int i = 0; i < studentList.size(); i++) {
			studentList.get(i).printProperties();			
		}
		
		//Loop over list of students and printing their properties using 
		//while loop
		int i = 0;
		while(i < studentList.size()){
			studentList.get(i).printProperties();
			i++;
		}
		//Loop over list of students and printing their properties using 
		//foreach
		for (Student student : studentList) {
			student.getWeather();
		}
		//Loop over list of students and printing their properties using 
		//lambda expression, this is the way I prefer to loop through list
		//if I don't really have to apply too much logic or don't foresee the need
		//to debug. There seems to be a lot of controversy doing things this way in
		//Java, its pretty standard in C#, Ruby, and Python
		studentList.forEach(student -> student.printProperties());
		
		
	}}



