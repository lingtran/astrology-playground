package astrology.web;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.hamcrest.CoreMatchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * Created by lingtran on 5/20/17.
 */

/* TO DO: Figure out path for @WebAppConfiguration and @ContextConfiguration. File cannot be opened according to error. */

@Ignore
@RunWith(SpringJUnit4ClassRunner.class)
//@WebAppConfiguration("src/main/webapp/WEB-INF")
//@ContextConfiguration(locations = "src/main/webapp/WEB-INF/spring-core-config.xml")
public class ApplicationTest {
    @Autowired
    private WebApplicationContext webAppContext;

    private MockMvc mockMvc;

    public ApplicationTest() {
    }

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        mockMvc = MockMvcBuilders.webAppContextSetup(webAppContext).build();
    }

    @Test
    public void returnsDefaultMessage() throws Exception {
        mockMvc.perform(get("/")).andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("index")));
    }

}