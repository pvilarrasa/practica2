package daaw.practica2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;


@EnableMongoRepositories
@SpringBootApplication
public class Practica2Application{

	public static void main(String[] args) {
		SpringApplication.run(Practica2Application.class, args);
	}

}
