package jp.co.example.receive.email;

import jp.co.example.receive.email.service.ReceiveEmailService;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ReceiveEmailApplication implements ApplicationRunner {
    private ReceiveEmailService service;
    private int exitCode;

    public void main(String... args) {
        System.exit(SpringApplication.exit(SpringApplication.run(
                ReceiveEmailApplication.class, args
        )));
    }

    @Override
    public void run(ApplicationArguments args) {
        boolean isSucceed = service.isSucceedCheck();
        if (isSucceed) {
            exitCode = 0;
        } else {
            exitCode = 1;
        }
    }
}
