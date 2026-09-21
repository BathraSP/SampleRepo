package accessModifier;

public class Access1 {

	public void display1 () 
	{ 
		System.out.println("Just a Method");  
	}  

	
	private void display2 () 
	{ 
		System.out.println("private ");
	} 
	 
	protected void display3() 
	{ 
		System.out.println("Protected");
	}
	 
	void display4 () 
	{ 
		System.out.print("default"); 
	} 
	public static void main (String args[]) 
	{ 
		Access1 obj = new Access1(); 
		obj.display1();  
		obj.display2();  
		obj.display3();  
		obj.display4(); 
	} 
}
	