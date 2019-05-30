package lab8;

public class WrongLengthOfTrackException extends RuntimeException{
    public WrongLengthOfTrackException() {
        System.out.println("The length of track canot be less than zero. Please change it.");
    }

    public WrongLengthOfTrackException(String message) {
        super(message);
    }
}
