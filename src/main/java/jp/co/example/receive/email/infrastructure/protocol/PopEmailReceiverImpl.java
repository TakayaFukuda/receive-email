package jp.co.example.receive.email.infrastructure.protocol;

import jp.co.example.receive.email.adapter.IEmailReceiverAdapter;
import jp.co.example.receive.email.domain.exception.EmailReceiveException;
import org.springframework.stereotype.Component;

@Component("pop")
public class PopEmailReceiverImpl implements IEmailReceiverAdapter {

    public Boolean isSucceedReceiveEmail() throws EmailReceiveException {
        boolean isSucceed = false;
        return isSucceed;
    }
}
