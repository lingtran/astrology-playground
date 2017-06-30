package astrology.web;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import static org.junit.Assert.assertEquals;

/**
 * Created by lingtran on 5/20/17.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class HttpRequestTest {

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void indexReturnsOk() throws Exception {
        ResponseEntity<String> response = this.restTemplate.getForEntity("/", String.class);

        assertEquals(HttpStatus.NOT_FOUND, response.getStatusCode());
    }

}
