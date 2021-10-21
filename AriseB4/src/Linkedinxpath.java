import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Linkedinxpath {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\00004551\\Downloads\\edgedriver_win32\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();

		driver.get("https://www.linkedin.com");

		driver.findElement(By.className("nav__button-secondary")).click();
		System.out.println("Title is: " + driver.getTitle());
		// input username
		driver.findElement(By.id("username")).sendKeys("3456");
		// input Password
		// driver.findElement(By.id("password")).sendKeys("Password");
		// Wait
		Thread.sleep(5000);
		// Click on sign in
		// driver.findElement(By.xpath("/html/body/div/main/div[2]/div[1]/form/div[3]/button")).click();
		// xpath
		// driver.findElement(By.xpath("//button[@aria-label='Sign in']")).click();
		// xpath with *
		// driver.findElement(By.xpath("//*[@aria-label='Sign in']")).click();

		// with text() xpath
		driver.findElement(By.xpath("//button[text()='Sign in']")).click();
		// Capture and store the error message
		String ErrorMessage = driver.findElement(By.id("error-for-password"))
				.getText();
		// Print the error message
		System.out.println("Error message is : " + ErrorMessage);
		// Click on forgot password
		driver.findElement(By.partialLinkText("Forgot")).click();
		// Print the title
		System.out.println("Title is: " + driver.getTitle());
		// Click on Join now link
		driver.findElement(By.linkText("Join now")).click();
		// Print the title
		System.out.println("Title is: " + driver.getTitle());
		// Find elements by link tag "a"
		int vsize = driver.findElements(By.tagName("a")).size();
		// Print the total number of links
		System.out.println("Total links are :" + vsize);
		// close the driver
		driver.quit();
	}

}
