package Inheritance;

public class HierarchialChild1 extends HierarchialParent { 
	public void show() 
	{ 
		System.out.println("hello");
	}

	public static void main(String[] args) {
		HierarchialChild1 obj = new HierarchialChild1(); 
		obj.print();  
		obj.show();

	}

}
