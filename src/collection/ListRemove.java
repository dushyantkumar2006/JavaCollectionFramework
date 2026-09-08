package collection;
import java.util.ArrayList;
import java.util.Scanner;
public class ListRemove {

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);
	        ArrayList<Integer> list = new ArrayList<>();

	        list.add(50);
	        list.add(90);
	        list.add(32);

	        System.out.print("Enter index to remove: ");
	        int index = sc.nextInt();

	        list.remove(index);

	        System.out.println("After Remove = " + list);
	    }
	}

