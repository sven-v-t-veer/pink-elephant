package com.transoft.aircrafteditor.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;

public class AircraftPanel extends JPanel {

    private AircraftImage image;

    public AircraftPanel() {
        this.setLayout(new BorderLayout());
        this.setPreferredSize(new Dimension(400, 600));
        this.setBackground(Color.PINK);
        addComponents();
    }

    private void addComponents() {
        image = new AircraftImage();
        image.setSize(new Dimension(400, 600));
        this.add(image, BorderLayout.CENTER);
    }

    public AircraftImage getImage() {
        return image;
    }
}
