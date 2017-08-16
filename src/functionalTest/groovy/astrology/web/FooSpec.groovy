package astrology.web

import geb.Browser
import geb.spock.GebSpec
import org.openqa.selenium.chrome.ChromeDriver
import spock.lang.Ignore

/**
 * Created by ltran on 21/07/17.
 */
class FooSpec extends GebSpec {

    // TODO: Figure out if is this the right setup?
    // TODO: System.setProperty to be done here? Need to clean up path
    def browser() {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.home")+"//Developer/Drivers/chromedriver")
        new Browser(driver: new ChromeDriver())
    }
//    TODO: Is this the best way to set up a baseUrl? Also overall is this the best structure for interacting with a Browser?
    def setupSpec(){
        browser.config.properties.baseUrl
    }

    def "landing page"() {

        when:
        go "/"

        then:
        title == "This should work"
    }

}