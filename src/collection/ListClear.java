package collection;
import java.util.ArrayList;
import java.util.Scanner;
public class ListClear {
	
	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);
	        ArrayList<Integer> list = new ArrayList<>();

	        for (int i = 0; i < 10; i++) {
		        System.out.print("Enter the number : ");
		        int n = sc.nextInt();
	            list.add(n);
	        }

	        System.out.println("Before clear = " + list);

	        list.clear();

	        System.out.println("After clear = " + list);
	    }
	}

