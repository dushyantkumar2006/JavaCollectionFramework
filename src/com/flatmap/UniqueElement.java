package com.flatmap;
import java.util.List;
import java.util.stream.Collectors;
public class UniqueElement {

	public static void main(String[] args) {
		
		List<List<String>> data = List.of(
				List.of("A", "B", "C"),
				List.of("B", "C", "D"),
				List.of("D", "A", "E")
				);
		 
		        List<String> res =  data.stream()
		        	.flatMap(x -> x.stream())
		            .distinct()
		            .collect(Collectors.toList());
		 
		        System.out.println(res);
		 
	 }

}
