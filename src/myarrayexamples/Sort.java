package myarrayexamples;

import java.util.Arrays;

public class Sort {
	public static void main(String[] args) {
		int[] arr1 = {2015,2020,2017,2018,2025,2023,2021,2024,2016,2019,2022};
		String[] arr2 = { "C++ programming","Java programming","C programming"};
		System.out.println("Original numeric array : "+arr1);
		Arrays.sort(arr1);
		System.out.println("Sorted numeric array" +arr1);
		System.out.println("Original String array :" +arr2);
		Arrays.sort(arr2);
		System.out.println("Sorted string array" +arr2);
		
	}

}

