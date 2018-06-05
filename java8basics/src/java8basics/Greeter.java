package java8basics;

public class Greeter {
public void greet(Greeting grreting) {
	grreting.perform();
	
	
}

public static void main(String args[]) {
	Greeter obj = new Greeter();
	HellowWorldGreeting hellowWorldGreeting = new HellowWorldGreeting();
	MyLambda mylambdavariable = ()-> System.out.println("Hellow World with mylambdavariable");
	MyAdd addFunction = (int a, int b) -> a+b;
	
	Greeting objGreeting = ()-> System.out.println("Hellow World with Lamdaaaaaaaaaaa");
	
	
	obj.greet(objGreeting);
}
}


interface MyLambda {
	void foo();
}

interface MyAdd {
	int add (int a, int b);
}