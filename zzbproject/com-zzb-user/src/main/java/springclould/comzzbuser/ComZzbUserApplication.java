package springclould.comzzbuser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ComZzbUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(ComZzbUserApplication.class, args);
    }

}

