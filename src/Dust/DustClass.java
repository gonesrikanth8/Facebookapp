package Dust;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DustClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
			WebDriver driver = new ChromeDriver();
			driver.get("http://store.demoqa.com/");
			List<WebElement> elements;
	        elements = driver.findElements(By.tagName("button"));
	        System.out.println("Number of elements:" + elements.size());
	        System.out.println(elements.size());
	        System.out.println("fdfdf");
	        System.out.println("commitih ");
	        System.out.println("ffdfdfdfdfdfdfdf");
		

	}

}
}
