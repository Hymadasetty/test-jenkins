package sampletestcases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests {

@Test
public void verifyloginwithvalidcredential() {
	
	 System.out.println(" Test starting");	 
	 Assert.assertTrue(true);
	 System.out.println("Test End");
}
@Test
public void verifyloginwithInvalidcredential() {
	 System.out.println(" Test starting");	 
	 Assert.assertTrue(true);
	 System.out.println("Test End Successfully");
}





}
