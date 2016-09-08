package testCalc;

import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RealJob
{

	public static WebDriver drv = null;
	public static int i = 0;

	@BeforeClass
	public static void initDrv()
	{
		System.setProperty("webdriver.chrome.driver", "D:/jar/chromedriver.exe");
		drv = new ChromeDriver();
		drv.get("file:///D:/Dropbox/shared/JavaScript/calculator.html");
	}

	@Before
	public void refreshCalc()
	{
		drv.navigate().refresh();
	}

	@Test
	public void testChromeDiv()
	{
		drv.findElement(By.id("btn8")).click();
		drv.findElement(By.id("btnDiv")).click();
		drv.findElement(By.id("btn2")).click();
		drv.findElement(By.id("btnEq")).click();

		String str = drv.findElement(By.id("mainInput")).getAttribute("value");

		assertEquals("4", str);
	}

	@Test
	public void testChromeDiv_1()
	{

		drv.findElement(By.id("btn2")).click();
		drv.findElement(By.id("btn0")).click();
		drv.findElement(By.id("btnDiv")).click();
		drv.findElement(By.id("btn2")).click();
		drv.findElement(By.id("btnEq")).click();

		String str = drv.findElement(By.id("mainInput")).getAttribute("value");

		assertEquals("10", str);
	}

	@Test
	public void testChromeDiv_2()
	{

		drv.findElement(By.id("btn2")).click();
		drv.findElement(By.id("btn0")).click();
		drv.findElement(By.id("btnDiv")).click();
		drv.findElement(By.id("btn1")).click();
		drv.findElement(By.id("btn0")).click();
		drv.findElement(By.id("btnEq")).click();

		String str = drv.findElement(By.id("mainInput")).getAttribute("value");

		assertEquals("2", str);
	}

	@Test
	public void testChromeMul()
	{

		drv.findElement(By.id("btn7")).click();
		drv.findElement(By.id("btnMul")).click();
		drv.findElement(By.id("btn2")).click();
		drv.findElement(By.id("btnEq")).click();

		String str = drv.findElement(By.id("mainInput")).getAttribute("value");

		assertEquals("14", str);
	}

	@Test
	public void testChromeMul_1()
	{

		drv.findElement(By.id("btn2")).click();
		drv.findElement(By.id("btn0")).click();
		drv.findElement(By.id("btnMul")).click();
		drv.findElement(By.id("btn2")).click();
		drv.findElement(By.id("btnEq")).click();

		String str = drv.findElement(By.id("mainInput")).getAttribute("value");

		assertEquals("40", str);
	}

	@Test
	public void testChromeMul_2()
	{

		drv.findElement(By.id("btn2")).click();
		drv.findElement(By.id("btn0")).click();
		drv.findElement(By.id("btnMul")).click();
		drv.findElement(By.id("btn1")).click();
		drv.findElement(By.id("btn0")).click();
		drv.findElement(By.id("btnEq")).click();

		String str = drv.findElement(By.id("mainInput")).getAttribute("value");

		assertEquals("200", str);
	}

	@Test
	public void testChromePlus()
	{

		drv.findElement(By.id("btn2")).click();
		drv.findElement(By.id("btnPlus")).click();
		drv.findElement(By.id("btn2")).click();
		drv.findElement(By.id("btnEq")).click();

		String str = drv.findElement(By.id("mainInput")).getAttribute("value");

		assertEquals("4", str);
	}

	@Test
	public void testChromePlus_1()
	{

		drv.findElement(By.id("btn2")).click();
		drv.findElement(By.id("btn0")).click();
		drv.findElement(By.id("btnPlus")).click();
		drv.findElement(By.id("btn2")).click();
		drv.findElement(By.id("btnEq")).click();

		String str = drv.findElement(By.id("mainInput")).getAttribute("value");

		assertEquals("22", str);
	}

	@Test
	public void testChromePlus_2()
	{

		drv.findElement(By.id("btn2")).click();
		drv.findElement(By.id("btn0")).click();
		drv.findElement(By.id("btnPlus")).click();
		drv.findElement(By.id("btn1")).click();
		drv.findElement(By.id("btn0")).click();
		drv.findElement(By.id("btnEq")).click();

		String str = drv.findElement(By.id("mainInput")).getAttribute("value");

		assertEquals("30", str);
	}

	@Test
	public void testChromeMinus()
	{

		drv.findElement(By.id("btn6")).click();
		drv.findElement(By.id("btnMin")).click();
		drv.findElement(By.id("btn4")).click();
		drv.findElement(By.id("btnEq")).click();

		String str = drv.findElement(By.id("mainInput")).getAttribute("value");

		assertEquals("2", str);
	}

	@Test
	public void testChromeMinus_1()
	{

		drv.findElement(By.id("btn2")).click();
		drv.findElement(By.id("btn0")).click();
		drv.findElement(By.id("btnMin")).click();
		drv.findElement(By.id("btn2")).click();
		drv.findElement(By.id("btnEq")).click();

		String str = drv.findElement(By.id("mainInput")).getAttribute("value");

		assertEquals("18", str);
	}

	@Test
	public void testChromeMinus_2()
	{

		drv.findElement(By.id("btn2")).click();
		drv.findElement(By.id("btn0")).click();
		drv.findElement(By.id("btnMin")).click();
		drv.findElement(By.id("btn1")).click();
		drv.findElement(By.id("btn0")).click();
		drv.findElement(By.id("btnEq")).click();

		String str = drv.findElement(By.id("mainInput")).getAttribute("value");

		assertEquals("10", str);
	}

	@AfterClass
	public static void closeDrv()
	{
		System.out.println(i);
		drv.quit();
	}

}
