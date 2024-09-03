package testing;

public class Class_Object_Method {    //static method and variable
	int a = 6;
	public void Tech() {
		a = 10;
		  System.out.println(a);
	}
	
	public void Tech1() {
		int b = 5;
		  System.out.println(a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  int dev;
	  
	  char live;
//	  Tech1();
	  
	  //Class_Object_Method obj = new Class_Object_Method();
	  
	  Class_Object_Method obj = new Class_Object_Method();
	  obj.Tech1();
	  //obj1.Tech1();
 
	
	}
}
