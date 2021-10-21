import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;


public class HandleSelect {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver","C:\\Users\\00004551\\Downloads\\edgedriver_win32\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.amazon.in/");
		Select Prodselect = new Select(driver.findElement(By.id("searchDropdownBox")));
		Prodselect.selectByIndex(2);
		Thread.sleep(2000);
		Prodselect.selectByValue("search-alias=amazon-devices");
		Thread.sleep(2000);
		Prodselect.selectByVisibleText("Apps & Games");
		Thread.sleep(2000);
		driver.quit();

	}

}
