package main.eu.sig.training.maintainabilitybook.ch03_complexity;

import java.awt.Color;
import java.util.Arrays;
import java.util.List;

/*8
 * 
 */
public enum Nationality {

    //
    UNCLASSIFIED(Arrays.asList(Color.GRAY)),
    DUTCH(Arrays.asList(Color.RED, Color.WHITE, Color.BLUE)),
    GERMAN(Arrays.asList(Color.BLACK, Color.RED, Color.YELLOW)),
    BELGIAN(Arrays.asList(Color.BLACK, Color.YELLOW, Color.RED)),
    FRENCH(Arrays.asList(Color.BLUE, Color.WHITE, Color.RED)),
    ITALIAN(Arrays.asList(Color.GREEN, Color.WHITE, Color.RED)),
    ROMANIA(Arrays.asList(Color.BLUE, Color.YELLOW, Color.RED)),
    IRELAND(Arrays.asList(Color.GREEN, Color.WHITE, Color.ORANGE)),
    HUNGARIAN(Arrays.asList(Color.RED, Color.WHITE, Color.GREEN)),
    BULGARIAN(Arrays.asList(Color.WHITE, Color.GREEN, Color.RED)),
    RUSSIA(Arrays.asList(Color.WHITE, Color.BLUE, Color.RED));

    public List<Color> colors;

    Nationality(List<Color> colors) {
        this.colors = colors;
    }
}
