package com.transoft.aircrafteditor.action;

import javax.swing.SwingUtilities;

import com.transoft.aircrafteditor.domain.Aircraft;
import com.transoft.aircrafteditor.ui.AircraftImage;

public class DrawAircraftAction  {

    public void drawAircraft(AircraftImage target, Aircraft aircraft) {
        SwingUtilities.invokeLater(() -> {
            target.drawAircraft(aircraft);
        });
    }
}
