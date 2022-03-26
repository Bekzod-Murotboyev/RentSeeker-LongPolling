package uz.pdp.rentseekerlongpolling;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import uz.pdp.rentseekerlongpolling.config.SwaggerConfig;
import uz.pdp.rentseekerlongpolling.config.WebConfig;

@SpringBootApplication
@EnableJpaRepositories(value = "uz.pdp.rentseekerlongpolling")
@EntityScan(value = "uz.pdp.rentseekerlongpolling.entity")
@EnableSwagger2
@Import({SwaggerConfig.class , WebConfig.class})
public class RentSeekerLongPollingApplication {

    public static void main(String[] args) {
        SpringApplication.run(RentSeekerLongPollingApplication.class, args);
    }

}