package testCalc;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestExistence
{

	public static WebDriver drv = null;

	@BeforeClass
	public static void initDrv()
	{
		System.setProperty("webdriver.chrome.driver", "D:/jar/chromedriver.exe");
		drv = new ChromeDriver();
		drv.get("file:///D:/Dropbox/shared/JavaScript/calculator.html ");
	}

	@Test
	public void testCalcMainInput()
	{
		assertTrue(drv.findElement(By.id("mainInput")).isDisplayed());
	}
	
	@Test
	public void testCalcBtn0()
	{
		assertTrue(drv.findElement(By.id("btn0")).isDisplayed());
	}

	@Test
	public void testCalcBtn1()
	{
		assertTrue(drv.findElement(By.id("btn1")).isDisplayed());
	}

	@Test
	public void testCalcBtn2()
	{
		assertTrue(drv.findElement(By.id("btn2")).isDisplayed());
	}

	@Test
	public void testCalcBtn3()
	{
		assertTrue(drv.findElement(By.id("btn3")).isDisplayed());
	}

	@Test
	public void testCalcBtn4()
	{
		assertTrue(drv.findElement(By.id("btn4")).isDisplayed());
	}

	@Test
	public void testCalcBtn5()
	{
		assertTrue(drv.findElement(By.id("btn5")).isDisplayed());
	}

	@Test
	public void testCalcBtn6()
	{
		assertTrue(drv.findElement(By.id("btn6")).isDisplayed());
	}

	@Test
	public void testCalcBtn7()
	{
		assertTrue(drv.findElement(By.id("btn7")).isDisplayed());
	}

	@Test
	public void testCalcBtn8()
	{
		assertTrue(drv.findElement(By.id("btn8")).isDisplayed());
	}

	@Test
	public void testCalcBtnPlus()
	{
		assertTrue(drv.findElement(By.id("btnPlus")).isDisplayed());
	}

	@Test
	public void testCalcBtnMin()
	{
		assertTrue(drv.findElement(By.id("btnMin")).isDisplayed());
	}

	@Test
	public void testCalcBtnMul()
	{
		assertTrue(drv.findElement(By.id("btnMul")).isDisplayed());
	}

	@Test
	public void testCalcBtnDiv()
	{
		assertTrue(drv.findElement(By.id("btnDiv")).isDisplayed());
	}

	@Test
	public void testCalcbtnEq()
	{
		assertTrue(drv.findElement(By.id("btnEq")).isDisplayed());
	}

	@Test
	public void testCalcBtn9()
	{
		assertTrue(drv.findElement(By.id("btn9")).isDisplayed());
	}

	@AfterClass
	public static void closeDrv()
	{
		drv.quit();
	}
}
