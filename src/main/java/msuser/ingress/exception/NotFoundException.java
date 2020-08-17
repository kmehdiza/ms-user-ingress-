package msuser.ingress.exception;

public class NotFoundException extends RuntimeException{
    public NotFoundException(){

    }

    public NotFoundException(String messages){
        super(messages);
    }

    public NotFoundException(String messages, Throwable cause){
        super(messages, cause);
    }

    public NotFoundException(Throwable cause){
        super(cause);
    }

    public NotFoundException(String messages, Throwable cause, boolean enableSuppression, boolean writableStackTrace){
        super(messages,cause,enableSuppression,writableStackTrace);
    }
}
