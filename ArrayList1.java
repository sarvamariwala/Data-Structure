import java.util.*;
class Student
{  
	int rollno;  
	String name;  
	int age;  
	Student(int rollno,String name,int age)
	{  
	   this.rollno=rollno;  
	   this.name=name;  
	   this.age=age;  
	}  
}  
  
public class ArrayList1
{  
	public static void main(String args[])
	{  
		//Creating class objects  
		Student s1=new Student(101,"Sonoo",23);  
		Student s2=new Student(102,"Ravi",21);  
		Student s3=new Student(103,"Hanumat",25);  
		//creating arraylist  
		ArrayList<Student> al=new ArrayList<Student>();  
        //adding Student class object
		al.add(s1);  
	    al.add(s2);  
	    al.add(s3);   
        Iterator itr=al.iterator();  
        //traversing elements of ArrayList object  
       while(itr.hasNext())
	   {  
			Student st=(Student)itr.next();  
			System.out.println(st.rollno+" "+st.name+" "+st.age);  
		}  
	}  
}  