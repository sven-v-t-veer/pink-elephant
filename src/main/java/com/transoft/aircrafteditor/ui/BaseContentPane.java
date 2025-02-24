package com.transoft.aircrafteditor.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.JSplitPane;

public class BaseContentPane extends JPanel {

    private EditPanel editPanel;
    private AircraftPanel aircraftPanel;
    private JSplitPane contentPane;


    public  BaseContentPane() {
        this.setLayout(new BorderLayout());
		this.setPreferredSize(new Dimension(800, 600));
        setBackground(Color.GREEN);
        addComponents();
    }

    private void addComponents() {
    	contentPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
    	contentPane.setResizeWeight(0.5);
        editPanel = new EditPanel();
        aircraftPanel = new AircraftPanel();
        contentPane.setLeftComponent(editPanel);
        contentPane.setRightComponent(aircraftPanel);
        this.add(contentPane, BorderLayout.CENTER);
        editPanel.setTarget(aircraftPanel.getImage());
    }


}
