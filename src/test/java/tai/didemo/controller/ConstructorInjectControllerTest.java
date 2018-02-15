package tai.didemo.controller;

import org.junit.Before;
import org.junit.Test;
import tai.didemo.services.GreetingServiceImpl;

import static org.junit.Assert.assertEquals;

public class ConstructorInjectControllerTest {
    private ConstructorInjectedController constructorInjectedController;

    @Before
    public void setUp() throws Exception {
        this.constructorInjectedController = new ConstructorInjectedController(new GreetingServiceImpl());
    }

    @Test
    public void testGreeting() throws Exception {
        assertEquals(GreetingServiceImpl.HELLO_WORLD, constructorInjectedController.sayHello());
    }
}
