package lab6;

import lab8.WrongLengthOfTrackException;
import lab8.WrongNameOfTrackException;
import lab8.WrongStyleNameException;

public class RockMusic extends MusicTrack {
    public RockMusic(String name, int length, String styleName) throws WrongLengthOfTrackException, WrongNameOfTrackException, WrongStyleNameException {
        super(name, length, styleName);
    }
}
