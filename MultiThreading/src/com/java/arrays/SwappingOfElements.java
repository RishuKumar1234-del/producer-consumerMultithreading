package com.java.arrays;

import java.util.Scanner;

public class SwappingOfElements {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the row and columns of the matrix");
		int m=scan.nextInt();
		int n=scan.nextInt();
		if(m==n) {
			int[][] A=new int[m][n];
			System.out.println("Enter the elements of the matrix A");
			for(int i=0;i<m;i++) {
				for(int j=0;j<n;j++) {
					A[i][j]=scan.nextInt();
				}
			}
			System.out.println(" the original  matrix A is: ");
			for(int i=0;i<m;i++) {
				for(int j=0;j<n;j++) {
					System.out.print(A[i][j] + " ");
				}
				System.out.println("");
			}
			
			//swapping
			
			for(int i=0;i<m;i++) {
			int temp=A[i][i];
			A[i][i]=A[i][m-i-1];
			A[i][m-i-1]=temp;
			}
			
			System.out.println("\n\n the resultant   matrix A is: ");
			for(int i=0;i<m;i++) {
				for(int j=0;j<n;j++) {
					System.out.print(A[i][j] + " ");
				}
				System.out.println("");
			}
		}
		
	
		
		else {
			System.err.println("the swapping of diagonal elements is not possible");
		}

	}

}
