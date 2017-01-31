import java.util.*;  
class SortedCollection 
{  
	public static void main(String args[])
	{    
		ArrayList<String> al=new ArrayList<String>();  
		al.add("Tushat");  
		al.add("Sarvam");  
		al.add("Premal");  
		al.add("Chintan");  
  
		Collections.sort(al);  
		Iterator itr=al.iterator();  
		while(itr.hasNext())
		{  
			System.out.println(itr.next());  
		}  
	}  
}  