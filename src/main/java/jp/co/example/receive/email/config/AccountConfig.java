package jp.co.example.receive.email.config;

import java.util.List;
import jp.co.example.receive.email.domain.EmailAccountInfo;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("account")
public class AccountConfig {
    private List<EmailAccountInfo> emailAccountInfoList;
}
