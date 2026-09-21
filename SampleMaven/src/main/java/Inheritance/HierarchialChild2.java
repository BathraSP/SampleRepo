package Inheritance;

public class HierarchialChild2 extends HierarchialParent{ 
	public void display() 
	{ 
		System.out.println("hii");
	}

	public static void main(String[] args) { 
		
		 HierarchialChild2 obj = new  HierarchialChild2(); 
		 obj.display();  
		 obj.print();

	}

}
