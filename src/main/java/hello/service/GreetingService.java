package hello.service;

import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

@Service
public class GreetingService {
    public String getDesc() {
        return "Gradle + Spring MVC Hello World Example";
    }

    public String getTitle(String name) {
        if (StringUtils.isEmpty(name)) {
            return "Hello World";
        } else {
            return "Hello " + name;
        }
    }
}
