package com.call.itsolution;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;
 
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.call.itsolution")
public class HelloWorldConfig {	 
		@Bean
	    public ViewResolver viewResolver() {
	        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
	        viewResolver.setViewClass(JstlView.class);
	        viewResolver.setPrefix("/WEB-INF/jsps/");
	        viewResolver.setSuffix(".jsp");
	        return viewResolver;
	    }
		    public void addResourceHandlers(ResourceHandlerRegistry registry) 
		    {
		        registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
		    }
}
