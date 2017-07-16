
/**
 * File: Student.java
 * Author: Daniel Cousino
 * Date: 6/27/2017
 * Purpose: Student object stores properties relating to a Student and provides methods
 * for converting certain values.
 */
package umuc.week2;

/**
 * Just to get used to javadocs
 * @author Daniel Cousino <br><br>
 * <b>
 * Description
 * </b>
 * <pre>
 * Student object stores properties relating to a Student and provides methods
 * for converting certain values.
 * </pre>
 */
public class Student {
//Public Properties
public int studentEmpoyeeId;
public double[] quizScores;
public int ageInMonths;
public double temperature;
//Public Methods
/**
 * Divides age in months by 12 to get age in years
 *
 */
public int getAgeInYears(){	
	return ageInMonths/12;
}
/**
 * Adds the values of each quiz score stored in quizScores array and
 * divides by total number of quiz scores stored in quizScores array
 * @return Average of all quiz scores. 0 if quizScores array is empty
 */
public double getQuizAverage(){	
	double quizAverage = 0;	
	for(double quizScore : quizScores){
		quizAverage += quizScore;
	}	
	//Protect against dividing by zero
	if(quizScores.length <= 0){
		return 0;
	}	
	return quizAverage/quizScores.length;
}
/**
 * Tries to convert temperature(Celsius) to Fahrenheit.
 * Then convert double to string and appends &#x00b0 symbol.
 * @return Temperate in Farhrenheit. If there is any error: 0&#x00b0
 */
public String convertToFahrenheit(){
	double convertedTemp;	
	try{
		convertedTemp = temperature * 1.8 + 32;
		return formatTemperature(convertedTemp);
	}catch(Exception ex){
		System.err.println("There has been and error converting temperature to Fahrenheit: "
				+ ex.getMessage());
		return "0.0"+"\u00b0";
	}	
}
/**
 * Converts temperature to string and appends &#x00b0 symbol
 */
public String formatTemperature(double temp){
	return  String.format("%.1f\u00b0", temp);
}
}
