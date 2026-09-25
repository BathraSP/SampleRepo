package Inheritance;

public class Child implements MultipleParent1 , MultipleParent2{
public void show() 
{ 
	System.out.println("show");
}
	public static void main(String[] args) {
		Child obj = new Child(); 
		obj.display();  
		obj.print();
obj.show();
	}

	@Override
	public void display() {
		System.out.println("hi");
		
	}

	@Override
	public void print() {
		System.out.println("hello");
		
	}

}
