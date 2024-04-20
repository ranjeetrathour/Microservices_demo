package com.gateway;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RouteCOnfig {

    @Bean
    public RouteLocator routeLocator(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("department-data", r -> r.path("/dept/**").uri("lb://DEPARTMENT-DATA"))
                .route("employee-data", r -> r.path("/emp/**").uri("lb://EMPLOYEE-DATA"))
                .build();
    }
}
