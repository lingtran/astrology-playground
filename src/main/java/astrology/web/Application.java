package astrology.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by lingtran on 5/20/17.
 */
@SpringBootApplication(scanBasePackages = "astrology")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
