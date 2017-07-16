package umuc.week2;

import java.util.Scanner;

import com.sun.xml.internal.bind.api.impl.NameConverter.Standard;

public class Test {

	public static void main(String[] args) {
		double income = 0.0;
	    double tax_due = 0.0;
	    // Use the Scanner class to input data
	  
	    Scanner scannerIn = new Scanner(System.in);
	    System.out.println("Enter the income (Ex. 23123.21): ");
	    income = scannerIn.nextDouble();
	    if (income <= 0){
		      System.out.println("Income must be greater than 0");
		      System.exit(0);}
		else if (income < 20000){
	      tax_due = income * .1;
	    }
	    else if (income < 40000){
	      tax_due = income * .12;
	    }
	    else if (income >= 60000){
	      tax_due = income * .15;
	    }
	    else {
	      tax_due = income * .14;
	    }
	    System.out.println("With an income of $" + income + " your taxes due are $" + tax_due);
		// TODO Auto-generated method stub

	}

}
