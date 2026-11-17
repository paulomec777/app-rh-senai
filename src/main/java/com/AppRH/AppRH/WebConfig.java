package com.AppRH.AppRH;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.core.env.Profiles;
import org.springframework.security.config.annotation.authentication.configurers.provisioning.InMemoryUserDetailsManagerConfigurer;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class WebConfig extends WebSecurityConfigurerAdapter {

	// Método que configura usuários e escopo de atuação no sistema
	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder builder, Environment env) throws Exception {

		InMemoryUserDetailsManagerConfigurer<AuthenticationManagerBuilder> usuarios = builder.inMemoryAuthentication();
		usuarios.withUser("arthur").password("{noop}arthur").roles("USER");
		usuarios.withUser("root").password("{noop}root").roles("ADMIN");

		// Usuário de visitante, só na versão de demonstração
		if (env.acceptsProfiles(Profiles.of("demo"))) {
			usuarios.withUser("demo").password("{noop}demo").roles("USER");
		}
	}

	// Método que configura quais seções do site podem ser acessadas com e sem login
	protected void configure(HttpSecurity http) throws Exception{
		
		http
		.authorizeRequests().antMatchers("/").permitAll()
		.antMatchers("/bootstrap/**").permitAll()
		.antMatchers("/vagas**").permitAll()
		.antMatchers("/home**").permitAll().anyRequest()
		.authenticated().and().formLogin().permitAll()
		.and().logout().permitAll()
		.and().csrf().disable();
	}

	
}
