package week1.day2;

import java.util.Arrays;

public class MissingElementArray {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,7,6,8};
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			int miss=i+1;
			if(arr[i]!= miss) {
				System.out.println("The missing number is:" +miss);
				break;
			}

	}

}
}