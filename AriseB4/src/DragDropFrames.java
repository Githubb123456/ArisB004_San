import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;


public class DragDropFrames {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver","C:\\Users\\00004551\\Downloads\\edgedriver_win32\\msedgedriver.exe");
		WebDriver myD = new EdgeDriver();
		myD.get("https://jqueryui.com/droppable/");
		System.out.println("title is : "+myD.getTitle());
		
		String vText=myD.findElement(By.className("entry-title")).getText();
		System.out.println("Main Page Text : "+vText);
		
		
		int vFrame=myD.findElements(By.tagName("iframe")).size();
		System.out.println(vFrame);
		
		//myD.switchTo().frame(0);
		myD.switchTo().frame(myD.findElement(By.className("demo-frame")));
		
		vText=myD.findElement(By.id("draggable")).getText();
		System.out.println(vText);
		
		WebElement Drag=myD.findElement(By.id("draggable"));
		WebElement Drop=myD.findElement(By.id("droppable"));
		
		Actions act=new Actions(myD);
		act.dragAndDrop(Drag, Drop).build().perform();
		
		Thread.sleep(4000);
		
		myD.switchTo().defaultContent();
		
		
		vText=myD.findElement(By.className("entry-title")).getText();
		System.out.println("Main Page Text : "+vText);
		
		myD.close();
		
		}


	}
