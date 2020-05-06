package learn.springboot.learningspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LearningSpringbootApplication {

    public static void main(String[] args) {
        //SpringApplication.run(LearningSpringbootApplication.class, args);
        SpringApplication app = new SpringApplication(LearningSpringbootApplication.class);
        app.run(args);

    }

}
