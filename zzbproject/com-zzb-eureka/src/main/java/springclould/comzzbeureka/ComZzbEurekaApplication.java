package springclould.comzzbeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ComZzbEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(ComZzbEurekaApplication.class, args);
    }

}

