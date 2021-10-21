import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class handlewindows {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver","C:\\Users\\00004551\\Downloads\\edgedriver_win32\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.gmail.com");
		Thread.sleep(2000);
		System.out.println("Title is " +driver.getTitle());
		Thread.sleep(2000);
		driver.findElement(By.linkText("Help")).click();
		Thread.sleep(2000);
		Set<String> windowids=driver.getWindowHandles();
		System.out.println("Window handles " +windowids);
		Thread.sleep(2000);
		Iterator<String> itr = windowids.iterator();
		String GmailWindowId = itr.next();
		String HelpWindowId= itr.next();
		System.out.println("Gmail Window ID " +GmailWindowId);
		System.out.println("Help Window ID " +HelpWindowId);
		driver.switchTo().window(HelpWindowId);
		//driver.switchTo().window(nameOrHandle)
		System.out.println("Title is " +driver.getTitle());
		Thread.sleep(2000);
		driver.quit();
	}

}
