package chenango;
import java.util.*;  
import java.io.*;  


public class TestSort3 {

	public static void main(String args[]){  
	  
	ArrayList al=new ArrayList();  
	al.add(new Student(101,"Vijay",23));  
	al.add(new Student(106,"Ajay",27));  
	al.add(new Student(105,"Jai",21));  
	  
	Collections.sort(al);  
	Iterator itr=al.iterator();  
	while(itr.hasNext()){  
	Student st=(Student)itr.next();  
	System.out.println(st.rollno+""+st.name+""+st.age);  
	  }  
	}  
	} 
class Student implements Comparable{  
int rollno;  
String name;  
int age;  
Student(int rollno,String name,int age){  
this.rollno=rollno;  
this.name=name;  
this.age=age;  
}  
  
public int compareTo(Object obj){  
Student st=(Student)obj;  
if(age==st.age)  
return 0;  
else if(age>st.age)  
return 1;  
else  
return -1;  
}  
  
}    