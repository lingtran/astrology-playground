import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.firefox.FirefoxDriver

/**
 * Created by ltran on 21/07/17.
 */
environments {
    chrome {
        driver = { new ChromeDriver() }
    }

    firefox {
        atCheckWaiting = 1

        driver = { new FirefoxDriver() }
    }
}

baseUrl = "https://localhost:8080"