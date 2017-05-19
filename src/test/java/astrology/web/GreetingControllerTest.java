package astrology.web;

import astrology.service.GreetingService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * Created by lingtran on 5/7/17.
 */
@RunWith(MockitoJUnitRunner.class)
public class GreetingControllerTest {
    private GreetingController greetingController;

    @Mock
    private GreetingService mockGreetingService;

    private MockMvc mockMvc;

    @Before
    public void setup() {
        greetingController = new GreetingController(mockGreetingService);
        mockMvc = MockMvcBuilders.standaloneSetup(greetingController).build();
    }

    @Test
    public void testIndexReturnsAString() throws Exception {
        Map<String, Object> model = new HashMap<>();
        String result = greetingController.index(model);

        mockMvc.perform(get("/"))
                .andExpect(status().isOk());

        assertEquals("index", result);
    }
}