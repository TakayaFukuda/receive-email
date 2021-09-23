package jp.co.example.receive.email.adapter;

import jp.co.example.receive.email.domain.exception.EmailSendException;
import org.springframework.stereotype.Component;

@Component
public interface IEmailSenderAdapter {
    Boolean isSucceedSend() throws EmailSendException;
}
