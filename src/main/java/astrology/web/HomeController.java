package astrology.web;


import astrology.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@RequestMapping("/")
@Controller
public class HomeController {

    private final GreetingService greetingService;

    @Autowired
    public HomeController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    @RequestMapping(method = RequestMethod.GET)
    public String index(Map<String, Object> model) {
        model.put("title", greetingService.getTitle(""));
        model.put("msg", greetingService.getDesc());

        return "index";
    }

    @RequestMapping(value = "/astrology/{name:.+}", method = RequestMethod.GET)
    public ModelAndView hello(@PathVariable("name") String name) {
        ModelAndView model = new ModelAndView();
        model.setViewName("index");

        model.addObject("title", greetingService.getTitle(name));
        model.addObject("msg", greetingService.getDesc());

        return model;
    }

}
