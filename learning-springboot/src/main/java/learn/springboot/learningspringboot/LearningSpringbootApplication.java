package learn.springboot.learningspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(StudyProperties.class)
public class LearningSpringbootApplication {
    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(LearningSpringbootApplication.class);

        app.run(args);
        // SpringApplication.run(LearningSpringbootApplication.class, args);
    }

}
