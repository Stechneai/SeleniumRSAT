package runtt.runtt;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import dev.failsafe.internal.util.Assert;

public class TTC extends BaseClass {

	@Test(priority = 1)
	public void test1() throws InterruptedException {
		pp.setemail().sendKeys("SayaliV");
		Thread.sleep(3000);
		pp.setpassword().sendKeys("abcd123");
		Thread.sleep(3000);
		pp.btnClick().click();
	}

	@Test(priority = 2)
	public void test2() throws InterruptedException {

		pp.masters().click();
		Thread.sleep(3000);
	}

	@Test(priority = 3)
	public void test3() throws InterruptedException {
		pp.country().click();
		Thread.sleep(3000);
	}

	@Test(priority = 4)
	public void test4() {
		pp.addCountries().click();
	}
	@Test(priority = 5)
	public void test5() {
		assertEquals(pp.headingmain().getText(), "Add City");
	}

}
