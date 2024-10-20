package amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Addtocart {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		
		// Chrome full size
		driver.manage().window().maximize();
				
		// Get youtube url
		driver.get("https://www.amazon.in/");
		
		
		// Enter Product
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Data cable");
		
		// Press search button
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		// Product add to cart
		driver.findElement(By.id("a-autoid-3-announce")).click();
		
		Thread.sleep(3000);
		
		// Go to cart
		WebElement button = driver.findElement(By.partialLinkText("Go to Cart"));
		button.click();
		
		// Close chrome
		Thread.sleep(2000);
		driver.quit();

	}
}
