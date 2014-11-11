package org.wai

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.context.ApplicationContext
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration

@Configuration
@ComponentScan
@EnableAutoConfiguration
/**
 * Normally you would add @EnableWebMvc for a Spring MVC app, but Spring Boot adds it automatically when it sees spring-webmvc on the classpath.
 * This flags the application as a web application and activates key behaviors such as setting up a DispatcherServlet.
 */
class Application {

    static void main(String[] args) {
      ApplicationContext ctx =  SpringApplication.run Application.class, args;

      println "List the beans provided by Spring Boot:"

      def beanNames = ctx.getBeanDefinitionNames();
      Arrays.sort(beanNames);

      beanNames.eachWithIndex{ name, index ->
        println("===Bean[" + index + "] " + name);

      }

    }
}
