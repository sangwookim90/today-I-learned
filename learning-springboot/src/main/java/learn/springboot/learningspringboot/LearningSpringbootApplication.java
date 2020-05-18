package learn.springboot.learningspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

@SpringBootApplication
public class LearningSpringbootApplication {

    public static void main(String[] args) {
        //SpringApplication.run(LearningSpringbootApplication.class, args);
//        SpringApplication app = new SpringApplication(LearningSpringbootApplication.class);
//        app.run(args);
        List<String> list = Arrays.asList("a","b","c");
        Stream<String> stream = list.stream();
        Stream<String> parallelStream = list.parallelStream(); //병렬 처리 스트림

        Stream<String> generatedStream = Stream.generate(() -> "gen").limit(5); // [gen, gen, gen, gen, gen]


    }

}
