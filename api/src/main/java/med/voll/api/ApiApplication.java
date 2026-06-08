package med.voll.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApiApplication {
	/*carrega o tomcat, controllers...*/
	public static void main(String[] args) {
		SpringApplication.run(ApiApplication.class, args);
	}

}
