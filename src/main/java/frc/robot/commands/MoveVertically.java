package frc.robot.commands;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.RobotContainer;

public class MoveVertically extends CommandBase {
    //useless method
    private XboxController xboxController;

    public MoveVertically(XboxController xboxController) {
        this.xboxController = xboxController;
        addRequirements(RobotContainer.getDriveTrain());
    }

    @Override
    public void initialize() {
        RobotContainer.getDriveTrain().moveVertically(xboxController);
    }

    @Override
    public void execute() {
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
