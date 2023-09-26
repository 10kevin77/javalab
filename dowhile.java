package sample;

import java.util.Scanner;

public class dowhile {
public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		
		int number=sc.nextInt();
		int sum=0;
		
		do {
			sum=sum+number;
			System.out.println("Enter next number");
			
			number=sc.nextInt();
			
		}while(number>0);
		System.out.println("The sum is "+sum);
	}

}
