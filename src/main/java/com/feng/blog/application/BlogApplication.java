package com.feng.blog.application;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SpringBootApplication(scanBasePackages = "com.feng.blog")
public class BlogApplication extends WebMvcConfigurerAdapter {
}
