/***************************************************************************************************
 * File          :   sum of positive no
 * Description   :   Find sum of positive no
 * Author        :   Kevin Biju Kulangara
 * Version       :   1.0
 * Date          :   26/09/2023
 *************************************************************************************************/
package sample;

import java.util.Scanner;

public class sumofpositivenos {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		
		int number=sc.nextInt();
		int sum=0;
		
		while(number>0) {
			sum=sum+number;
			System.out.println("Enter next number");
			
			number=sc.nextInt();
			
		}
		System.out.println("The sum is "+sum);
	}
	
}
