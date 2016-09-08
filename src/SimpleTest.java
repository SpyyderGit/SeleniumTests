import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;

public class SimpleTest
{
	static WebDriver driver = null;

	@BeforeClass
	public static void openDrv()
	{
		System.setProperty("webdriver.opera.driver", "D:/jar/operadriver.exe");
		driver = new OperaDriver();
		driver.get("file:///D:/Dropbox/shared/McppHW/src/webTest/calculator.html");
	}
	
	@Before
	public void refreshDrv()
	{
		driver.navigate().refresh();
	}

	@Test
	public void testOperaDiv()
	{
		driver.findElement(By.id("num8")).click();
		driver.findElement(By.id("opDel")).click();
		driver.findElement(By.id("num2")).click();
		driver.findElement(By.id("opEq")).click();

		String str = driver.findElement(By.id("result")).getAttribute("value");
		
		assertEquals("4", str);
	}

	@Test
	public void testOperaDiv_1()
	{
		driver.findElement(By.id("num2")).click();
		driver.findElement(By.id("num0")).click();
		driver.findElement(By.id("opDel")).click();
		driver.findElement(By.id("num2")).click();
		driver.findElement(By.id("opEq")).click();

		String str = driver.findElement(By.id("result")).getAttribute("value");
		
		assertEquals("10", str);
	}

	@Test
	public void testOperaDiv_2()
	{
		driver.findElement(By.id("num2")).click();
		driver.findElement(By.id("num0")).click();
		driver.findElement(By.id("opDel")).click();
		driver.findElement(By.id("num1")).click();
		driver.findElement(By.id("num0")).click();
		driver.findElement(By.id("opEq")).click();

		String str = driver.findElement(By.id("result")).getAttribute("value");
		
		assertEquals("2", str);
	}

	@Test
	public void testOperaMul()
	{
		driver.findElement(By.id("num7")).click();
		driver.findElement(By.id("opMul")).click();
		driver.findElement(By.id("num2")).click();
		driver.findElement(By.id("opEq")).click();

		String str = driver.findElement(By.id("result")).getAttribute("value");
		
		assertEquals("14", str);
	}

	@Test
	public void testOperaMul_1()
	{
		driver.findElement(By.id("num2")).click();
		driver.findElement(By.id("num0")).click();
		driver.findElement(By.id("opMul")).click();
		driver.findElement(By.id("num2")).click();
		driver.findElement(By.id("opEq")).click();

		String str = driver.findElement(By.id("result")).getAttribute("value");
		
		assertEquals("40", str);
	}

	@Test
	public void testOperaMul_2()
	{
		driver.findElement(By.id("num2")).click();
		driver.findElement(By.id("num0")).click();
		driver.findElement(By.id("opMul")).click();
		driver.findElement(By.id("num1")).click();
		driver.findElement(By.id("num0")).click();
		driver.findElement(By.id("opEq")).click();

		String str = driver.findElement(By.id("result")).getAttribute("value");
		
		assertEquals("200", str);
	}

	@Test
	public void testOperaPlus()
	{
		driver.findElement(By.id("num2")).click();
		driver.findElement(By.id("opPlus")).click();
		driver.findElement(By.id("num2")).click();
		driver.findElement(By.id("opEq")).click();

		String str = driver.findElement(By.id("result")).getAttribute("value");
		
		assertEquals("4", str);
	}

	@Test
	public void testOperaPlus_1()
	{
		driver.findElement(By.id("num2")).click();
		driver.findElement(By.id("num0")).click();
		driver.findElement(By.id("opPlus")).click();
		driver.findElement(By.id("num2")).click();
		driver.findElement(By.id("opEq")).click();

		String str = driver.findElement(By.id("result")).getAttribute("value");
		
		assertEquals("22", str);
	}

	@Test
	public void testOperaPlus_2()
	{
		driver.findElement(By.id("num2")).click();
		driver.findElement(By.id("num0")).click();
		driver.findElement(By.id("opPlus")).click();
		driver.findElement(By.id("num1")).click();
		driver.findElement(By.id("num0")).click();
		driver.findElement(By.id("opEq")).click();

		String str = driver.findElement(By.id("result")).getAttribute("value");
		
		assertEquals("30", str);
	}

	@Test
	public void testOperaMinus()
	{
		driver.findElement(By.id("num6")).click();
		driver.findElement(By.id("opMinus")).click();
		driver.findElement(By.id("num4")).click();
		driver.findElement(By.id("opEq")).click();

		String str = driver.findElement(By.id("result")).getAttribute("value");
		
		assertEquals("2", str);
	}

	@Test
	public void testOperaMinus_1()
	{
		driver.findElement(By.id("num2")).click();
		driver.findElement(By.id("num0")).click();
		driver.findElement(By.id("opMinus")).click();
		driver.findElement(By.id("num2")).click();
		driver.findElement(By.id("opEq")).click();

		String str = driver.findElement(By.id("result")).getAttribute("value");
		
		assertEquals("18", str);
	}

	@Test
	public void testOperaMinus_2()
	{
		driver.findElement(By.id("num2")).click();
		driver.findElement(By.id("num0")).click();
		driver.findElement(By.id("opMinus")).click();
		driver.findElement(By.id("num1")).click();
		driver.findElement(By.id("num0")).click();
		driver.findElement(By.id("opEq")).click();

		String str = driver.findElement(By.id("result")).getAttribute("value");
		
		assertEquals("10", str);
	}

	@AfterClass
	public static void closeDrv()
	{
		driver.quit();
	}

}
