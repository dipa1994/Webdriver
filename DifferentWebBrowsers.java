package SeleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DifferentWebBrowsers {
    public static void main(String[] args) {
        //Set up path of the Edge driver
        System.setProperty("webdriver.edge.driver","C:\\Users\\44740\\IdeaProjects\\Software\\Driver\\msedgedriver.exe");
        //Set up path of the chrome driver
        System.setProperty("webdriver.chrome.driver","C:\\Users\\44740\\IdeaProjects\\Software\\Driver\\chromedriver.exe");
        //Set up path of Firefox driver
        System.setProperty("webdriver.gecko.driver","C:\\Users\\44740\\IdeaProjects\\Software\\Driver\\geckodriver.exe");
        // Create an instance for Edge driver
        WebDriver edge = new EdgeDriver();
        // Create an instance for chrome driver
        WebDriver chrome = new ChromeDriver();
        // Create an instance for firefox driver
        WebDriver firefox = new FirefoxDriver();
        //Step 3 : Navigate to the webpage
        // Abstract Method
        edge.get("https://www.zara.com/uk/");
        chrome.get("https://www.youtube.com/");
        firefox.get("https://www.ebooks.com/");

    }
}
