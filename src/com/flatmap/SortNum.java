package com.flatmap;
import java.util.List;
import java.util.stream.Collectors;

public class SortNum {

	public static void main(String[] args) {
		
		  List<List<Integer>> nums = List.of(
				 List.of(5, 2),
				 List.of(8, 1),
				 List.of(3, 7)
	        );
	 
	        List<Integer> result = nums.stream()
	            .flatMap(x -> x.stream())
	            .sorted()
	            .collect(Collectors.toList());
	 
	        System.out.println(result);

	}

}
