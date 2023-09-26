/***************************************************************************************************
 * File          :   Attendance.java
 * Description   :   Find attendance percentage
 * Author        :   Kevin Biju Kulangara
 * Version       :   1.0
 * Date          :   26/09/2023
 *************************************************************************************************/





package sample;

import java.util.Scanner;

public class Attendance {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter attendance percentage");
		
		float attendance=sc.nextInt();
		
		if(attendance>90) {
			System.out.println("attendance mark=10");
			
		}
		else {
			attendance=attendance/10;
			System.out.println("attendance mark="+attendance);
		}
		
	}

}
