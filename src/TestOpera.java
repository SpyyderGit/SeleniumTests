import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;

public class TestOpera
{

	@Test
	public void testOperaDiv()
	{
//		System.setProperty("webdriver.opera.driver", "D:/jar/operadriver.exe");
//		SimpleTest.driver = new OperaDriver();
//		SimpleTest.driver.get("file:///D:/Dropbox/shared/McppHW/src/webTest/calculator.html");
		SimpleTest.driver.findElement(By.id("num8")).click();
		SimpleTest.driver.findElement(By.id("opDel")).click();
		SimpleTest.driver.findElement(By.id("num2")).click();
		SimpleTest.driver.findElement(By.id("opEq")).click();

		String str = SimpleTest.driver.findElement(By.id("result")).getAttribute("value");
		SimpleTest.driver.quit();
		assertEquals("4", str);
	}

	@Test
	public void testOperaDiv_1()
	{
//		System.setProperty("webdriver.opera.driver", "D:/jar/operadriver.exe");
//		SimpleTest.driver = new OperaDriver();
//		SimpleTest.driver.get("file:///D:/Dropbox/shared/McppHW/src/webTest/calculator.html");
		SimpleTest.driver.findElement(By.id("num2")).click();
		SimpleTest.driver.findElement(By.id("num0")).click();
		SimpleTest.driver.findElement(By.id("opDel")).click();
		SimpleTest.driver.findElement(By.id("num2")).click();
		SimpleTest.driver.findElement(By.id("opEq")).click();

		String str = SimpleTest.driver.findElement(By.id("result")).getAttribute("value");
		SimpleTest.driver.quit();
		assertEquals("10", str);
	}

	@Test
	public void testOperaDiv_2()
	{
		System.setProperty("webdriver.opera.driver", "D:/jar/operadriver.exe");
		WebDriver driver = new OperaDriver();
		driver.get("file:///D:/Dropbox/shared/McppHW/src/webTest/calculator.html");
		driver.findElement(By.id("num2")).click();
		driver.findElement(By.id("num0")).click();
		driver.findElement(By.id("opDel")).click();
		driver.findElement(By.id("num1")).click();
		driver.findElement(By.id("num0")).click();
		driver.findElement(By.id("opEq")).click();

		String str = driver.findElement(By.id("result")).getAttribute("value");
		driver.quit();
		assertEquals("2", str);
	}

	@Test
	public void testOperaMul()
	{
		System.setProperty("webdriver.opera.driver", "D:/jar/operadriver.exe");
		WebDriver driver = new OperaDriver();
		driver.get("file:///D:/Dropbox/shared/McppHW/src/webTest/calculator.html");
		driver.findElement(By.id("num7")).click();
		driver.findElement(By.id("opMul")).click();
		driver.findElement(By.id("num2")).click();
		driver.findElement(By.id("opEq")).click();

		String str = driver.findElement(By.id("result")).getAttribute("value");
		driver.quit();
		assertEquals("14", str);
	}
//
//	@Test
//	public void testOperaMul_1()
//	{
//		System.setProperty("webdriver.opera.driver", "D:/jar/operadriver.exe");
//		WebDriver driver = new OperaDriver();
//		driver.get("file:///D:/Dropbox/shared/McppHW/src/webTest/calculator.html");
//		driver.findElement(By.id("num2")).click();
//		driver.findElement(By.id("num0")).click();
//		driver.findElement(By.id("opMul")).click();
//		driver.findElement(By.id("num2")).click();
//		driver.findElement(By.id("opEq")).click();
//
//		String str = driver.findElement(By.id("result")).getAttribute("value");
//		driver.quit();
//		assertEquals("40", str);
//	}
//
//	@Test
//	public void testOperaMul_2()
//	{
//		System.setProperty("webdriver.opera.driver", "D:/jar/operadriver.exe");
//		WebDriver driver = new OperaDriver();
//		driver.get("file:///D:/Dropbox/shared/McppHW/src/webTest/calculator.html");
//		driver.findElement(By.id("num2")).click();
//		driver.findElement(By.id("num0")).click();
//		driver.findElement(By.id("opMul")).click();
//		driver.findElement(By.id("num1")).click();
//		driver.findElement(By.id("num0")).click();
//		driver.findElement(By.id("opEq")).click();
//
//		String str = driver.findElement(By.id("result")).getAttribute("value");
//		driver.quit();
//		assertEquals("200", str);
//	}
//
//	@Test
//	public void testOperaPlus()
//	{
//		System.setProperty("webdriver.opera.driver", "D:/jar/operadriver.exe");
//		WebDriver driver = new OperaDriver();
//		driver.get("file:///D:/Dropbox/shared/McppHW/src/webTest/calculator.html");
//		driver.findElement(By.id("num2")).click();
//		driver.findElement(By.id("opPlus")).click();
//		driver.findElement(By.id("num2")).click();
//		driver.findElement(By.id("opEq")).click();
//
//		String str = driver.findElement(By.id("result")).getAttribute("value");
//		driver.quit();
//		assertEquals("4", str);
//	}
//
//	@Test
//	public void testOperaPlus_1()
//	{
//		System.setProperty("webdriver.opera.driver", "D:/jar/operadriver.exe");
//		WebDriver driver = new OperaDriver();
//		driver.get("file:///D:/Dropbox/shared/McppHW/src/webTest/calculator.html");
//		driver.findElement(By.id("num2")).click();
//		driver.findElement(By.id("num0")).click();
//		driver.findElement(By.id("opPlus")).click();
//		driver.findElement(By.id("num2")).click();
//		driver.findElement(By.id("opEq")).click();
//
//		String str = driver.findElement(By.id("result")).getAttribute("value");
//		driver.quit();
//		assertEquals("22", str);
//	}
//
//	@Test
//	public void testOperaPlus_2()
//	{
//		System.setProperty("webdriver.opera.driver", "D:/jar/operadriver.exe");
//		WebDriver driver = new OperaDriver();
//		driver.get("file:///D:/Dropbox/shared/McppHW/src/webTest/calculator.html");
//		driver.findElement(By.id("num2")).click();
//		driver.findElement(By.id("num0")).click();
//		driver.findElement(By.id("opPlus")).click();
//		driver.findElement(By.id("num1")).click();
//		driver.findElement(By.id("num0")).click();
//		driver.findElement(By.id("opEq")).click();
//
//		String str = driver.findElement(By.id("result")).getAttribute("value");
//		driver.quit();
//		assertEquals("30", str);
//	}
//
//	@Test
//	public void testOperaMinus()
//	{
//		System.setProperty("webdriver.opera.driver", "D:/jar/operadriver.exe");
//		WebDriver driver = new OperaDriver();
//		driver.get("file:///D:/Dropbox/shared/McppHW/src/webTest/calculator.html");
//		driver.findElement(By.id("num6")).click();
//		driver.findElement(By.id("opMinus")).click();
//		driver.findElement(By.id("num4")).click();
//		driver.findElement(By.id("opEq")).click();
//
//		String str = driver.findElement(By.id("result")).getAttribute("value");
//		driver.quit();
//		assertEquals("2", str);
//	}
//
//	@Test
//	public void testOperaMinus_1()
//	{
//		System.setProperty("webdriver.opera.driver", "D:/jar/operadriver.exe");
//		WebDriver driver = new OperaDriver();
//		driver.get("file:///D:/Dropbox/shared/McppHW/src/webTest/calculator.html");
//		driver.findElement(By.id("num2")).click();
//		driver.findElement(By.id("num0")).click();
//		driver.findElement(By.id("opMinus")).click();
//		driver.findElement(By.id("num2")).click();
//		driver.findElement(By.id("opEq")).click();
//
//		String str = driver.findElement(By.id("result")).getAttribute("value");
//		driver.quit();
//		assertEquals("18", str);
//	}
//
//	@Test
//	public void testOperaMinus_2()
//	{
//		System.setProperty("webdriver.opera.driver", "D:/jar/operadriver.exe");
//		WebDriver driver = new OperaDriver();
//		driver.get("file:///D:/Dropbox/shared/McppHW/src/webTest/calculator.html");
//		driver.findElement(By.id("num2")).click();
//		driver.findElement(By.id("num0")).click();
//		driver.findElement(By.id("opMinus")).click();
//		driver.findElement(By.id("num1")).click();
//		driver.findElement(By.id("num0")).click();
//		driver.findElement(By.id("opEq")).click();
//
//		String str = driver.findElement(By.id("result")).getAttribute("value");
//		driver.quit();
//		assertEquals("10", str);
//	}

}
