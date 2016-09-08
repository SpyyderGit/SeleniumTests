import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

public class CTest
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
		driver.close();
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
		driver.get("file:///D:/Dropbox/shared/McppHW/src/webTest/calculator.html");
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
		driver.get("file:///D:/Dropbox/shared/McppHW/src/webTest/calculator.html");
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
		driver.get("file:///D:/Dropbox/shared/McppHW/src/webTest/calculator.html");
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
		driver.get("file:///D:/Dropbox/shared/McppHW/src/webTest/calculator.html");
		driver.findElement(By.id("num2")).click();
		driver.findElement(By.id("num0")).click();
		driver.findElement(By.id("opMul")).click();
		driver.findElement(By.id("num1")).click();
		driver.findElement(By.id("num0")).click();
		driver.findElement(By.id("opEq")).click();

		String str = driver.findElement(By.id("result")).getAttribute("value");
		driver.close();
		assertEquals("200", str);
	}

	@Test
	public void testChromePlus()
	{
		System.setProperty("webdriver.chrome.driver", "D:/jar/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///D:/Dropbox/shared/McppHW/src/webTest/calculator.html");
		driver.findElement(By.id("num2")).click();
		driver.findElement(By.id("opPlus")).click();
		driver.findElement(By.id("num2")).click();
		driver.findElement(By.id("opEq")).click();

		String str = driver.findElement(By.id("result")).getAttribute("value");
		driver.close();
		assertEquals("4", str);
	}

	@Test
	public void testChromePlus_1()
	{
		System.setProperty("webdriver.chrome.driver", "D:/jar/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///D:/Dropbox/shared/McppHW/src/webTest/calculator.html");
		driver.findElement(By.id("num2")).click();
		driver.findElement(By.id("num0")).click();
		driver.findElement(By.id("opPlus")).click();
		driver.findElement(By.id("num2")).click();
		driver.findElement(By.id("opEq")).click();

		String str = driver.findElement(By.id("result")).getAttribute("value");
		driver.close();
		assertEquals("22", str);
	}

	@Test
	public void testChromePlus_2()
	{
		System.setProperty("webdriver.chrome.driver", "D:/jar/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///D:/Dropbox/shared/McppHW/src/webTest/calculator.html");
		driver.findElement(By.id("num2")).click();
		driver.findElement(By.id("num0")).click();
		driver.findElement(By.id("opPlus")).click();
		driver.findElement(By.id("num1")).click();
		driver.findElement(By.id("num0")).click();
		driver.findElement(By.id("opEq")).click();

		String str = driver.findElement(By.id("result")).getAttribute("value");
		driver.close();
		assertEquals("30", str);
	}

	@Test
	public void testChromeMinus()
	{
		System.setProperty("webdriver.chrome.driver", "D:/jar/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///D:/Dropbox/shared/McppHW/src/webTest/calculator.html");
		driver.findElement(By.id("num6")).click();
		driver.findElement(By.id("opMinus")).click();
		driver.findElement(By.id("num4")).click();
		driver.findElement(By.id("opEq")).click();

		String str = driver.findElement(By.id("result")).getAttribute("value");
		driver.close();
		assertEquals("2", str);
	}

	@Test
	public void testChromeMinus_1()
	{
		System.setProperty("webdriver.chrome.driver", "D:/jar/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///D:/Dropbox/shared/McppHW/src/webTest/calculator.html");
		driver.findElement(By.id("num2")).click();
		driver.findElement(By.id("num0")).click();
		driver.findElement(By.id("opMinus")).click();
		driver.findElement(By.id("num2")).click();
		driver.findElement(By.id("opEq")).click();

		String str = driver.findElement(By.id("result")).getAttribute("value");
		driver.close();
		assertEquals("18", str);
	}

	@Test
	public void testChromeMinus_2()
	{
		System.setProperty("webdriver.chrome.driver", "D:/jar/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///D:/Dropbox/shared/McppHW/src/webTest/calculator.html");
		driver.findElement(By.id("num2")).click();
		driver.findElement(By.id("num0")).click();
		driver.findElement(By.id("opMinus")).click();
		driver.findElement(By.id("num1")).click();
		driver.findElement(By.id("num0")).click();
		driver.findElement(By.id("opEq")).click();

		String str = driver.findElement(By.id("result")).getAttribute("value");
		driver.close();
		assertEquals("10", str);
	}
	
	
	
	
	// ===================================================
	// ================== OPERA ========================
		// ==================================================

		@Test
		public void testOperaDiv()
		{
			System.setProperty("webdriver.opera.driver", "D:/jar/operadriver.exe");
			WebDriver driver = new OperaDriver();
			driver.get("file:///D:/Dropbox/shared/McppHW/src/webTest/calculator.html");
			driver.findElement(By.id("num8")).click();
			driver.findElement(By.id("opDel")).click();
			driver.findElement(By.id("num2")).click();
			driver.findElement(By.id("opEq")).click();

			String str = driver.findElement(By.id("result")).getAttribute("value");
			driver.close();
			assertEquals("4", str);
		}

		@Test
		public void testOperaDiv_1()
		{
			System.setProperty("webdriver.opera.driver", "D:/jar/operadriver.exe");
			WebDriver driver = new OperaDriver();
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
			driver.close();
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
			driver.close();
			assertEquals("14", str);
		}

		@Test
		public void testOperaMul_1()
		{
			System.setProperty("webdriver.opera.driver", "D:/jar/operadriver.exe");
			WebDriver driver = new OperaDriver();
			driver.get("file:///D:/Dropbox/shared/McppHW/src/webTest/calculator.html");
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
		public void testOperaMul_2()
		{
			System.setProperty("webdriver.opera.driver", "D:/jar/operadriver.exe");
			WebDriver driver = new OperaDriver();
			driver.get("file:///D:/Dropbox/shared/McppHW/src/webTest/calculator.html");
			driver.findElement(By.id("num2")).click();
			driver.findElement(By.id("num0")).click();
			driver.findElement(By.id("opMul")).click();
			driver.findElement(By.id("num1")).click();
			driver.findElement(By.id("num0")).click();
			driver.findElement(By.id("opEq")).click();

			String str = driver.findElement(By.id("result")).getAttribute("value");
			driver.close();
			assertEquals("200", str);
		}

		@Test
		public void testOperaPlus()
		{
			System.setProperty("webdriver.opera.driver", "D:/jar/operadriver.exe");
			WebDriver driver = new OperaDriver();
			driver.get("file:///D:/Dropbox/shared/McppHW/src/webTest/calculator.html");
			driver.findElement(By.id("num2")).click();
			driver.findElement(By.id("opPlus")).click();
			driver.findElement(By.id("num2")).click();
			driver.findElement(By.id("opEq")).click();

			String str = driver.findElement(By.id("result")).getAttribute("value");
			driver.close();
			assertEquals("4", str);
		}

		@Test
		public void testOperaPlus_1()
		{
			System.setProperty("webdriver.opera.driver", "D:/jar/operadriver.exe");
			WebDriver driver = new OperaDriver();
			driver.get("file:///D:/Dropbox/shared/McppHW/src/webTest/calculator.html");
			driver.findElement(By.id("num2")).click();
			driver.findElement(By.id("num0")).click();
			driver.findElement(By.id("opPlus")).click();
			driver.findElement(By.id("num2")).click();
			driver.findElement(By.id("opEq")).click();

			String str = driver.findElement(By.id("result")).getAttribute("value");
			driver.close();
			assertEquals("22", str);
		}

		@Test
		public void testOperaPlus_2()
		{
			System.setProperty("webdriver.opera.driver", "D:/jar/operadriver.exe");
			WebDriver driver = new OperaDriver();
			driver.get("file:///D:/Dropbox/shared/McppHW/src/webTest/calculator.html");
			driver.findElement(By.id("num2")).click();
			driver.findElement(By.id("num0")).click();
			driver.findElement(By.id("opPlus")).click();
			driver.findElement(By.id("num1")).click();
			driver.findElement(By.id("num0")).click();
			driver.findElement(By.id("opEq")).click();

			String str = driver.findElement(By.id("result")).getAttribute("value");
			driver.close();
			assertEquals("30", str);
		}

		@Test
		public void testOperaMinus()
		{
			System.setProperty("webdriver.opera.driver", "D:/jar/operadriver.exe");
			WebDriver driver = new OperaDriver();
			driver.get("file:///D:/Dropbox/shared/McppHW/src/webTest/calculator.html");
			driver.findElement(By.id("num6")).click();
			driver.findElement(By.id("opMinus")).click();
			driver.findElement(By.id("num4")).click();
			driver.findElement(By.id("opEq")).click();

			String str = driver.findElement(By.id("result")).getAttribute("value");
			driver.close();
			assertEquals("2", str);
		}

		@Test
		public void testOperaMinus_1()
		{
			System.setProperty("webdriver.opera.driver", "D:/jar/operadriver.exe");
			WebDriver driver = new OperaDriver();
			driver.get("file:///D:/Dropbox/shared/McppHW/src/webTest/calculator.html");
			driver.findElement(By.id("num2")).click();
			driver.findElement(By.id("num0")).click();
			driver.findElement(By.id("opMinus")).click();
			driver.findElement(By.id("num2")).click();
			driver.findElement(By.id("opEq")).click();

			String str = driver.findElement(By.id("result")).getAttribute("value");
			driver.close();
			assertEquals("18", str);
		}

		@Test
		public void testOperaMinus_2()
		{
			System.setProperty("webdriver.opera.driver", "D:/jar/operadriver.exe");
			WebDriver driver = new OperaDriver();
			driver.get("file:///D:/Dropbox/shared/McppHW/src/webTest/calculator.html");
			driver.findElement(By.id("num2")).click();
			driver.findElement(By.id("num0")).click();
			driver.findElement(By.id("opMinus")).click();
			driver.findElement(By.id("num1")).click();
			driver.findElement(By.id("num0")).click();
			driver.findElement(By.id("opEq")).click();

			String str = driver.findElement(By.id("result")).getAttribute("value");
			driver.close();
			assertEquals("10", str);
		}


		
		
		// ===================================================
		// ================== OPERA ========================
			// ==================================================

			@Test
			public void testFirefoxDiv()
			{
				System.setProperty("webdriver.gecko.driver", "D:/jar/geckodriver.exe");
				WebDriver driver = new FirefoxDriver();
				driver.get("file:///D:/Dropbox/shared/McppHW/src/webTest/calculator.html");
				driver.findElement(By.id("num8")).click();
				driver.findElement(By.id("opDel")).click();
				driver.findElement(By.id("num2")).click();
				driver.findElement(By.id("opEq")).click();

				String str = driver.findElement(By.id("result")).getAttribute("value");
				driver.close();
				assertEquals("4", str);
			}

			@Test
			public void testFirefoxDiv_1()
			{
				System.setProperty("webdriver.gecko.driver", "D:/jar/geckodriver.exe");
				WebDriver driver = new FirefoxDriver();
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
			public void testFirefoxDiv_2()
			{
				System.setProperty("webdriver.gecko.driver", "D:/jar/geckodriver.exe");
				WebDriver driver = new FirefoxDriver();
				driver.get("file:///D:/Dropbox/shared/McppHW/src/webTest/calculator.html");
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
			public void testFirefoxMul()
			{
				System.setProperty("webdriver.gecko.driver", "D:/jar/geckodriver.exe");
				WebDriver driver = new FirefoxDriver();
				driver.get("file:///D:/Dropbox/shared/McppHW/src/webTest/calculator.html");
				driver.findElement(By.id("num7")).click();
				driver.findElement(By.id("opMul")).click();
				driver.findElement(By.id("num2")).click();
				driver.findElement(By.id("opEq")).click();

				String str = driver.findElement(By.id("result")).getAttribute("value");
				driver.close();
				assertEquals("14", str);
			}

			@Test
			public void testFirefoxMul_1()
			{
				System.setProperty("webdriver.gecko.driver", "D:/jar/geckodriver.exe");
				WebDriver driver = new FirefoxDriver();
				driver.get("file:///D:/Dropbox/shared/McppHW/src/webTest/calculator.html");
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
			public void testFirefoxMul_2()
			{
				System.setProperty("webdriver.gecko.driver", "D:/jar/geckodriver.exe");
				WebDriver driver = new FirefoxDriver();
				driver.get("file:///D:/Dropbox/shared/McppHW/src/webTest/calculator.html");
				driver.findElement(By.id("num2")).click();
				driver.findElement(By.id("num0")).click();
				driver.findElement(By.id("opMul")).click();
				driver.findElement(By.id("num1")).click();
				driver.findElement(By.id("num0")).click();
				driver.findElement(By.id("opEq")).click();

				String str = driver.findElement(By.id("result")).getAttribute("value");
				driver.close();
				assertEquals("200", str);
			}

			@Test
			public void testFirefoxPlus()
			{
				System.setProperty("webdriver.gecko.driver", "D:/jar/geckodriver.exe");
				WebDriver driver = new FirefoxDriver();
				driver.get("file:///D:/Dropbox/shared/McppHW/src/webTest/calculator.html");
				driver.findElement(By.id("num2")).click();
				driver.findElement(By.id("opPlus")).click();
				driver.findElement(By.id("num2")).click();
				driver.findElement(By.id("opEq")).click();

				String str = driver.findElement(By.id("result")).getAttribute("value");
				driver.close();
				assertEquals("4", str);
			}

			@Test
			public void testFirefoxPlus_1()
			{
				System.setProperty("webdriver.gecko.driver", "D:/jar/geckodriver.exe");
				WebDriver driver = new FirefoxDriver();
				driver.get("file:///D:/Dropbox/shared/McppHW/src/webTest/calculator.html");
				driver.findElement(By.id("num2")).click();
				driver.findElement(By.id("num0")).click();
				driver.findElement(By.id("opPlus")).click();
				driver.findElement(By.id("num2")).click();
				driver.findElement(By.id("opEq")).click();

				String str = driver.findElement(By.id("result")).getAttribute("value");
				driver.close();
				assertEquals("22", str);
			}

			@Test
			public void testFirefoxPlus_2()
			{
				System.setProperty("webdriver.gecko.driver", "D:/jar/geckodriver.exe");
				WebDriver driver = new FirefoxDriver();
				driver.get("file:///D:/Dropbox/shared/McppHW/src/webTest/calculator.html");
				driver.findElement(By.id("num2")).click();
				driver.findElement(By.id("num0")).click();
				driver.findElement(By.id("opPlus")).click();
				driver.findElement(By.id("num1")).click();
				driver.findElement(By.id("num0")).click();
				driver.findElement(By.id("opEq")).click();

				String str = driver.findElement(By.id("result")).getAttribute("value");
				driver.close();
				assertEquals("30", str);
			}

			@Test
			public void testFirefoxMinus()
			{
				System.setProperty("webdriver.gecko.driver", "D:/jar/geckodriver.exe");
				WebDriver driver = new FirefoxDriver();
				driver.get("file:///D:/Dropbox/shared/McppHW/src/webTest/calculator.html");
				driver.findElement(By.id("num6")).click();
				driver.findElement(By.id("opMinus")).click();
				driver.findElement(By.id("num4")).click();
				driver.findElement(By.id("opEq")).click();

				String str = driver.findElement(By.id("result")).getAttribute("value");
				driver.close();
				assertEquals("2", str);
			}

			@Test
			public void testFirefoxMinus_1()
			{
				System.setProperty("webdriver.gecko.driver", "D:/jar/geckodriver.exe");
				WebDriver driver = new FirefoxDriver();
				driver.get("file:///D:/Dropbox/shared/McppHW/src/webTest/calculator.html");
				driver.findElement(By.id("num2")).click();
				driver.findElement(By.id("num0")).click();
				driver.findElement(By.id("opMinus")).click();
				driver.findElement(By.id("num2")).click();
				driver.findElement(By.id("opEq")).click();

				String str = driver.findElement(By.id("result")).getAttribute("value");
				driver.close();
				assertEquals("18", str);
			}

			@Test
			public void testFirefoxMinus_2()
			{
				System.setProperty("webdriver.gecko.driver", "D:/jar/geckodriver.exe");
				WebDriver driver = new FirefoxDriver();
				driver.get("file:///D:/Dropbox/shared/McppHW/src/webTest/calculator.html");
				driver.findElement(By.id("num2")).click();
				driver.findElement(By.id("num0")).click();
				driver.findElement(By.id("opMinus")).click();
				driver.findElement(By.id("num1")).click();
				driver.findElement(By.id("num0")).click();
				driver.findElement(By.id("opEq")).click();

				String str = driver.findElement(By.id("result")).getAttribute("value");
				driver.close();
				assertEquals("10", str);
			}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	// @Test
	// public void testChrome_1()
	// {
	// System.setProperty("webdriver.chrome.driver", "D:/jar/chromedriver.exe");
	// WebDriver driver = new ChromeDriver();
	// driver.get("file:///D:/Dropbox/shared/McppHW/src/webTest/calculator.html");
	// driver.findElement(By.id("num7")).click();
	// driver.findElement(By.id("num7")).click();
	// driver.findElement(By.id("opDel")).click();
	// driver.findElement(By.id("num1")).click();
	// driver.findElement(By.id("num1")).click();
	// driver.findElement(By.id("opEq")).click();
	//
	// String str = driver.findElement(By.id("result")).getAttribute("value");
	//
	// assertEquals("7", str);
	// driver.quit();
	// }
	//
	// @Test
	// public void testOpera()
	// {
	// System.setProperty("webdriver.opera.driver", "D:/jar/operadriver.exe");
	// WebDriver driver = new OperaDriver();
	// driver.get("file:///D:/Dropbox/shared/McppHW/src/webTest/calculator.html");
	// driver.findElement(By.id("num7")).click();
	// driver.findElement(By.id("num7")).click();
	// driver.findElement(By.id("opDel")).click();
	// driver.findElement(By.id("num1")).click();
	// driver.findElement(By.id("num1")).click();
	// driver.findElement(By.id("opEq")).click();
	//
	// String str = driver.findElement(By.id("result")).getAttribute("value");
	//
	// driver.quit();
	//
	// assertEquals("7", str);
	// }
	//
	// @Test
	// public void testFireFox()
	// {
	// System.setProperty("webdriver.gecko.driver", "D:/jar/geckodriver.exe");
	// WebDriver driver = new FirefoxDriver();
	// driver.get("file:///D:/Dropbox/shared/McppHW/src/webTest/calculator.html");
	// driver.findElement(By.id("num7")).click();
	// driver.findElement(By.id("num7")).click();
	// driver.findElement(By.id("opDel")).click();
	// driver.findElement(By.id("num1")).click();
	// driver.findElement(By.id("num1")).click();
	// driver.findElement(By.id("opEq")).click();
	//
	// String str = driver.findElement(By.id("result")).getAttribute("value");
	//
	// // driver.quit();
	//
	// assertEquals("7", str);
	// }

}
