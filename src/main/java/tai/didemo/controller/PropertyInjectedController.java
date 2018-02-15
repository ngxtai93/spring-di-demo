package tai.didemo.controller;

import tai.didemo.services.GreetingService;

public class PropertyInjectedController {   // Not recommended
    public GreetingService greetingService;

    String sayHello() {
        return greetingService.sayGreeting();
    }
}
