package com.kps.kvsvr.articlemanagement.configuration;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.annotation.Resource;

@Configuration
public class FileUploadConfiguration implements WebMvcConfigurer {
    @Value("${serverPath}")
    String serverPath;
    @Value("${clientPath}")
    String clientPath;
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler(clientPath+"**").addResourceLocations("file:"+serverPath);
    }
}
