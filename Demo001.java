public class Demo001{ // driver class
 
	public static void main(String[] args){
		//main is a method 
		//the code execution starts from here and ends here
		System.out.println("hi I m displaying my msg from main method");
 
		A obj1 = new A();
		obj1.method1();
		B obj2 = new B();
		obj2.method2();
	}
 
}
class A{
 
	void method1(){
		//main is a method 
		//the code execution starts from here and ends here
		System.out.println("hi I m displaying my msg from method1 method");
	}
 
}
class B{
 
	void method2(){
		//main is a method 
		//the code execution starts from here and ends here
		System.out.println("hi I m displaying my msg from method2 method");
	}
 
}