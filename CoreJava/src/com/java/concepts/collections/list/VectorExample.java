package com.java.concepts.collections.list;

import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		
		Vector<String> vector = new Vector<String>();
		
		vector.add("Item1");
	    vector.add("Item2");
	    vector.add("Item3");
	    vector.add("Item4");
	    vector.add("Item5");
	    vector.add("Item6");
	    /* The method subList(int fromIndex, int toIndex) 
	     * returns a List having elements of Vector 
	     * starting from index fromIndex 
	     * to (toIndex - 1).
	     */
	    List<String> subList = vector.subList(2,5);
	 
	    System.out.println("Sub list elements :");
	    for(int i=0; i < subList.size() ; i++){
	       System.out.println(subList.get(i));
	    }
	    
	    ListIterator<String> lir = subList.listIterator();
	    
	    while(lir.hasNext()) {
	    	System.out.println("Vector element: " + lir.next());
	    }
	}    

}
