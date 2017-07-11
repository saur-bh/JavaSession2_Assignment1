/*
 * Problem Statement Write a program to find the highest among the given 3 numbers.
 */


package com.controlStructure.Session;

import java.util.Scanner;
public class Assignment1 {

	public static void main(String[] args) {

		//1. Create instance on Scanner class

		Scanner sc = new Scanner(System.in);

		//2. Initialize the three number , ask input from user

		int firstNum,secondNum,thirdNum;

		System.out.println("Enter the first number :");

		firstNum = sc.nextInt();

		System.out.println("Enter the second number");

		secondNum = sc.nextInt();

		System.out.println("Enter the third number");

		thirdNum = sc.nextInt(); 


		//3. Compare first number with second and third number 

		if((firstNum>secondNum) && (firstNum>thirdNum)) {

			System.out.println("The first number ("+firstNum+") is the highest among all");
		}

		
		//4. Compare second number with first and third number

		if((secondNum>thirdNum)&&(secondNum>firstNum)) {

			System.out.println("The Second number ("+secondNum+") is the highest among all");
		}

		//5. Compare third number with first and second
		
		if((thirdNum>secondNum)&&(thirdNum>firstNum)) {

			System.out.println("The Second number ("+thirdNum+") is the highest among all");
		}





	}

}
