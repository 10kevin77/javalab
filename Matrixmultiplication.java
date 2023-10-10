/***************************************************************************************************
 * File          :   matrixmultiplication.java
 * Description   :   find the palintrome of a string
 * Author        :   Kevin Biju Kulangara
 * Version       :   1.0
 * Date          :   10/10/2023
 *************************************************************************************************/
package sample;

import java.util.Scanner;

public class Matrixmultiplication {
	
	public static void main(String[]args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr the rows and column of first matrix");
		int row1=sc.nextInt();
		int col1=sc.nextInt();
		
		System.out.println("Enetr the rows and column of second matrix");
		int row2=sc.nextInt();
		int col2=sc.nextInt();
		
		if(row2!=col1) {
			System.out.println("Matrix multiplication is noty possible");
		}
		else {
		int [][]matrix1=new int[row1][col1];
		int [][]matrix2=new int[row2][col2];
		int [][]result=new int[row1][col2];
		
		int i,j,k;
		System.out.println("Enter values in the first matrix");
		for(i=0;i<row1;i++) {
			for(j=0;j<col1;j++) {
				matrix1[i][j]=sc.nextInt();
				
			}
		}
		System.out.println("Matrix1 is");
		for(i=0;i<row1;i++) {
			for(j=0;j<col1;j++) {
				System.out.print(matrix1[i][j]+"\t");
				
			}
			System.out.println();
		}
		
		System.out.println("Enter value in the second matrix");
		for(i=0;i<row2;i++) {
			for(j=0;j<col2;j++) {
				matrix2[i][j]=sc.nextInt();
			}
		}
		System.out.println("Matrix2 is");
		for(i=0;i<row2;i++) {
			for(j=0;j<col2;j++) {
				System.out.print(matrix2[i][j]+"\t");
				
			}
			System.out.println();
		}
		
		for(i=0;i<row1;i++) {
			for(j=0;j<col2;j++) {
				result[i][j]=0;
				for(k=0;k<col1;k++) {
					result[i][j]+=matrix1[i][k]*matrix2[k][j];
				}
			}
		}
		System.out.println("The resul is:");
		for(i=0;i<row1;i++) {
			for(j=0;j<col2;j++) {
				System.out.print(result[i][j]+"\t");
				
			}
			System.out.println();
		}	
	 
	}

	}
}
