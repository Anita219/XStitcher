package model;

import java.util.ArrayList;

public class Pattern {
    /**
     * Here, all information about the resulting pattern is saved
     *
     * amount of stitches (width and height)
     * list of colours with amount of stitches and Yarn name
     *
     */

    int[] size;
    ArrayList<Thread> colours;

    public Pattern(int width, int height){
        this.size = new int[]{width, height};
        colours = new ArrayList<Thread>();
    }

    public int[] getSize() {
        return size;
    }

    public void setSize(int[] size) {
        this.size = size;
    }

    public ArrayList<Thread> getColours() {
        return colours;
    }

    public void setColours(ArrayList<Thread> colours) {
        this.colours = colours;
    }
}
