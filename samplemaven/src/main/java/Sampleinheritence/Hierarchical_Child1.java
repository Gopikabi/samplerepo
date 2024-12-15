package Sampleinheritence;

public class Hierarchical_Child1 extends Hierarchical_Parent {
	public void display1()
	{
	System.out.println("Child class 1"); 
	}
	public static void main(String[] args) {
		Hierarchical_Child1 obj1 = new Hierarchical_Child1();
		obj1.display();
		obj1.display1();
	}

}
