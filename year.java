package com.studyopedia;

import java.util.Scanner;

public class year {

	public static void main(String[] args) {
	 Scanner scanner =new Scanner(System.in);
	 System.out.println("Enter year:");
	 int year=scanner.nextInt();
	 if((year%4==&&year%100 !=0)||(year%400==0))
	 {
		 System.out.println(year+"leap year");
	 }
	 else
	 {
		 System.out.println(year+"not leap") ;
	 }
	 scanner.close();
	}
      
}