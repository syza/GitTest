package springbootrestapiexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

//@EnableJpaRepositories(basePackages ="springbootrestapiexample.repository")
@SpringBootApplication
public class Application {
	
	public static void main(String[] args)
	{
		SpringApplication.run(Application.class,args);
	}	
}
