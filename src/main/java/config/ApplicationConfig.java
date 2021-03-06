package config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:application.properties")
public class ApplicationConfig {
    @Value("${minCurrCapacity}")
    private Integer minCurrCapacity;

    @Value("${maxCurrCapacity}")
    private Integer maxCurrCapacity;

}
