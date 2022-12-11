package week2.day5;

import java.util.Arrays;

public class FindSecondLargest {

	public static void main(String[] args) {
		int[] array = {3,2,11,4,6,7};
		Arrays.sort(array);
		//System.out.println(Arrays.toString(array));
	    int num = array.length;

	   System.out.println("findsecondlargest" +array[(num-1)-1]);
		
	}}