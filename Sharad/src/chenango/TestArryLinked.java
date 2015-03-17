package chenango;
import java.util.*;  
public class TestArryLinked {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> al=new ArrayList<String>();//creating arraylist    
		  al.add("Ravi");//adding object in arraylist    
		  al.add("Vijay");    
		  al.add("Ravi");    
		  al.add("Ajay");    
		    // this is arralinked code
		  List<String> al2=new LinkedList<String>();//creating linkedlist    
		  al2.add("James");//adding object in linkedlist    
		  al2.add("Serena");    
		  al2.add("Swati");    
		  al2.add("Junaid");    
		    
		  System.out.println("arraylist: "+al);  
		  System.out.println("linkedlist: "+al2);  
		 }    
	
	}

