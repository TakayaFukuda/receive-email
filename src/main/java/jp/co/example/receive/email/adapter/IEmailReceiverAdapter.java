package jp.co.example.receive.email.adapter;

import jp.co.example.receive.email.domain.exception.EmailReceiveException;
import org.springframework.stereotype.Component;

@Component
public interface IEmailReceiverAdapter {
    Boolean isSucceedReceiveEmail() throws EmailReceiveException;
}
