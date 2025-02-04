package com.transoft.aircrafteditor.action;

import com.transoft.aircrafteditor.domain.Aircraft;
import com.transoft.aircrafteditor.ui.AircraftImage;

import javax.swing.*;

public class DrawAircraftAction  {

    public void drawAircraft(AircraftImage target, Aircraft aircraft) {
        SwingUtilities.invokeLater(() -> {
            target.drawAircraft(aircraft);
        });
    }
}
