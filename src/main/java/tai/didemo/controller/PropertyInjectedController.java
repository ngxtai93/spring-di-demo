package tai.didemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import tai.didemo.services.GreetingService;

@Controller
public class PropertyInjectedController {   // Not recommended

    @Autowired
    public GreetingService greetingService;

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
