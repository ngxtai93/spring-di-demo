package tai.didemo.controller;

import org.junit.Before;
import org.junit.Test;
import tai.didemo.services.GreetingServiceImpl;

import static org.junit.Assert.assertEquals;

public class SetterInjectedControllerTest {
    private SetterInjectedController setterInjectedController;

    @Before
    // initialization method
    public void setUp() throws Exception {
        this.setterInjectedController = new SetterInjectedController();
        this.setterInjectedController.setGreetingService(new GreetingServiceImpl());
    }

    @Test
    // test method
    public void testGreeting() throws Exception {
        assertEquals(GreetingServiceImpl.HELLO_WORLD, setterInjectedController.sayHello());
    }
}
