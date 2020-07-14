package com.quiz;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
//import org.springframework.context.annotation.Bean;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.quiz.dao.QuizDAO;
import com.quiz.model.Quiz;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class OnlinequizappbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnlinequizappbootApplication.class, args);
	}
	
	@Bean
	CommandLineRunner runner(QuizDAO dao) {
		
		dao.save(new Quiz("Which of the following is a non metal that remains liquid at room temperature?","bromine"));
		dao.save(new Quiz("Which of the following is used as a moderator in nuclear reactor?","graphite"));
		dao.save(new Quiz("Isotopes are separated by","distillation"));
		dao.save(new Quiz("Who suggested that most of the mass of the atom is located in the nucleus?","rutherford"));
		dao.save(new Quiz("Nuclear fission is caused by the impact of","neutron"));
		return null;
		
		
	}
	
	@Bean
	   public Docket productApi() {
	      return new Docket(DocumentationType.SWAGGER_2).select()
	         .apis(RequestHandlerSelectors.basePackage("com.quiz")).build();
	   }

}
