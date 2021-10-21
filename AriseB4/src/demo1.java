import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class demo1 {

	public static void main(String[] args) {

		//comment
		Scanner myobj = new Scanner(System.in);
		System.out.println("Enter the Browser Name");
		String vBrowser = myobj.nextLine();
		if (vBrowser.contains("Edge")) {

			System.setProperty("webdriver.edge.driver",
					"C:\\Users\\00004551\\Downloads\\edgedriver_win32\\msedgedriver.exe");
			WebDriver driver = new EdgeDriver();
			driver.get("https://www.google.com");
			String PageTitle = driver.getTitle();
			System.out.println("Page Title is:" + PageTitle);
			System.out.println("URL being launched is :"
					+ driver.getCurrentUrl());
			driver.close();
		} else if (vBrowser.contains("Chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\00004551\\Downloads\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.google.com");
			String PageTitle = driver.getTitle();
			System.out.println("Page Title is:" + PageTitle);
			System.out.println("URL being launched is :"
					+ driver.getCurrentUrl());
			driver.close();
		} else {
			System.out.println("Entered wrong choice");
		}
	}
}
