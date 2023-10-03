package sample;

import java.util.Scanner;

public class frequency {
		
		public static void main(String[] args) {
			String word;
			char checkCharacter;
			Scanner sc = new Scanner(System.in);
			System.out.println("enter the string");
			word=sc.nextLine();
			System.out.println("enter the character whose frequency to be checked");
			checkCharacter = sc.next().charAt(0);
			int count=frequency(word,checkCharacter);
			System.out.println("the frequency of entered character="+count );
			
			
			
		}
		
		static int frequency(String input,char checkCharacter){
			int count=0;
			char characterArray[]=input.toCharArray();
			for(int i=0;i<input.length();i++)
			{
				if(checkCharacter == characterArray[i])
				{
					count++;
				}
			}
			return count;
			
		}

	}


