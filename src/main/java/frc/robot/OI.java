/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {

  public class XboxController extends GenericHID {

    public double getTriggerAxis(GenericHID.Hand kleft) {

      double axisValue = 0;

      if (getTriggerAxis(kleft) >= 50) {
        // tell robot to move forward
      } else if (getTriggerAxis(kleft) <= -50) {
        // Tell robot to move backwards
      } else if (getTriggerAxis(kleft) == 0) {
        // Tell robot not to move forward or back
      } else {
        // Tell robot to not move
      }
    }

    public double getTriggerAxis(GenericHID.Hand kright) {

      if (getTriggerAxis(kright) >= 50) {
        // Tell robot to move right
      } else if (getTriggerAxis(kright) <= -50) {
        // Tell robot to move left
      } else if (getTriggerAxis(kright) == 0) {
        // Tell robot not to move side to side
      } else {
        // Tell robot to not move
      }

    }

    public boolean getXButton;
    {

      if (getXButtonPressed) {
        if (getXButtonReleased) {
          // Tell bot what to do when B is pressed
        }
      }
    }
    public boolean getYButton;
    {

      if (getYButtonPressed) {
        if (getYButtonReleased) {
          // Tell bot what to do when B is pressed
        }
      }
    }

    public boolean getAButton;
    {

      if (getAButtonPressed) {
        if (getAButtonReleased) {
          // Tell bot what to do when A is pressed
        }
      }
    }

    public boolean getBButton;
    {

      if (getBButtonPressed) {
        if (getBButtonReleased) {
          // Tell bot what to do when B is pressed
        }
      }
    }

    public boolean getBumper(GenericHID.Hand kleft) {

      if (getBumperPressed(kleft)) {
        if (getBumperReleased(kleft)) {
          // Tell bot what to do when left bumper is pressed
        }
      }
    }

    public boolean getBumper(GenericHID.Hand kright) {

      if (getBumperPressed(kright)) {
        if (getBumperreleased(kright)) {
          // Tell bot what to do when right bumper is pressed
        }
      }
    }
  }
}