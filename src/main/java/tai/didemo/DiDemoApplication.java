package tai.didemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import tai.didemo.controller.ConstructorInjectedController;
import tai.didemo.controller.MyController;
import tai.didemo.controller.PropertyInjectedController;
import tai.didemo.controller.SetterInjectedController;
import tai.didemo.examplebeans.FakeDataSource;
import tai.didemo.examplebeans.FakeJmsBroker;

@SpringBootApplication
public class DiDemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(DiDemoApplication.class, args);
		MyController controller = (MyController) context.getBean("myController");

		FakeDataSource fakeDataSource = (FakeDataSource) context.getBean(FakeDataSource.class);

		System.out.println(fakeDataSource.getUser());

		FakeJmsBroker fakeJmsBroker = (FakeJmsBroker) context.getBean(FakeJmsBroker.class);
		System.out.println(fakeJmsBroker.getUsername());

	}
}
