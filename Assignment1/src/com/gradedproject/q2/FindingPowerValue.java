package com.gradedproject.q2;

import java.util.Scanner;

public class FindingPowerValue {
	
	public static int power(int y, int z) {
		
		if(z==0) {
			return 1;
		}
		int result = y*power(y, z-1);
		
		return result;
	}


	public static void main(String[] args) {
		// importing 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the base number A : ");
		int baseNumber = sc.nextInt();
		System.out.println("Enter the power n : ");
		int power = sc.nextInt();
		
		System.out.println(power(baseNumber, power));
		
		sc.close();
	}

}
