package lab8;

public class WrongNameOfTrackException extends RuntimeException{

    public WrongNameOfTrackException() {
        System.out.println("The name of track is wrong. Please change it.");
    }

    public WrongNameOfTrackException(String message) {
        super(message);
    }
}
