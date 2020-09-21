package edu.kis.powp.jobs2d.command.factory;

import edu.kis.powp.jobs2d.command.ComplexCommand;
import edu.kis.powp.jobs2d.command.DriverCommand;
import edu.kis.powp.jobs2d.command.OperateToCommand;
import edu.kis.powp.jobs2d.command.SetPositionCommand;
import edu.kis.powp.jobs2d.drivers.DriverManager;

public class SquareFactory implements FigureFactory {

    private ComplexCommand complexCommand = new ComplexCommand();

    public DriverCommand getShape(DriverManager driver) {
        complexCommand.addCommand(new SetPositionCommand( -100, -100));
        complexCommand.addCommand(new OperateToCommand( -100, 100));
        complexCommand.addCommand(new OperateToCommand(100, 100));
        complexCommand.addCommand(new OperateToCommand(100, -100));
        complexCommand.addCommand(new OperateToCommand(-100, -100));

        return complexCommand;
    }
}
