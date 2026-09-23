package com.flatmap;
import java.util.List;

public class MaxNum {

	public static void main(String[] args) {
		
		 List<List<Integer>> nums = List.of(
				 List.of(5, 2),
				 List.of(8, 1),
				 List.of(3, 7)
	        );
	 
		 int result = nums.stream()
	            .flatMap(x -> x.stream())
	            .max(Integer::compareTo)
	            .get();
	 
		 System.out.println("Maximum number : "+result);

	}

}
