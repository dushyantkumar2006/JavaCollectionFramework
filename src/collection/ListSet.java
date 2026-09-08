package collection;
import java.util.ArrayList;
import java.util.Scanner;
public class ListSet {

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);
	        ArrayList<Integer> list = new ArrayList<>();

	        list.add(10);
	        list.add(20);
	        list.add(30);

	        System.out.print("Enter index: ");
	        int index = sc.nextInt();

	        System.out.print("Enter new value: ");
	        int value = sc.nextInt();

	        list.set(index, value);

	        System.out.println("Updated List = " + list);
	    }
	}
	

