package n1exercici2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class n1exercici2 {

	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<Integer>(Arrays.asList(0,1,2,3,4,5,6,7,8,9));
		ListIterator<Integer> it=list1.listIterator();
		List<Integer> list2 = new ArrayList<Integer>();
		
		System.out.println("\nLista 1:");
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		while(it.hasPrevious()){
			list2.add(it.previous());
		}		
		
		System.out.println("\nLista 2:");
		for(int i : list2) {
			System.out.println(i);
		}
	}
	
}
