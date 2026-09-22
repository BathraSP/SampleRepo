package superKeyword;

public class SuperConstructorChild extends SuperConstructorParent{ 
	public SuperConstructorChild() 
	{ 
		super(); 
		System.out.println("Child");
	}

	public static void main(String[] args) {
		SuperConstructorChild obj = new SuperConstructorChild();

	}

}
