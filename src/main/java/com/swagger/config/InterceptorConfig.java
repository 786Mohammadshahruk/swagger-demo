/*
package com.swagger.config;


import com.swagger.interceptor.CustomInterceptor;
import com.swagger.interceptor.LoggingInterceptor;
import com.swagger.interceptor.PerformanceInterceptor;
import com.swagger.interceptor.ValidationInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class InterceptorConfig implements WebMvcConfigurer {

    private final CustomInterceptor customInterceptor;
    private final LoggingInterceptor loggingInterceptor;
    private final ValidationInterceptor validationInterceptor;
    private final PerformanceInterceptor performanceInterceptor;

    public InterceptorConfig(CustomInterceptor customInterceptor, LoggingInterceptor loggingInterceptor, ValidationInterceptor validationInterceptor, PerformanceInterceptor performanceInterceptor) {
        this.customInterceptor = customInterceptor;
        this.loggingInterceptor = loggingInterceptor;
        this.validationInterceptor = validationInterceptor;
        this.performanceInterceptor = performanceInterceptor;
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(customInterceptor).addPathPatterns("/user-management/**");
        registry.addInterceptor(loggingInterceptor);
        registry.addInterceptor(validationInterceptor);
        registry.addInterceptor(performanceInterceptor);

    }

}
*/
