package astrology.functionalTest

import geb.Browser
import geb.spock.GebSpec
import org.openqa.selenium.chrome.ChromeDriver

/**
 * Created by ltran on 21/07/17.
 */
class FooSpec extends GebSpec {

    // TODO: Figure out if is this the right setup?
    def browser() {
        new Browser(driver: new ChromeDriver())
    }
//    TODO: Is this the best way to set up a baseUrl? Also overall is this the best structure for interacting with a Browser?
    def setupSpec(){
        browser.setBaseUrl("https://localhost:8080")
    }

    @spock.lang.Ignore
    def "landing page"() {
        when:
        go "/"

        then:
        title == "This should work"
    }

}