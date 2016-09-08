import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestChrome
{

	// ===================================================
	// ================== CHROME ========================
	// ==================================================

	@Test
	public void testChromeDiv()
	{
		System.setProperty("webdriver.chrome.driver", "D:/jar/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///D:/Dropbox/shared/McppHW/src/webTest/calculator.html");
		driver.findElement(By.id("num8")).click();
		driver.findElement(By.id("opDel")).click();
		driver.findElement(By.id("num2")).click();
		driver.findElement(By.id("opEq")).click();

		String str = driver.findElement(By.id("result")).getAttribute("value");
		driver.quit();
		assertEquals("4", str);
	}

	@Test
	public void testChromeDiv_1()
	{
		System.setProperty("webdriver.chrome.driver", "D:/jar/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///D:/Dropbox/shared/McppHW/src/webTest/calculator.html");
		driver.findElement(By.id("num2")).click();
		driver.findElement(By.id("num0")).click();
		driver.findElement(By.id("opDel")).click();
		driver.findElement(By.id("num2")).click();
		driver.findElement(By.id("opEq")).click();

		String str = driver.findElement(By.id("result")).getAttribute("value");
		driver.close();
		assertEquals("10", str);
	}

	@Test
	public void testChromeDiv_2()
	{
		System.setProperty("webdriver.chrome.driver", "D:/jar/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:/D:/Dropbox/shared/McppHW/src/webTest/calculator.html");
		driver.findElement(By.id("num2")).click();
		driver.findElement(By.id("num0")).click();
		driver.findElement(By.id("opDel")).click();
		driver.findElement(By.id("num1")).click();
		driver.findElement(By.id("num0")).click();
		driver.findElement(By.id("opEq")).click();

		String str = driver.findElement(By.id("result")).getAttribute("value");
		driver.close();
		assertEquals("2", str);
	}

	@Test
	public void testChromeMul()
	{
		System.setProperty("webdriver.chrome.driver", "D:/jar/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:/D:/Dropbox/shared/McppHW/src/webTest/calculator.html");
		driver.findElement(By.id("num7")).click();
		driver.findElement(By.id("opMul")).click();
		driver.findElement(By.id("num2")).click();
		driver.findElement(By.id("opEq")).click();

		String str = driver.findElement(By.id("result")).getAttribute("value");
		driver.close();
		assertEquals("14", str);
	}

	@Test
	public void testChromeMul_1()
	{
		System.setProperty("webdriver.chrome.driver", "D:/jar/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:/D:/Dropbox/shared/McppHW/src/webTest/calculator.html");
		driver.findElement(By.id("num2")).click();
		driver.findElement(By.id("num0")).click();
		driver.findElement(By.id("opMul")).click();
		driver.findElement(By.id("num2")).click();
		driver.findElement(By.id("opEq")).click();

		String str = driver.findElement(By.id("result")).getAttribute("value");
		driver.close();
		assertEquals("40", str);
	}

	@Test
	public void testChromeMul_2()
	{
		System.setProperty("webdriver.chrome.driver", "D:/jar/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:/D:/Dropbox/shared/McppHW/src/webTest/calculator.html");
		driver.findElement(By.id("num2")).click();
		driver.findElement(By.id("num0")).click();
		driver.findElement(By.id("opMul")).click();
		driver.findElement(By.id("num1")).click();
		driver.findElement(By.id("num0")).click();
		driver.findElement(By.id("opEq")).click();

		String str = driver.findElement(By.id("result")).getAttribute("value");
		driver.quit();
		assertEquals("200", str);
	}

	@Test
	public void testChromePlus()
	{
		System.setProperty("webdriver.chrome.driver", "D:/jar/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:/D:/Dropbox/shared/McppHW/src/webTest/calculator.html");
		driver.findElement(By.id("num2")).click();
		driver.findElement(By.id("opPlus")).click();
		driver.findElement(By.id("num2")).click();
		driver.findElement(By.id("opEq")).click();

		String str = driver.findElement(By.id("result")).getAttribute("value");
		driver.quit();
		assertEquals("4", str);
	}

	@Test
	public void testChromePlus_1()
	{
		System.setProperty("webdriver.chrome.driver", "D:/jar/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:/D:/Dropbox/shared/McppHW/src/webTest/calculator.html");
		driver.findElement(By.id("num2")).click();
		driver.findElement(By.id("num0")).click();
		driver.findElement(By.id("opPlus")).click();
		driver.findElement(By.id("num2")).click();
		driver.findElement(By.id("opEq")).click();

		String str = driver.findElement(By.id("result")).getAttribute("value");
		driver.quit();
		assertEquals("22", str);
	}

	@Test
	public void testChromePlus_2()
	{
		System.setProperty("webdriver.chrome.driver", "D:/jar/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:/D:/Dropbox/shared/McppHW/src/webTest/calculator.html");
		driver.findElement(By.id("num2")).click();
		driver.findElement(By.id("num0")).click();
		driver.findElement(By.id("opPlus")).click();
		driver.findElement(By.id("num1")).click();
		driver.findElement(By.id("num0")).click();
		driver.findElement(By.id("opEq")).click();

		String str = driver.findElement(By.id("result")).getAttribute("value");
		driver.quit();
		assertEquals("30", str);
	}

	@Test
	public void testChromeMinus()
	{
		System.setProperty("webdriver.chrome.driver", "D:/jar/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:/D:/Dropbox/shared/McppHW/src/webTest/calculator.html");
		driver.findElement(By.id("num6")).click();
		driver.findElement(By.id("opMinus")).click();
		driver.findElement(By.id("num4")).click();
		driver.findElement(By.id("opEq")).click();

		String str = driver.findElement(By.id("result")).getAttribute("value");
		driver.quit();
		assertEquals("2", str);
	}

	@Test
	public void testChromeMinus_1()
	{
		System.setProperty("webdriver.chrome.driver", "D:/jar/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:/D:/Dropbox/shared/McppHW/src/webTest/calculator.html");
		driver.findElement(By.id("num2")).click();
		driver.findElement(By.id("num0")).click();
		driver.findElement(By.id("opMinus")).click();
		driver.findElement(By.id("num2")).click();
		driver.findElement(By.id("opEq")).click();

		String str = driver.findElement(By.id("result")).getAttribute("value");
		driver.quit();
		assertEquals("18", str);
	}

	@Test
	public void testChromeMinus_2()
	{
		System.setProperty("webdriver.chrome.driver", "D:/jar/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:/D:/Dropbox/shared/McppHW/src/webTest/calculator.html");
		driver.findElement(By.id("num2")).click();
		driver.findElement(By.id("num0")).click();
		driver.findElement(By.id("opMinus")).click();
		driver.findElement(By.id("num1")).click();
		driver.findElement(By.id("num0")).click();
		driver.findElement(By.id("opEq")).click();

		String str = driver.findElement(By.id("result")).getAttribute("value");
		driver.quit();
		assertEquals("10", str);
	}
}
