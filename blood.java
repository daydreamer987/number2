package com.studyopedia;

import java.util.Scanner;

public class blood {

	        Scanner scanner = new Scanner(System.in);

	        
	        System.out.println("Enter age: ");
	        int age = scanner.nextInt();
	        System.out.println("Enter weight: ");
	        int weight = scanner.nextInt();

	        // Checking eligibility
	        if (age >= 18 && weight >= 50) {
	            System.out.println("You are eligible to donate blood.");
	        } else {
	            System.out.println("You are not eligible to donate blood.");
	        }

	        scanner.close();
	    }
	}