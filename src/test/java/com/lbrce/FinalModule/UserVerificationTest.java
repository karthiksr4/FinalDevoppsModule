package com.lbrce.FinalModule;
import org.testng.Assert;
import org.testng.annotations.Test;
public class UserVerificationTest {
	UserVerification uv=new UserVerification();
	@Test
	public void testcase1() {
		Assert.assertEquals(true,uv.check("Usha", "Usha@2020"));
	}
	@Test
	public void testcase2() {
		Assert.assertEquals(true,uv.check("usha", "usha@2020"));
	}
	@Test
	public void testcase3() {
		Assert.assertEquals(true,uv.check("Karthik", "Karthik@2020"));
	}
}
