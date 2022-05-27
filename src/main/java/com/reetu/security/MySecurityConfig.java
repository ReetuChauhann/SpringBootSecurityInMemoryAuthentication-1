package com.reetu.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.authentication.configurers.provisioning.InMemoryUserDetailsManagerConfigurer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;


@Configuration
@EnableWebSecurity
public class MySecurityConfig extends WebSecurityConfigurerAdapter {
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception{
		InMemoryUserDetailsManagerConfigurer i=auth.inMemoryAuthentication();
		i.withUser("reetu").password("{noop}reetu12").roles("user").and()
		.withUser("tanu").password("{noop}tanu12").roles("admin");
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
		.antMatchers("/").permitAll()
		.antMatchers("/demo1").hasRole("user")
		.antMatchers("/demo2").hasAnyRole("user","admin")
		.and().formLogin().permitAll()
		.and().exceptionHandling().accessDeniedPage("/accessDenied");
	}	
	
}
