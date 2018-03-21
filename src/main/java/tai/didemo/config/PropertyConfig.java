package tai.didemo.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import tai.didemo.examplebeans.FakeDataSource;
import tai.didemo.examplebeans.FakeJmsBroker;

@Configuration
public class PropertyConfig {

    @Value("${tai.username}")
    String user;
    @Value("${tai.password}")
    String password;
    @Value("${tai.dburl}")
    String url;
    @Value("${tai.jms.username}")
    String jmsUsername;
    @Value("${tai.jms.password}")
    String jmsPassword;
    @Value("${tai.jms.url}")
    String jmsUrl;

    @Bean
    public FakeDataSource fakeDataSource() {
        FakeDataSource fakeDataSource = new FakeDataSource();
        fakeDataSource.setUser(user);
        fakeDataSource.setPassword(password);
        fakeDataSource.setUrl(url);
        return fakeDataSource;
    }

    @Bean
    public FakeJmsBroker fakeJmsBroker() {
        FakeJmsBroker fakeJmsBroker = new FakeJmsBroker();
        fakeJmsBroker.setUsername(jmsUsername);
        fakeJmsBroker.setPassword(jmsPassword);
        fakeJmsBroker.setUrl(jmsUrl);
        return fakeJmsBroker;
    }

}
