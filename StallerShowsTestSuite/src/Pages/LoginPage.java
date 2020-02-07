package Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String exePath = "C:\\Users\\WEKAN\\workspace\\OnlineStore\\chromedriver_win32\\chromedriver.exe";
		 System.setProperty("webdriver.chrome.driver", exePath);
				WebDriver driver = new ChromeDriver();
				driver.get("http://qa.staller.show");

											}
						}