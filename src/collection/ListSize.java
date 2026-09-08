package collection;
import java.util.ArrayList;
import java.util.Scanner;
public class ListSize {

	public static void main(String[] args) {
		
		        Scanner sc = new Scanner(System.in);
		        ArrayList<Integer> list = new ArrayList<>();

		        for (int i = 0; i < 10; i++) {

			       System.out.print("Enter number of elements: ");
			       int n = sc.nextInt();
		            list.add(n);
		        }

		        System.out.println("Number of elements = " + list.size());
		  }
	
	}

