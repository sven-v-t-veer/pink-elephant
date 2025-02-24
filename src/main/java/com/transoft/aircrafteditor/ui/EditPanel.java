package com.transoft.aircrafteditor.ui;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

import com.transoft.aircrafteditor.action.DrawAircraftAction;
import com.transoft.aircrafteditor.domain.Aircraft;

public class EditPanel extends JPanel {

    private InputPane widthPane;
    private InputPane heightPane;
    private JPanel top;
    private JPanel center;
    private JPanel bottom;
    private JButton okButton;
    private AircraftImage target;
    private final DrawAircraftAction action = new DrawAircraftAction();

    public EditPanel() {
        this.setLayout(new BorderLayout());
        this.setBackground(Color.WHITE);
        this.setSize(new Dimension(380, 580));
        this.setBounds(5, 5, 375, 575);
        addComponents();
    }

    void addComponents(){
        top = new JPanel();
        this.add(top, BorderLayout.NORTH);
        center = new JPanel();
        center.setLayout(new BoxLayout(center, BoxLayout.Y_AXIS));
        this.add(center, BorderLayout.CENTER);
        widthPane = new InputPane("Width: ");
        center.add(widthPane);
        heightPane = new InputPane("Height: ");
        center.add(heightPane);
        bottom = new JPanel();
        bottom.setLayout(new BorderLayout());
        okButton = new JButton();
        okButton.setText("OK");
        bottom.add(okButton, BorderLayout.EAST);
        this.add(bottom, BorderLayout.SOUTH);
        okButton.addActionListener((e) -> okAction());
    }

    private void okAction() {
        action.drawAircraft(target, new Aircraft(widthPane.getValueAsInt(), heightPane.getValueAsInt()));
    }

    public void setTarget(AircraftImage target) {
        this.target = target;
    }
}
