package polyMorphism;

public class Dog extends Animal {  
	public void sound() 
	{  
		super.sound();
		System.out.println("dog barks");
	}
	public static void main(String[] args) { 
		Dog obj = new Dog(); 
		obj.sound();
		
	}

}
