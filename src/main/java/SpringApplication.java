import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringApplication {

    public static void main(String[] args){
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(SpringApplication.class);

    }
}
