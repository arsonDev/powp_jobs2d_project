package edu.kis.powp.jobs2d.events;

import edu.kis.powp.jobs2d.command.ComplexCommand;
import edu.kis.powp.jobs2d.command.DriverCommand;
import edu.kis.powp.jobs2d.command.factory.FigureFactory;
import edu.kis.powp.jobs2d.command.factory.SquareFactory;
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
        FigureFactory figureFactory = new SquareFactory();
        figureFactory.getShape(driverManager).execute(driverManager.getCurrentDriver());
    }
}
