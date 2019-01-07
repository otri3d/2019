/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
  // For example to map the left and right motors, you could define the
  // following variables to use with your drivetrain subsystem.
  // public static int leftMotor = 1;
  // public static int rightMotor = 2;

  // If you are using multiple modules, make sure to define both the port
  // number and the module. For example you with a rangefinder:
  // public static int rangefinderPort = 1;
  // public static int rangefinderModule = 1;

  public static int leftfront = 1;
  public static int leftback = 2;
  public static int rightfront = 3;
  public static int rightback = 4;

  public static int shoulderFront = 5;
  public static int shoulderBack = 6;

  public static int wristMotor = 7;

  public static int intake = 8;

  // Buttons

  public static int shoulderUpButton = 1;// 5 (left bumper)
  public static int shoulderDownButton = 2;// 6 (right bumper)
  public static int wristUpButton = 3;// 4 (Y)
  public static int wristDownButton = 4;// 1 (A)
  public static int intakeButton = 5;// axis 3 (0 to 1)(left trigger)... alternatively we can use x
                                     // and b in which
                                     // case this would be 3 (X)
  public static int outtakeButton = 6;// axis 3 (0 to -1)(right trigger)... alternatively we can use
                                      // x and b in
                                      // which case this would be 2 (B)
  public static int allignUsingVisionButton = 7;// 3 if we wanted to use (X)... if alternative used
                                                // above can use button 7 (back) or 8 (start) for
                                                // vision (if wanted)

  // limit switches
  public static int shoulderlimitmax = 0;
  public static int shoulderlimitmin = 1;
  public static int wristmax = 2;
  public static int wristmin = 3;

}
