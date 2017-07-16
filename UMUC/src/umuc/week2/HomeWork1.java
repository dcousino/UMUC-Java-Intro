/**
 * Author: Daniel Cousino
 * Date: 6/27/2017
 * Purpose: To familize with java I/O functionality by
 * taking user input and converting some values and outputing
 * the results
 */

package umuc.week2;

import java.io.*;
import java.util.Scanner;

public class HomeWork1 {
	
	private static Student student;
	private static final int NUMBER_OF_QUIZZES = 3;
	
	public static void main(String[] args) throws IOException {	
		
		//Creates an instance of Scanner to recieve user input 
		Scanner stdin = new Scanner(System.in);
		
		try{
			
			student = new Student();
			

			//Intialize a double array with the number of quizzes
			student.quizScores = new double[NUMBER_OF_QUIZZES];

			System.out.print("Enter your Student EMPLID (0 - 999999): ");
			//Protects against invalid entry, doesn't attempt to remediate 
			if(!stdin.hasNextInt()){
				stdin.next();
			}else{		
				student.studentEmpoyeeId = Math.abs(stdin.nextInt());
			}

			//Loops through the number of quizzes and stores them in an array
			for(int i = 0; i < NUMBER_OF_QUIZZES; i++){
				System.out.print(String.format("Enter your quiz%d percentage score (0.0 – 100.0): ", i + 1));
				if(!stdin.hasNextDouble()){
					stdin.next();
				}else{			
					student.quizScores[i] = Math.abs(stdin.nextDouble()); 
				}	
			}

			System.out.print("Enter your age in months (0-1440): ");
			//Protects against invalid entry, doesn't attempt to remediate 
			if(!stdin.hasNextInt()){		
				stdin.next();
			}else{
				student.ageInMonths = Math.abs(stdin.nextInt());
			}

			System.out.print("Enter the current Temperature in degrees Celsius: ");
			//Protects against invalid entry, doesn't attempt to remediate 
			if(!stdin.hasNextDouble()){
				stdin.next();
			}else{
				student.temperature = Math.abs(stdin.nextDouble()); 
			}

			System.out.println();

			printResults();

		}catch(Exception ex){
			System.err.println("There has been an error running HomeWork1.main: "
					+ ex.getMessage());
		}finally{
			//ensure scanner doesn't get left open
			stdin.close();
		}
	}
	
    /**
     * Prints the results from the user input including converted values
     */
	public static void printResults(){
		
			System.out.println();
			
			System.out.println("*** Thank you ***");
			
			System.out.println("Student EMPLID: " + student.studentEmpoyeeId);
			
			//Loop through each quiz score stored in the array
			for(int i = 0; i < NUMBER_OF_QUIZZES; i++){
				System.out.println(String.format("Enter your Quiz %d Score: %.1f", i + 1, student.quizScores[i]));		
			}
			
			System.out.println(String.format("Average quiz score: %.1f", student.getQuizAverage()));

			System.out.println("Age in months: " + student.ageInMonths);
			
			System.out.println("Age in years: " + student.getAgeInYears());
			
			System.out.println("Temperature in Celsius: " + student.formatTemperature(student.temperature));
			
			System.out.println("Temperature in Fahrenheit:: " + student.convertToFahrenheit());
		
	}

}
