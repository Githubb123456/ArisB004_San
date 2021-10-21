import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;


public class MouseoverActions {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver","C:\\Users\\00004551\\Downloads\\edgedriver_win32\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("http://www.amazon.in");
		System.out.println("title is : "+driver.getTitle());
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.id("nav-link-accountList-nav-line-1"))).build().perform();
		driver.findElement(By.xpath("//*[@id=\"nav-flyout-ya-signin\"]/a/span")).click();
        System.out.println("title is : "+driver.getTitle());
        driver.close();

	}

}
