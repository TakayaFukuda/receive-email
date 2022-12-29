package jp.co.example.receive.email.domain;

import lombok.Data;

@Data
public class EmailAccountInfo {
    private String host;
    private Integer port;
    private String domain;
    private String id;
    private String pass;
}
