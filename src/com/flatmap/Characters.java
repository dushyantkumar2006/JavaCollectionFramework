package com.flatmap;
import java.util.List;
import java.util.stream.Collectors;

public class Characters {

	public static void main(String[] args) {
		
		List<String> words = List.of("Java","Codes");
		
		List<String> result = words.stream()
				.flatMap(x -> x.chars()
				.mapToObj(c -> String.valueOf ((char) c)))
				.collect(Collectors.toList());
		
		System.out.println(result);
	}

}
