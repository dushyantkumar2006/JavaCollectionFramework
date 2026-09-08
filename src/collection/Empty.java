package collection;
import java.util.ArrayList;
import java.util.Scanner;
public class Empty {
	
	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);
	        ArrayList<Integer> list = new ArrayList<>();

	        System.out.print("Enter number of elements: ");
	        int n = sc.nextInt();

	        for (int i = 0; i < n; i++) {
		        System.out.print("Enter the number : ");
		        int num = sc.nextInt();
	            list.add(num);
	        }

	        if (list.isEmpty()) {
	            System.out.println("ArrayList is empty");
	        } else {
	            System.out.println("ArrayList is not empty");
	        }
	    }
	}

