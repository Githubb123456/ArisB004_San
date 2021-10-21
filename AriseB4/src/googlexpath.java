import java.util.jar.Attributes.Name;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class googlexpath {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\00004551\\Downloads\\edgedriver_win32\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.google.com");
		System.out.println("Title is " +driver.getTitle());
		//check number of buttons
		int vsize= driver.findElements(By.xpath("//input[@type='submit']")).size();
		System.out.println("Number of buttons are " +vsize);
		driver.findElement(By.name("q")).sendKeys("Selenium");
		Thread.sleep(5000);
		driver.findElement(By.name("btnK")).click();

	}

}
