package edu.kis.powp.jobs2d.command;

import edu.kis.powp.jobs2d.Job2dDriver;

import java.util.ArrayList;
import java.util.List;

public class ComplexCommand implements DriverCommand {

    private List<DriverCommand> complexCommands = new ArrayList();

    public void addCommand(DriverCommand command) {
        complexCommands.add(command);
    }

    @Override
    public void execute(Job2dDriver driver) {
        for(DriverCommand command : complexCommands){
            command.execute(driver);
        }
    }
}
