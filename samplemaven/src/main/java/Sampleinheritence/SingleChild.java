
package Sampleinheritence;

public class SingleChild extends SingleInheritence {

	public static void main(String[] args) {
		SingleChild ch=new SingleChild();
		ch.display();
		ch.display2();

	}
	public void display2()
	{
		System.out.println("This is the child class");
	}

}
