package icu.insomniac.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("icu.insomniac")
@EnableAspectJAutoProxy
public class SpringConfig {
}
