/*
 * package com.employee.security;
 * 
 * import org.springframework.context.annotation.Bean; import
 * org.springframework.context.annotation.Configuration; import
 * org.springframework.security.config.annotation.web.builders.HttpSecurity;
 * import org.springframework.security.config.annotation.web.configuration.
 * WebSecurityConfiguration; import
 * org.springframework.security.web.SecurityFilterChain; import
 * org.springframework.security.web.util.matcher.AntPathRequestMatcher;
 * 
 * @Configuration public class SecurityConfig {
 * 
 * @Bean SecurityFilterChain filterChain(HttpSecurity security) throws Exception
 * { security.authorizeHttpRequests( authorizeHttpRequests ->
 * authorizeHttpRequests.requestMatchers("/test/**").permitAll()
 * .requestMatchers(new AntPathRequestMatcher("/emp/getById/")).authenticated())
 * .httpBasic(); return security.build(); } }
 */
