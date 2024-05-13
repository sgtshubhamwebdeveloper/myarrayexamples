package myarrayexamples;

public class DifferenceBetweenLargestandSmallestValue {
	public static void main(String[] args) {
		int[] arr = {5,7,2,4,9};
		System.out.println("Original array :" +arr);
		int max_val = arr[0];
		int min = arr[0];
		for(int i = 1;i<arr.length;i++) {
			if(arr[i] > max_val)
			max_val=arr[i];
			else if (arr[i] < min)
				min = arr[i];
			 
		}
		System.out.println("Difference between Largest and Smallest value of array :" +(max_val - min));

}
}
