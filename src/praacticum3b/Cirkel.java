package praacticum3b;

public class Cirkel {
    private int radius;
    private int xpos;
    private int ypos;

    public Cirkel(int radi, int xp, int yp) {
        this.radius = radi;
        this.xpos = xp;
        this.ypos = yp;

        if (radi <=0){
            throw new IllegalArgumentException("Radius moet groter dan 0 zijn!");}



    }

    public String toString() {
        String s = "cirkel" + "(" + xpos + "," + ypos + ")" + "met radius:" + radius;
        return s;
    }




}