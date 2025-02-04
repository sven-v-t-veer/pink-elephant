package com.transoft;

import com.transoft.aircrafteditor.ui.AircraftEditor;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            AircraftEditor editor = new AircraftEditor();
            editor.setResizable(false);
            editor.setVisible(true);
        });
    }
}
