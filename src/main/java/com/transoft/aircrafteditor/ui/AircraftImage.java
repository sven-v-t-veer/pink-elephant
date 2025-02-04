package com.transoft.aircrafteditor.ui;

import com.transoft.aircrafteditor.domain.Aircraft;

import javax.swing.*;
import java.awt.*;

public class AircraftImage extends JPanel {

    private Aircraft aircraft;

    public AircraftImage() {
        this.setPreferredSize(new Dimension(400, 600));
        this.setBackground(Color.WHITE);
    }

    @Override
    protected void paintComponent(Graphics g) {
        if (aircraft != null) {
            super.paintComponent(g);
            int centerWidth = this.getPreferredSize().width / 2;
            int centerHeight = this.getPreferredSize().height / 2;
            g.setColor(Color.BLACK);
            g.drawLine(centerWidth, centerHeight - aircraft.getLength() / 2, centerWidth, centerHeight + aircraft.getLength() / 2);
            g.drawLine(centerWidth - aircraft.getWidth() / 2, centerHeight - aircraft.getLength() / 4, centerWidth + aircraft.getWidth() / 2, centerHeight - aircraft.getLength() / 4);
        } else {
            super.paintComponent(g);
        }
    }

    public void drawAircraft(Aircraft aircraft) {
        this.aircraft = aircraft;
        this.repaint();
    }
}
