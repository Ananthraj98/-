package testing;

public class Polymorphism_Overloading {
	  int a=1;
	  int b=3;
	  int c=5;
	 
//same method name with different arguments
void sum(int a,float b) {
	 System.out.println(a+b);
}
void sum(int a, int b, int c)
{
	System.out.println(a+b+c);
}
public static void main(String[] args) {
		// TODO Auto-generated method stub
	Polymorphism_Overloading obj=new Polymorphism_Overloading();
	//obj.sum(obj.a,obj.b);
	obj.sum(1,2);
	
	
}

}
