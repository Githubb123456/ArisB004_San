import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TitleVerification {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\00004551\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com");
		String vTitle = driver.getTitle();
		if (vTitle.contains("Google")) {
			System.out.println("We are in google page");
			driver.quit();

		} else {
			System.out.println("We are not in google page");
			driver.quit();
		}

	}

}
