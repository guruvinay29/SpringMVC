package org.jsp.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan({"org.jsp.app"})
public class SpringConfig {
	@Bean
	public InternalResourceViewResolver  viewResolver() {
		
		InternalResourceViewResolver vr  = new InternalResourceViewResolver();
		vr.setPrefix("/WEB-INF/");
		vr.setSuffix(".jsp");
		
		return vr;
		
	}

}
