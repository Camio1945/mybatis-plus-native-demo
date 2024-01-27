package com.fakedomain.demo;

import java.io.Serializable;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 启动器
 *
 * @author Camio1945
 */
@SpringBootApplication(proxyBeanMethods = false)
public class DemoApplication implements Serializable {

  public static void main(String[] args) {
    SpringApplication.run(DemoApplication.class, args);
  }

}
