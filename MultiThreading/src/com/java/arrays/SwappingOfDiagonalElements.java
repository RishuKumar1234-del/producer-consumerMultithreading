package com.java.arrays;

import java.util.Scanner;

public class SwappingOfDiagonalElements {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter rows and columns of a matrix");
		int m=scan.nextInt();
		int n=scan.nextInt();
		if(m==n) {
			int[][] A=new int[m][n];
			System.out.println("Enter the element of a matrix");
			
			for(int i=0;i<m;i++) {
				for(int j=0;j<n;j++) {
					A[i][j]=scan.nextInt();
				}
			}
			
			System.out.println("the matrix A is: ");
			
			for(int i=0;i<m;i++) {
				for(int j=0;j<n;j++) {
					System.out.print(A[i][j] + " ");
				}
				System.out.println("");
			}
			
			System.out.println("\nThe matrix A after swapping of diagonal");
			
			for(int i=0;i<n;i++) {
				int temp=A[i][i];
				A[i][i]=A[i][n-i-1];
				A[i][n-i-1]=temp;
			}
			
			for(int i=0;i<m;i++) {
				for(int j=0;j<n;j++) {
					System.out.print(A[i][j] + " ");
				}
				System.out.println();
			}
			
		}
		else {
			System.err.println("swapping of diagonal elements is not possible");
		}

	}

}
