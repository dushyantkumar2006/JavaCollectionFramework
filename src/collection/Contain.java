package collection;
import java.util.ArrayList;
import java.util.Scanner;
public class Contain {

	public static void main(String[] args) {
	
		        Scanner sc = new Scanner(System.in);
		        ArrayList<Integer> list = new ArrayList<>();
                for(int i=0;i<5;i++) {
		  
                	System.out.print("Enter the element : ");
      		        int n = sc.nextInt();
      		        list.add(n);
    		        
                }
                System.out.println("Array List : "+list);
                System.out.println("========================= ");
  		        
		        System.out.print("Enter element to search: ");
		        int value = sc.nextInt();

		        if (list.contains(value)) {
		            System.out.println("Element is present");
		        } else {
		            System.out.println("Element is not present");
		        }
		    }
	
	}


