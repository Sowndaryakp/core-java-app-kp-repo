package com.sapient.aem.ui;

//public class CommandLineDemo {
//
//	public static void main(String[] args) {
//		System.out.println(args.length);
//		System.out.println(args[0]);
//		
//		for(int i=0;i<args.length;i++)
//		{
//			System.out.println(args[i]);
//		}
//
//	}
//
//}


/*
 * Write a program that receives list of numbers as 
 * command-line arguments. Display its sum and average.
 */
//public class CommandLineDemo {
//
//	public static void main(String[] args) {
//			
//		try {
//			
//			int sum=0;
//			double avg=0;
//			for(int i=0;i<args.length;i++) {
//				sum=sum+Integer.valueOf(args[i]);
//				
//			}
//			avg=(double)sum/args.length;
//			
//			System.out.println(sum);
//			System.out.println(avg);
//		}catch(Exception e)
//		{
//			System.out.println(e);
//		}
//		System.out.println("End of program");
//			
//
//	}
//
//}
//						or



public class CommandLineDemo {

	public static void main(String[] args) {			
		int sum=0;	
		try {
			
			for(int i=0;i<args.length;i++) {
				//convert String to Integer
				sum = sum + Integer.parseInt(args[i]);
			}
			double average = (double)sum/args.length;
			System.out.println("Sum= "+sum+"\nAverage= "+average);
			
		}catch(NumberFormatException e) {
			e.printStackTrace();
		}
		
		System.out.println("Program terminated normally");
		

	}

}
