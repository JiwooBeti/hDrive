package frc.robot.commands;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.RobotContainer;

public class DriveWithXbox extends CommandBase {
    private XboxController xboxController;
    //im too lazy rn but i should make a default command with intitialize and execute running both the horiontal and vertical moving stuff
    //edit i did it

    public DriveWithXbox(XboxController xboxController) {
        this.xboxController = xboxController;
        addRequirements(RobotContainer.getDriveTrain());
    }

    @Override
    public void initialize() {
        RobotContainer.getDriveTrain().moveHorizontally(xboxController);
        RobotContainer.getDriveTrain().moveVertically(xboxController);
    }

    @Override
    public void execute() {
        RobotContainer.getDriveTrain().moveHorizontally(xboxController);
        RobotContainer.getDriveTrain().moveVertically(xboxController);
    }

    @Override
    public boolean isFinished() {
        return false;
    }

    @Override
    public void end(boolean interrupted) {
        RobotContainer.getDriveTrain().stop();
    }   
}
