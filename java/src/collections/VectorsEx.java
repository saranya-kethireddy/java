package collections;

import java.util.Vector;

public class VectorsEx {
	
	 public static void main(String args[]) {  
         //Create a vector  
         Vector<String> vec = new Vector<String>();  
         //Adding elements using add() method of List  
         vec.add("parrrot");  
         vec.add("bird");  
         vec.add("Dog");  
         vec.add("animal");  
         //Adding elements using addElement() method of Vector  
         vec.addElement("Rat");  
         vec.addElement("Cat");  
         vec.addElement("Deer");  
           
         System.out.println("Elements are: "+vec);  
      }  

}
