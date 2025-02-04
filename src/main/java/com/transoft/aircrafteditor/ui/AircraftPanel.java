package com.transoft.aircrafteditor.ui;

import javax.swing.*;
import java.awt.*;

public class AircraftPanel extends JPanel {

    private AircraftImage image;

    public AircraftPanel() {
        //this.setLayout(new BorderLayout());
        this.setPreferredSize(new Dimension(400, 600));
        this.setBackground(Color.GRAY);
        addComponents();
    }

    private void addComponents() {
        image = new AircraftImage();
        image.setPreferredSize(new Dimension(400, 600));
        this.add(image);
    }

    public AircraftImage getImage() {
        return image;
    }
}
