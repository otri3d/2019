/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/
// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.
package frc.robot.subsystems;

// import edu.wpi.first.wpilibj.command.Subsystem;
// package org.usfirst.frc420.MyRobot.subsystems;


// import org.usfirst.frc420.MyRobot.commands.*;
// import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import frc.robot.commands.ArcadeDrive;
import edu.wpi.first.wpilibj.command.Subsystem;
// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.AnalogAccelerometer;
import edu.wpi.first.wpilibj.AnalogGyro;
import edu.wpi.first.wpilibj.VictorSPX;
import edu.wpi.first.wpilibj.PowerDistributionPanel;
import edu.wpi.first.wpilibj.SpeedControllerGroup;

// END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS

/**
 * An example subsystem.  You can replace me with your own Subsystem.
 */
public class DriveSubsystem extends Subsystem {

  // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

  // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

  // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
  private VictorSPX leftFrontMotor;
  private VictorSPX leftBackMotor;
  private SpeedControllerGroup leftMotorGroup;
  private VictorSPX speedController3;
  private VictorSPX speedController4;
  private SpeedControllerGroup rightMotorGroup;
  private AnalogAccelerometer navXAccel;
  private PowerDistributionPanel powerDistributionPanel1;
  private AnalogGyro navXGyro;

  // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

  public DriveSubsystem() {
      // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
      leftFrontMotor = new VictorSPX(0);
      leftFrontMotor.setInverted(false);
      
      leftBackMotor = new VictorSPX(1);
      leftBackMotor.setInverted(false);
      
      leftMotorGroup = new SpeedControllerGroup(leftFrontMotor, leftBackMotor  );
      
      
      speedController3 = new VictorSPX(3);
      speedController3.setInverted(false);
      
      speedController4 = new VictorSPX(2);
      speedController4.setInverted(false);
      
      rightMotorGroup = new SpeedControllerGroup(speedController3, speedController4  );
      
      
      // navXAccel = new AnalogAccelerometer(0);
      // navXAccel.setSensitivity(0.0);
      // navXAccel.setZero(2.5);
      
      // powerDistributionPanel1 = new PowerDistributionPanel(0);
      
      
      // navXGyro = new AnalogGyro(1);
      // navXGyro.setSensitivity(0.007);
      

      // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
  }

  @Override
  public void initDefaultCommand() {
      // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

      setDefaultCommand(new ArcadeDrive(0, 0));

      // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

      // Set the default command for a subsystem here.
      // setDefaultCommand(new MySpecialCommand());
  }

  @Override
  public void periodic() {
      // Put code here to be run every loop

  }

  // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CMDPIDGETTERS


  // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CMDPIDGETTERS

  // Put methods for controlling this subsystem
  // here. Call these from Commands.

}

