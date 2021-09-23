package jp.co.example.receive.email.domain.exception;

public class EmailReceiveException extends Exception {
    public EmailReceiveException() {
        super();
    }
    public EmailReceiveException(String message) {
        super(message);
    }
    public EmailReceiveException(Throwable throwable) {
        super(throwable);
    }
    public EmailReceiveException(String message, Throwable throwable) {
        super(message, throwable);
    }
}
