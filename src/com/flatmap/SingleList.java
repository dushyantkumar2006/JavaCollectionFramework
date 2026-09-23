package com.flatmap;
import java.util.List;
import java.util.stream.Collectors;

public class SingleList {

	public static void main(String[] args) {
		
		 List<List<String>> tags = List.of(
				 List.of("java", "spring"),
				 List.of("python", "html"),
				 List.of("mysql")
	        );
	 
	     List<String> result = tags.stream()
	    		 .flatMap(x -> x.stream())
	    		 .distinct()
	    		 .collect(Collectors.toList());
	 
	     System.out.println(result);
	     
	}

}
