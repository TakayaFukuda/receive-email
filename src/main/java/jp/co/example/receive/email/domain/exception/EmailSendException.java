package jp.co.example.receive.email.domain.exception;

public class EmailSendException extends Exception {
    public EmailSendException() {
        super();
    }
    public EmailSendException(String message) {
        super(message);
    }
    public EmailSendException(Throwable throwable) {
        super(throwable);
    }
    public EmailSendException(String message, Throwable throwable) {
        super(message, throwable);
    }
}
