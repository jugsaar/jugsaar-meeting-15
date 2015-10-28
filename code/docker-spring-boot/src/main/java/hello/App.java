package hello;

import java.lang.management.ManagementFactory;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class App {
	
	private static final Logger LOG = LoggerFactory.getLogger(App.class);

	@RequestMapping("/")
	public String home() {
		
		LOG.info("Processing request: " + new Date());
		
		return "Hello JUGSaar from Docker: " + ManagementFactory.getRuntimeMXBean().getName();
	}

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
}
