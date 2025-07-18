package es.cic.curso25.proy005;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Proy005Application {

	private static final Logger LOGGER = LoggerFactory.getLogger(Proy005Application.class);

	public static void main(String[] args) {
        LOGGER.error("Traza de error");

		SpringApplication.run(Proy005Application.class, args);
	}

}
