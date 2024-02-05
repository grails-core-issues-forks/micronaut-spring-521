package boot4;

import io.micronaut.spring.context.MicronautApplicationContext;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        MicronautApplicationContext micronautApplicationContext = new MicronautApplicationContext();
        micronautApplicationContext.start();
        new SpringApplicationBuilder()
                .parent(micronautApplicationContext)
                .sources(Application.class)
                .build()
                .run();
    }
}