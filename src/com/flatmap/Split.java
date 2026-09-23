package com.flatmap;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Arrays;

public class Split {

	public static void main(String[] args) {
		 
		List<String> sentences = List.of(
				"Java is powerful",
				"Streams are useful"
		         );
		 
		List<String> result = sentences.stream()
				.flatMap(x -> Arrays.stream(x.split(" ")))
				.collect(Collectors.toList());
		 
		        System.out.println("Result :"+result);

	}

}
