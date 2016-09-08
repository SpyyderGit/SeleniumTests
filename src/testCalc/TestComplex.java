package testCalc;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestComplex
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
	public void testCalcBtn0()
	{
		drv.findElement(By.id("btn1")).click();
		drv.findElement(By.id("btn0")).click();
	}

	@Test
	public void testCalcBtn1()
	{
		drv.findElement(By.id("btn1")).click();
		drv.findElement(By.id("btn2")).click();
	}

	@Test
	public void testCalcBtn2()
	{
		drv.findElement(By.id("btn2")).click();
		drv.findElement(By.id("btn3")).click();
		drv.findElement(By.id("btn4")).click();
	}

	@Test
	public void testCalcBtn3()
	{
		drv.findElement(By.id("btn3")).click();
		drv.findElement(By.id("btn4")).click();
		drv.findElement(By.id("btn8")).click();
	}

	@Test
	public void testCalcBtn4()
	{
		drv.findElement(By.id("btn5")).click();
		drv.findElement(By.id("btn8")).click();
		drv.findElement(By.id("btn0")).click();
	}

	@Test
	public void testCalcBtn5()
	{
		drv.findElement(By.id("btn6")).click();
		drv.findElement(By.id("btn5")).click();
		drv.findElement(By.id("btn1")).click();
	}

	@Test
	public void testCalcBtn6()
	{
		drv.findElement(By.id("btn6")).click();
	}

	@Test
	public void testCalcBtn7()
	{
		drv.findElement(By.id("btn7")).click();
		drv.findElement(By.id("btn5")).click();
		drv.findElement(By.id("btn8")).click();
		drv.findElement(By.id("btn0")).click();
	}

	@Test
	public void testCalcBtn8()
	{
		drv.findElement(By.id("btn8")).click();
		drv.findElement(By.id("btn5")).click();
		drv.findElement(By.id("btn8")).click();
		drv.findElement(By.id("btn0")).click();
	}

	@Test
	public void testCalcBtnPlus()
	{
		drv.findElement(By.id("btnPlus")).click();
	}

	@Test
	public void testCalcBtnMin()
	{
		drv.findElement(By.id("btnMin")).click();
	}

	@Test
	public void testCalcBtnMul()
	{
		drv.findElement(By.id("btnMul")).click();
	}

	@Test
	public void testCalcBtnDiv()
	{
		drv.findElement(By.id("btnDiv")).click();
	}

	@Test
	public void testCalcbtnEq()
	{
		drv.findElement(By.id("btnEq")).click();
	}

	@Test
	public void testCalcBtn9()
	{
		drv.findElement(By.id("btn9")).click();
	}

	@AfterClass
	public static void closeDrv()
	{
		System.out.println(i);
		drv.quit();
	}
}
