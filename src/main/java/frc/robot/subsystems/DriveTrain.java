package frc.robot.subsystems;

import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.RobotContainer;
import edu.wpi.first.wpilibj.XboxController;

public class DriveTrain extends SubsystemBase {
    //ray was here 7/29
    private static SpeedController center;
    private static SpeedControllerGroup left, right;
    private static DifferentialDrive drive;

    public DriveTrain(SpeedControllerGroup left, SpeedControllerGroup right, DifferentialDrive drive, SpeedController center) {
        this.left = left;
        this.right = right;
        this.drive = drive;
        this.center = center;
    }


    public void getXboxInputs(XboxController xboxController) {
        drive.arcadeDrive(xboxController.getY(), xboxController.getX());
    }




    


    public void stop() {
        left.stopMotor();
        right.stopMotor();
        center.stopMotor();
    }

    


}
