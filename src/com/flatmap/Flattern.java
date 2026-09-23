package com.flatmap;
import java.util.List;
import java.util.stream.Collectors;

public class Flattern {

	public static void main(String[] args) {
		
		List<List<String>> names = List.of(
				List.of("Dushyant","Zubair"),
				List.of("Adil","Sahil"),
				List.of("Deepanshu","Vikash")
				);
		
		List<String> result = names.stream()
				.flatMap(x -> x.stream())
				.collect(Collectors.toList());
		
		System.out.println(result);
		
		
	}

}
