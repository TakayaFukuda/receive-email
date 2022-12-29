package jp.co.example.receive.email.infrastructure.protocol;

import jp.co.example.receive.email.adapter.IEmailSenderAdapter;
import jp.co.example.receive.email.domain.exception.EmailSendException;
import org.springframework.stereotype.Component;

@Component
public class SmtpEmailSenderImpl implements IEmailSenderAdapter {

    public Boolean isSucceedSend() throws EmailSendException {
        boolean isSucceed = false;
        return isSucceed;
    }
}
