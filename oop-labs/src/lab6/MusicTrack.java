package lab6;

import lab8.WrongLengthOfTrackException;
import lab8.WrongNameOfTrackException;
import lab8.WrongStyleNameException;

public abstract class MusicTrack {

    private String name;
    private int length;
    private String styleName;

    public MusicTrack(String name, int length, String styleName) throws WrongLengthOfTrackException, WrongNameOfTrackException, WrongStyleNameException {
        if (name == null || name == "") {
            throw new WrongNameOfTrackException();
        }
        if (length <= 0) {
            throw new WrongLengthOfTrackException("Wrong length of track.");
        }

        if (!styleName.equals("pop") && !styleName.equals("rock") && !styleName.equals("classic")) {
            throw new WrongStyleNameException();
        }
        this.name = name;
        this.length = length;
        this.styleName = styleName;
    }

    public String getName(){
        return name;
    }

    public int getLength() {
        return length;
    }

    public String getStyleName(){
        return styleName;
    }
}
