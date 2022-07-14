package week1.day2;

import java.util.Arrays;

public class FindDups {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// goal: to understand arrays, loop, if

		int[] nums = {67, 45, 18, 56, 45,67, 90, 90, 18, 45, 18, 56, 60, 90, 67, 67};
		//int length = nums.length;

		Arrays.sort(nums);
		for (int i = 0; i < nums.length; i++) {

			if(nums[i] == nums[i++])
			{
				System.out.println("Duplicate: "+nums[i]);
			}

		}
	}

}
