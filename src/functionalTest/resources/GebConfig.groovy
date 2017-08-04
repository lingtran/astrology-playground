import org.openqa.selenium.chrome.ChromeDriver
/**
 * Created by ltran on 04/08/17.
 */

baseUrl = "https://localhost:8080"

environments {
    chrome {
        driver = { new ChromeDriver() }
    }

}

