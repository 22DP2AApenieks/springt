package rvt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App {
    public static void main(String[] args) {
        Money macins = new Money(10, 5);
        SpringApplication.run(App.class, args);
    }
}
