package suren.demo.pkg;

public class VariablesDemo {

	public static void main(String[] args) {
		
		VariablesDemo2 demoObj=new VariablesDemo2();
		
		demoObj.a=10;
		
		demoObj.b="suren";
		
		VariablesDemo2.c=1;
		//demoObj.c=20;
		demoObj.display();
		
		demoObj.sayHello();
		
		
		// if you want to call the static methods or static variables from one class the
		// the calling class should be the static class or sttaic method

	}

}

