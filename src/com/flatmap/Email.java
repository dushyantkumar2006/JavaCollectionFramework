package com.flatmap;
import java.util.List;
import java.util.stream.Collectors;
 
class Person {
 
    String name;
    List<String> emails;
 
    Person(String name, List<String> emails) {
        this.name = name;
        this.emails = emails;
    }
}

public class Email {

	public static void main(String[] args) {
		
		 List<Person> people = List.of(
				 new Person("Dushyant",
			     List.of("dushyant@gmail.com")),
				 
				 new Person("Zubair",
			     List.of("zubair@gmail.com")),
				 
	             new Person("Adil",
	             List.of("adil@gmail.com"))
	 
	        );
	 
	        List<String> res = people.stream()
	        	.flatMap(x -> x.emails.stream())
	            .collect(Collectors.toList());
	 
	        System.out.println(res);
	    }
	}

