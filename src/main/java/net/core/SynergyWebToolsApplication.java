package net.core;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SynergyWebToolsApplication {

	private static final Logger logger = LoggerFactory.getLogger(SynergyWebToolsApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SynergyWebToolsApplication.class, args);
		logger.info("CoreSynergy application started...");
	}
}

