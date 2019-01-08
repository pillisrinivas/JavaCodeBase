package com.java.concepts.collections.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapDriver {

	public static void main(String[] args) {
		Map<String, Integer> numberMapping = new HashMap<>();

        // Adding key-value pairs to a HashMap
        numberMapping.put("One", 1);
        numberMapping.put("Two", 2);
        numberMapping.put("Three", 3);

        // Add a new key-value pair only if the key does not exist in the HashMap, or is mapped to `null`
        numberMapping.putIfAbsent("Four", 4);

        System.out.println(numberMapping);
        
        Map<String, Integer> copyNumberMapping = new HashMap<>(numberMapping);
        System.out.println(copyNumberMapping);
        copyNumberMapping.put("Five", 3);
        copyNumberMapping.put("Five", 5);
        copyNumberMapping.put("Six", null);
        copyNumberMapping.put("Seven", null);
        copyNumberMapping.put(null, 9);
        copyNumberMapping.put(null, 10);
        copyNumberMapping.put("Forty", 4);
        System.out.println(copyNumberMapping);
        System.out.println(copyNumberMapping.size());
        System.out.println(copyNumberMapping.containsKey("Five"));
        System.out.println(copyNumberMapping.containsValue(null));
        
        System.out.println(copyNumberMapping.get("Three"));
        System.out.println("Remove: " + copyNumberMapping.remove("Five"));
        System.out.println("Remove: Object, Value " + copyNumberMapping.remove("Six", null));
        System.out.println(copyNumberMapping);
        System.out.println(copyNumberMapping.size());
        System.out.println(copyNumberMapping.values());
        
        System.out.println(copyNumberMapping.keySet());
        System.out.println(copyNumberMapping.entrySet());
        
        
//        HashMap entrySet()
        String var; 
        Integer i;
        Set<Map.Entry<String, Integer>> cnum =  copyNumberMapping.entrySet();
        System.out.println(cnum);
        for (Map.Entry<String, Integer> ref: cnum) {
        	System.out.println("Key value: " + ref.getKey() + " : Get Value: " + ref.getValue());
        	var = ref.getKey();
        	i = ref.getValue();
        	
        	if ((var != null) && (var.equals("Two"))) {
        			ref.setValue(22);
        	}
        }
        System.out.println(cnum);
         copyNumberMapping.remove(null);
         copyNumberMapping.remove("Seven");
         System.out.println(cnum);
         
         for (Iterator<String> icnum = copyNumberMapping.keySet().iterator(); icnum.hasNext();) {
//        	 System.out.println("Ket set via Iterator: Key Value: " + icnum.next());
        	 if (icnum.next().equals("Four")) {
        		 System.out.println("Value of Key four found !");
        		 icnum.remove();
        	 }
         }
         System.out.println(cnum);

         for (Iterator<Integer> icnum = copyNumberMapping.values().iterator(); icnum.hasNext();) {
//        	 System.out.println("Ket set via Iterator: Key Value: " + icnum.next());
        	 if (icnum.next().equals(22)) {
        		 System.out.println("Value of Value 22 found !");
        		 icnum.remove();
        	 }
         }
         System.out.println("cnum: " + cnum);
         System.out.println("copyNumberMapping: " + copyNumberMapping);
         
         Map<String, Integer> numMapping = new HashMap<>();
         numMapping.put("ninety", 90);
         numMapping.put("seventy", 70);
         
         copyNumberMapping.putAll(numMapping);
         
         for (Iterator<Entry<String, Integer>> irnum = 
        		 copyNumberMapping.entrySet().iterator(); irnum.hasNext();) {
        	 System.out.println(irnum.next());
         }
 
         System.out.println("copyNumberMapping: " + copyNumberMapping);
         
         
         //copyNumberMapping(numberMapping);
   
//        cnum.removeAll(cnum);
        
}

}
