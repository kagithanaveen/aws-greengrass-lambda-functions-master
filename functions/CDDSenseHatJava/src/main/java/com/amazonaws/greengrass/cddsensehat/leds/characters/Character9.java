package com.amazonaws.greengrass.cddsensehat.leds.characters;

import com.amazonaws.greengrass.cddsensehat.leds.SenseHatLED;

public class Character9 extends AbstractCharacter {
    @Override
    protected void draw(SenseHatLED[][] temp) {
        setLine(temp, 0, black, white, white, black);
        setLine(temp, 1, white, black, black, white);
        setLine(temp, 2, white, black, black, white);
        setLine(temp, 3, white, black, black, white);
        setLine(temp, 4, black, white, white, white);
        setLine(temp, 5, black, black, black, white);
        setLine(temp, 6, black, black, black, white);
        setLine(temp, 7, black, black, black, white);
    }
}
