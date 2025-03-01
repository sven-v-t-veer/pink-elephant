package com.transoft.aircrafteditor.ui;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class InputPane extends JPanel {

    private final String text;
    private JLabel label;
    private JTextField field;

    public InputPane(String label) {
        this.setLayout(new BorderLayout());
        this.setPreferredSize(new Dimension(450, 30));
        setMaximumSize(new Dimension(450, 30));
        this.text = label;
        addComponents();
    }

    private void addComponents() {
        label = new JLabel(text);
        this.add(label, BorderLayout.LINE_START);
        field = new JTextField();
        this.add(field, BorderLayout.CENTER);
    }

    public int getValueAsInt() {
        return Integer.parseInt(field.getText());
    }
}
