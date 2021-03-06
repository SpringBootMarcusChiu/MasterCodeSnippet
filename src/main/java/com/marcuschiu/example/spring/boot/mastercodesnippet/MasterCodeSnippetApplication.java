package com.marcuschiu.example.spring.boot.mastercodesnippet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.core.env.AbstractEnvironment;
import org.springframework.core.env.Environment;

import java.util.Optional;
import java.util.function.Function;

/**
 * Created by marcus.chiu on 10/1/16.
 * @SpringBootApplication - a convenience annotation that adds all the following:
 *     1. @Configuration - tags the class as a source of bean definitions
 *     2. @EnableAutoConfiguration - tells Spring Boot to start adding beans
 *          based on classpath settings, other beans, and various property settings
 *     3. @EnableWebMvc - normally added for a Spring MVC app, but Spring boot adds
 *          it automatically when it sees 'spring-webmvc' on the classpath.
 *          This flags application as a web application and activates key behaviors
 *          like setting up DispatcherServlet
 *     4. @ComponentScan - tells Spring to look for other components, configurations,
 *          and services in the package this class belongs to, allowing it to find the controllers
 */
@SpringBootApplication
public class MasterCodeSnippetApplication implements CommandLineRunner {

	@Autowired
	ApplicationContext applicationContext;

	@Autowired
	Environment environment;

	public static void main(String[] args) {
		SpringApplication.run(MasterCodeSnippetApplication.class, args);
	}

	@Value("${marcusdsdhs:}")
	String tt;

	@Override
	public void run(String... strings) {
//		System.out.println(applicationContext.getDisplayName());
//		((AbstractEnvironment)environment).getPropertySources();
		System.out.println();
	}
}
