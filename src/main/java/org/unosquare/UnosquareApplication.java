package org.unosquare;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "org.unosquare")
public class UnosquareApplication {

    public static void main(String[] args) {
        SpringApplication.run(UnosquareApplication.class, args);
    }

}
