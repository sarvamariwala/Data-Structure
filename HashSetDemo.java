import java.util.*;  
class Car
{  
	int id;  
	String name,company,model,type;
	public Car(int id, String name, String company, String model, String type) 
	{
		this.id = id;  
		this.name = name;  
		this.company = company;  
		this.model = model;  
		this.type = type;  
	}  
}  
public class HashSetDemo
{  
	public static void main(String[] args) 
	{  
		HashSet<Car> set=new HashSet<Car>();  
		Car b1=new Car(101,"Swift","Suzuki","vxi","Petrol");  
		Car b2=new Car(102,"Verna","Hundai","Middle","Disel");  
		Car b3=new Car(103,"Endoviour","Ford","Top","Desel");  
		
		set.add(b1);  
		set.add(b2);  
		set.add(b3);  
		
		for(Car b:set){  
		System.out.println(b.id+" "+b.name+" "+b.company+" "+b.model+" "+b.type);  
		}  
	}  
}  