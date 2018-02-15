package tai.didemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import tai.didemo.services.GreetingService;

@Controller
public class PropertyInjectedController {   // Not recommended

    @Autowired
//    public GreetingServiceImpl greetingService;   Use Impl class directly
//    or
    public GreetingService greetingServiceImpl;

    public String sayHello() {
        return greetingServiceImpl.sayGreeting();
    }
}
