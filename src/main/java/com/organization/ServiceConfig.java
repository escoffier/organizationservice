package com.organization;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan(basePackages = "com.organization.Mapper")
public class ServiceConfig {
}
