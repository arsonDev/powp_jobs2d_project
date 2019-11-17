package edu.kis.powp.jobs2d.events;

import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.magicpresets.FiguresJoe;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelectTestFigureThreeOptionListener implements ActionListener {

    private DriverManager driverManager;

    public SelectTestFigureThreeOptionListener(DriverManager driverManager) {
        this.driverManager = driverManager;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        FiguresJoe.figureScript2(driverManager.getCurrentDriver());
    }
}
