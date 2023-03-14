package consumindo.api.consumindoApi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "consumindo.api.consumindoApi")
public class ConsumindoApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsumindoApiApplication.class, args);
	}

}
