package tai.didemo.controller;

import org.junit.Before;
import org.junit.Test;
import tai.didemo.services.GreetingServiceImpl;

import static org.junit.Assert.assertEquals;

public class PropertyInjectedControllerTest {
    private PropertyInjectedController propertyInjectedController;

    @Before
    // initialization method
    public void setUp() throws Exception {
        this.propertyInjectedController = new PropertyInjectedController();
        this.propertyInjectedController.greetingServiceImpl = new GreetingServiceImpl();
    }

    @Test
    // test method
    public void testGreeting() throws Exception {
        assertEquals(GreetingServiceImpl.HELLO_WORLD, propertyInjectedController.sayHello());
    }
}
