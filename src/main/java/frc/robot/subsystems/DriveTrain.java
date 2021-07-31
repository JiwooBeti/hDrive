package frc.robot.subsystems;

import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.RobotContainer;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.GenericHID.Hand;

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

    /*public void driveWithJoystick(XboxController xboxController) {
        
        //this statement below is probably wrong
        drive.arcadeDrive(xboxController.getY(), xboxController.getX());
    }*/



    /*public double getYinput(XboxController xboxController) {

        return xboxController.getY(Hand.kLeft);
        //gets y input of left joystick
    }

    public double getXinput(XboxController xboxController) {
        return xboxController.getX(Hand.kRight);
        //gets x input of right joystick
    }

    public void moveVertically(double leftSpeed, double rightSpeed) {
        left.set(leftSpeed);
        right.set(rightSpeed);
    }

    public void moveHorizontally(double centerSpeed) {
        center.set(centerSpeed);
    }*/

    //incorrect methods
    public void moveVertically(XboxController xboxController) {
        drive.arcadeDrive(xboxController.getY(Hand.kLeft), xboxController.getX(Hand.kLeft));
        //move vertically with the left joystick
        //i think im only supposed to move the 2 speed controller groups so this is wrong

    }

    public void moveHorizontally(XboxController xboxController) {
        drive.arcadeDrive(xboxController.getX(Hand.kRight), xboxController.getY(Hand.kRight));
        //move horizontally with right joystick, or maybe im supposed to do both on the same joystick 
        //i think im only supposed to move the 1 speed controller so this is wrong too
        // so maybe 

        // center.set(xboxController.getX(Hand.kRight));
        
        //left or right depends on the joystick used
    }


    public void stop() {
        left.stopMotor();
        right.stopMotor();
        center.stopMotor();
    }

}
