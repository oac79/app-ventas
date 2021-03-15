package com.oabadch.ventas.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppVentasApplication {

	//private static final Logger logger = LoggerFactory.getLogger(AppVentasApplication.class);
	
	public static void main(String[] args) {
		
		/*logger.trace("Log de rastreo");
		logger.error("Log de error");
		logger.debug("Log de depuración");
		logger.info("Log de información");
		logger.warn("Log de advertencia");*/
		
		SpringApplication.run(AppVentasApplication.class, args);
	}

}
