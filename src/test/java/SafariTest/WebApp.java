/**
 * 
 */
package SafariTest;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;

/**
 * @author abhay
 *
 */
public class WebApp {

	/**
	 * @param args
	 */
	
	public static IOSDriver driver;
	
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "Safari");
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone8 Simulator");
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "iOS");
		capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "13.0");
		capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "XCUITest");
		
		 driver=new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.get("http://www.google.com");
		 driver.findElement(By.name("q")).sendKeys("Hello");
		 
		 Thread.sleep(3000);
		 driver.quit();
		
	}

}
