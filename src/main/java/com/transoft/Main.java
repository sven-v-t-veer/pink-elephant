package com.transoft;

import javax.swing.SwingUtilities;

import com.transoft.aircrafteditor.ui.AircraftEditor;

public class Main {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            AircraftEditor editor = new AircraftEditor();
            //editor.setResizable(false);
            editor.setVisible(true);
        });
    }
}
