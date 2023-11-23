package main.eu.sig.training.maintainabilitybook.ch03_complexity;

import java.awt.Color;
import java.util.List;

/**
 * 
 */
public class FlagFactory {

    // tag::getFlag[]
    public List<Color> getFlagColors(Nationality nationality) {
        return nationality.colors;
    }
    // end::getFlag[]

}