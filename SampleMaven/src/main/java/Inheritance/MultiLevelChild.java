package Inheritance;

public class MultiLevelChild extends MultiLevelParent { 
	
		public void displays()
		{ 
			System.out.println("hello");
		} 
		public static void main (String args[])  
		{
		MultiLevelChild obj = new MultiLevelChild(); 
		obj.print();   
		obj.display();  
		obj.displays(); 
	}
}
		

	


