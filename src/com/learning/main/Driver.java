package com.learning.main;
import java.util.Scanner;

import com.learning.services.TransactionService;

public class Driver {

	public static void main(String[] args) {
		
		TransactionService ts=new TransactionService();
		System.out.println("Enter the Transaction size :");
		
		Scanner sc=new Scanner(System.in);
		int transactionSize=0;
		transactionSize=sc.nextInt();
		
		
		int[] transactionArray=new int[transactionSize];
		System.out.println("Enter the values of array");
		for(int i=0;i<transactionArray.length;i++) {
			transactionArray[i]=sc.nextInt();
			
		}
		
		System.out.println("Enter the total number of target that needs to achieved");
		int noOtraget=sc.nextInt();
		
		for (int i=0;i<noOtraget;i++) {
			System.out.println();
			System.out.println("Enter the value of target");
			int target= sc.nextInt();
			
			int numberOfDays=ts.transactionCalculator(transactionArray, target);
			if(numberOfDays==-1) {
				System.out.println("Target is not possible");
			}
			else {
				System.out.println( "Target Achieved after "+numberOfDays +" transaction");
			}
			
		}

	}
	
	

}
