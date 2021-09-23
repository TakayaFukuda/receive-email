package jp.co.example.receive.email.service;

import jp.co.example.receive.email.adapter.IEmailReceiverAdapter;
import jp.co.example.receive.email.adapter.IEmailSenderAdapter;
import org.springframework.stereotype.Service;

@Service
public class ReceiveEmailService {
    private IEmailSenderAdapter sender;
    private IEmailReceiverAdapter receiver;

    public Boolean isSucceedCheck() {
        return false;
    }
}
