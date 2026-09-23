package com.flatmap;
import java.util.List;
import java.util.Arrays;

public class Count {

	public static void main(String[] args) {
		
		 List<String> sentences = List.of(
	                "My name is Dushyant",
	                "I am learning java"
	          );
	 
	        long result = sentences.stream()
	                .flatMap(x -> Arrays.stream(x.split(" ")))
	                .count();
	 
	        System.out.println("Total Words :"+result);

	}

}
