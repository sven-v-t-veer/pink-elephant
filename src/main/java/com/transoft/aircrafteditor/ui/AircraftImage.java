package com.transoft.aircrafteditor.ui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

import com.transoft.aircrafteditor.domain.Aircraft;

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
            int centerWidth = this.getSize().width / 2;
            int centerHeight = this.getSize().height / 2;
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
