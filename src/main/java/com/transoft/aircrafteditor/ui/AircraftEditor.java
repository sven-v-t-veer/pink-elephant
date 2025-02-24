package com.transoft.aircrafteditor.ui;

import javax.swing.JFrame;

public class AircraftEditor extends JFrame {

    private BaseContentPane contentPane = new BaseContentPane();

    public AircraftEditor() {
   
        this.setTitle("Aircraft Editor");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(contentPane);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
    
}
