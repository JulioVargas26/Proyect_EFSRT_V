package com.proyect.security;/*
package com.proyect.security;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

//clase de configuración
@Configuration
//habilitar seguridad
@EnableWebSecurity
//habilitar método para la clave
@EnableMethodSecurity

public class SecurityConfig {
	
	@Value("${spring.security.debug:false}")
    boolean securityDebug;

	@Bean
	public BCryptPasswordEncoder encriptar() {
		return new BCryptPasswordEncoder();
	}
	
	
	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
		*/
/*http
			.authorizeHttpRequests((requests) -> requests
				.requestMatchers("/", "/home").permitAll()
				.anyRequest().authenticated()
			)
			.formLogin((form) -> form
				.loginPage("/usuario/login")
				.permitAll()
			)
			.logout((logout) -> logout.permitAll());

		return http.build();*//*

		http.csrf().disable().authorizeHttpRequests().
			requestMatchers("/**").permitAll().and().
			authorizeHttpRequests().
			requestMatchers("/**").
			authenticated().and().formLogin().loginPage("/").
			defaultSuccessUrl("/");

		return http.build();
	}
	
	@Bean
	public UserDetailsService userDetailsService() {
		return new UserSecurity();
	}

	@Bean
	public AuthenticationProvider authenticationProvider(){
		DaoAuthenticationProvider salida=new DaoAuthenticationProvider();
		//dos atributos al objeto salida
		salida.setUserDetailsService(userDetailsService());
		salida.setPasswordEncoder(encriptar());
		return salida;
	}
	@Bean
    public WebSecurityCustomizer webSecurityCustomizer() {
        return web -> web.debug(securityDebug)
                .ignoring()
                .requestMatchers("/resources/**", "/static/**", "/img/**", "/lib/**", "/favicon.ico");
    }
	
}
*/
