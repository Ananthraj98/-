package Java_Learning;

public class Static_Variable {
	int a=10;
	static int b=5;//statisc variable is nothing but it belongs to class not an object
  
	void example() {
	a++;
	b++;
	System.out.println("x axis :" +a + "y axis:" +b);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Static_Variable T1= new Static_Variable();
		T1.example();
		System.out.println("2nd time");
		Static_Variable T2= new Static_Variable();
		T2.example();
		
//In static method object n need to call just we can call the class name.
		//In static function non static variable will not run
		//In static method this. will not work
	}

}
