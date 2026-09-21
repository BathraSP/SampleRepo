package Inheritance;

public class  SingleChild extends SingleParent { 
	
public void display()  
{ 
	System.out.println("Just a Method");
}

	public static void main(String[] args) { 
		
	  SingleChild obj = new SingleChild(); 
	  obj.print(); 
	  obj.display();

	}

}
