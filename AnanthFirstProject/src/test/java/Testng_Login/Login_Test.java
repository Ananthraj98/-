package Testng_Login;

import org.testng.annotations.Test;

public class Login_Test {
  @Test(priority=2)
  void openapp()  {
	  System.out.println("Op");
  }

  @Test(priority=1)
  void cl() {
	  System.out.println("closed");

  }  
  }

