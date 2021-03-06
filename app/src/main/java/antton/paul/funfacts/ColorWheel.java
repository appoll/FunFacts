package antton.paul.funfacts;

import android.graphics.Color;

import java.util.Random;

/**
 * Created by Paul's on 19-Nov-14.
 */
public class ColorWheel {

    public static String[] mColors = {
            "#39add1", // light blue
            "#3079ab", // dark blue
            "#c25975", // mauve
            "#e15258", // red
            "#f9845b", // orange
            "#838cc7", // lavender
            "#7d669e", // purple
            "#53bbb4", // aqua
            "#51b46d", // green
            "#e0ab18", // mustard
            "#637a91", // dark gray
            "#f092b0", // pink
            "#b7c0c7"  // light gray
    };

    public static int getColor(){

        Random randomGenerator = new Random ();
        int randomNumber = randomGenerator.nextInt(10);

        return Color.parseColor(mColors[randomNumber]);
    }
}
