package com.park.book.springboot;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

//해당 어노테이션으로인해 SpringBootApplication이 있는 곳부터 설정을 읽어나감
// 최상단에 위치해야 됨.
@EnableJpaAuditing //JPA Auditing 활성화
@SpringBootApplication
public class Application {

    // main 클래스
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
