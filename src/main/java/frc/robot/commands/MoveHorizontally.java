package frc.robot.commands;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.RobotContainer;

public class MoveHorizontally extends CommandBase {
    //useless method
    private XboxController xboxController;

    public MoveHorizontally(XboxController xboxController) {
        this.xboxController = xboxController;
        addRequirements(RobotContainer.getDriveTrain());
    }

    @Override
    public void initialize() {
        RobotContainer.getDriveTrain().moveHorizontally(xboxController);
    }

    @Override
    public void execute() {
        RobotContainer.getDriveTrain().moveHorizontally(xboxController);
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
