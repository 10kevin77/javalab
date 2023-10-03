/***************************************************************************************************
 * File          :   palintrome.java
 * Description   :   Find attendance percentage
 * Author        :   Kevin Biju Kulangara
 * Version       :   1.0
 * Date          :   26/09/2023
 *************************************************************************************************/
package sample;

import java.util.Scanner;

public class palintrome {
		
		public static void main(String[] args) {
			String input;
			Scanner in=new Scanner(System.in);
			System.out.println("Enter a string");
			input=in.next();
			boolean check=ispalindrome(input);
			if(check==true)
			{
				System.out.println("the string is palindrome");
			}
			else {
				System.out.println("the string is not palindrome");
			}

		}
		
		static boolean ispalindrome(String input)
		{
			char characterArray[] = input.toCharArray();
			int length=input.length();
			for(int i=0;i<length;i++)
			{
				if(characterArray[i]!=characterArray[length-i-1]) {
					return false;
				}
				
			}
			return true;
		}

	}