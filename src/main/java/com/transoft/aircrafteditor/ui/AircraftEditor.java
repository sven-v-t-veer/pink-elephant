package com.transoft.aircrafteditor.ui;

import javax.swing.*;

public class AircraftEditor extends JFrame {

    private JPanel contentPane;

    public AircraftEditor() {
        this.setTitle("Aircraft Editor");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(new BaseContentPane());
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
