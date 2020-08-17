package msuser.ingress.exception;

public class InvalidStateException extends RuntimeException{
    public InvalidStateException(){

    }

    public InvalidStateException(String message){
        super(message);
    }

    public InvalidStateException(String message, Throwable cause){
        super(message,cause);
    }
}
