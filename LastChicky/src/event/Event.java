package event;

import character.*;

public class Event {
    public static boolean checkHit(Chicky chicky, Wave wave, int chickySize, int waveHeight){
        if(chicky.x+chickySize>wave.x&&chicky.x<wave.x) {
            if(chicky.y+chickySize>=wave.y-waveHeight) {
                return true;
            }
        }
        return false;
    }

    public static void gameStop(Wave[] wave,Environment[] env) {

    }

}