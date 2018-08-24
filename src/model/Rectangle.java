package model;

import sound.MidiSynth;

import java.awt.*;

public class Rectangle extends Shape {
    public Rectangle(Point topLeft, MidiSynth midiSynth) {
        super(topLeft, midiSynth);
        instrument = 0;
        PLAYING_COLOR = new Color(230, 158, 60);                            //initalize in rect

    }

    public Rectangle(int x, int y, int w, int h) {
        super(x, y, w, h);
    }


    protected void drawGraphics(Graphics g) {
        g.drawRect(x, y, width, height);
    }

    @Override
    protected void fillGraphics(Graphics g) {
        g.fillRect(x, y, width, height);
    }

    public boolean contains(Point point) {
        int point_x = point.x;
        int point_y = point.y;

        return containsX(point_x) && containsY(point_y);
    }


}
