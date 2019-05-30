package lab8;

public class WrongStyleNameException extends RuntimeException{

    public WrongStyleNameException() {
        System.out.println("The style name of track is wrong. Please change it.");
    }

    public WrongStyleNameException(String message) {
        super(message);
    }
}