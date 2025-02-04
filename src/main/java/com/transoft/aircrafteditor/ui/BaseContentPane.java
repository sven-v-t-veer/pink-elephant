package com.transoft.aircrafteditor.ui;

import javax.swing.*;
import java.awt.*;

public class BaseContentPane extends JPanel {

    private EditPanel editPanel;
    private AircraftPanel aircraftPanel;


    public  BaseContentPane() {
        this.setLayout(new FlowLayout(FlowLayout.LEADING));
        this.setPreferredSize(new Dimension(800, 600));
        this.setMaximumSize(new Dimension(800, 600));
        setBackground(Color.DARK_GRAY);
        addComponents();
    }

    private void addComponents() {
        editPanel = new EditPanel();
        aircraftPanel = new AircraftPanel();
        this.add(editPanel);
        this.add(aircraftPanel);
        editPanel.setTarget(aircraftPanel.getImage());
    }


}
