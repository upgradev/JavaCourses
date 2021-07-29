package com.home.coursejava.Section3PrimitiveDataTypesVariablesandArrays;

import java.util.Arrays;

public class Learning12Arrays {

	public static void main(String[] args) {

		int[] arr;
		int arr2[];

		arr = new int[10];
		System.out.println(arr.length);
		System.out.println(arr[0]);

		double[] arr3 = new double[10];
		System.out.println(arr3[0]);

		boolean[] arr4 = new boolean[10];
		System.out.println(arr4[1]);

		int[] arr5 = { 3, 2, 1 };
		System.out.println(arr5[0]);

		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 } };
		System.out.println(matrix[1][2]);
		
		int[][] matrix2 = new int[10][0];
		System.out.println(matrix2[0]);
		
		System.out.println(Arrays.toString(arr5));
		Arrays.sort(arr5);
		System.out.println(Arrays.toString(arr5));
		
		


	}

}
