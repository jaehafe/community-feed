package org.jh.community_feed;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class CommunityFeedApplication {

    public static void main(String[] args) {
        SpringApplication.run(CommunityFeedApplication.class, args);
        System.out.println("Hello, Spring Boot!");
    }

}
