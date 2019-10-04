/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework22;

import java.util.Scanner;

public class Homework22 {
	
	public static void main(String[] args) {
		
		Scanner a=new Scanner(System.in);
		
		for(int k=0; k<11; k++) {
		
		int ans;
		
		System.out.println("Do you want to enter value for x? (Press 1 for yes, and 2 for no.)");
		ans=a.nextInt();
		
		System.out.println("Enter a value for x.");
		double x=a.nextDouble();
		
		System.out.println("Choose the type of function: 1=exp, 2=sin, 3=cos, 4=tan, 5=cotan.");
		int type=a.nextInt();
		
		switch(type) {
		
		case 1:
			exponential(x);
			break;
			
		case 2:
			sin(x);
			break;
			
		case 3:
			cos(x);
			break;
			
		case 4:
			tan(x);
			break;
			
		case 5:
			cotan(x);
			break;
			
		default:
			
			System.out.println("Good bye.");	
			break;
		
		}
		
		}
		
		
		
	}
	
	public static double exponential(double x) {
		
		int n=50;
		long fact=1;
		double pow=1;
		double ex=1;
		
		for(int i=1; i<n; i++) {
			pow*=x;
			fact*=i;
			ex+=pow/fact;
		}
		
		return ex;
	}
	
	public static double sin(double x) {
		
		for(int i=1; i%2==1; i++) {
			
			double result;
			
		}
		
		
		return x;
		
	}
	
	public static double cos(double x) {
		
		
		return x;
	}
	
	public static double tan(double x) {
		
		
		return x;
	}

	public static double cotan(double x) {
		
		
		return x;
		
	}
}
