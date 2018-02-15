package tai.didemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import tai.didemo.controller.ConstructorInjectedController;
import tai.didemo.controller.MyController;
import tai.didemo.controller.PropertyInjectedController;
import tai.didemo.controller.SetterInjectedController;

@SpringBootApplication
public class DiDemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(DiDemoApplication.class, args);
		MyController controller = (MyController) context.getBean("myController");

		System.out.println(controller.hello());
		System.out.println(context.getBean(PropertyInjectedController.class).sayHello());
		System.out.println(context.getBean(SetterInjectedController.class).sayHello());
		System.out.println(context.getBean(ConstructorInjectedController.class).sayHello());

	}
}
