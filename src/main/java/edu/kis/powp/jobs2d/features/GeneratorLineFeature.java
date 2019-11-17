package edu.kis.powp.jobs2d.features;

import edu.kis.legacy.drawer.shape.line.AbstractLine;

import java.awt.*;

public class GeneratorLineFeature extends AbstractLine {

    public GeneratorLineFeature() {
        super();
        this.color = Color.BLUE;
        this.thickness = 1.0f;
        this.dotted = false;
    }

    public GeneratorLineFeature(Color color, Float thicknes, Boolean isDotted) {
        super();
        this.color = color;
        this.thickness = thicknes;
        this.dotted = isDotted;
    }
}
