package com.example.email;

import com.example.email.utils.MailUtils;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MailConfig {
	
	@Bean
	public MailUtils getMailUtils(){
		return new MailUtils();
	}


}
