import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class NaukriWindows {

	public static void main(String[] args) throws InterruptedException 
	{
	
		System.setProperty("webdriver.edge.driver","C:\\Users\\00004551\\Downloads\\edgedriver_win32\\msedgedriver.exe");
		WebDriver myD = new EdgeDriver();
		
		// Load the website
		myD.get("http://www.naukri.com/");

		// It will return the parent window name as a String
		String parent=myD.getWindowHandle();
		Set<String>s=myD.getWindowHandles();

		// Now iterate using Iterator
		Iterator<String> I1= s.iterator();

		while(I1.hasNext())
		{
			String child_window=I1.next();


			if(!parent.equals(child_window))
			{
			myD.switchTo().window(child_window);

			System.out.println(myD.switchTo().window(child_window).getTitle());
			Thread.sleep(5000);
			myD.close();
			}

			}
			//switch to the parent window
			myD.switchTo().window(parent);
			Thread.sleep(5000);
			myD.close();
						
			
			}
	
			
	
		
		

	}

