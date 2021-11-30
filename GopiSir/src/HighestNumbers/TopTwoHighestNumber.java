package HighestNumbers;

import java.util.List;
import java.util.Random;

public class TopTwoHighestNumber {

	public static void main(String[] args) {
		int[] list = {11, 22, 45, 92, 21, 54, 92, 79, 11};
		int firstHighest;
		int secondHighest;
		if(list[0] > list[1])
		{
			firstHighest = list[0];   
			secondHighest = list[1];
		}
		else
		{
			firstHighest = list[1];
			secondHighest = list[0];
		}
		for (int i = 0; i < list.length; i++) {
			if (list[i] > firstHighest) {
				firstHighest = list[i];
			}
			 if (list[i] > secondHighest && list[i] < firstHighest)
			 {
				secondHighest = list[i];
			}

		}
		System.out.println("First Highest Number in a array is  "+firstHighest);
		System.out.println("Second Highest Number in a array is  "+secondHighest);
	}

}
