package frc.robot.subsystems;

// import edu.wpi.first.wpilibj.command.Subsystem;
// package org.usfirst.frc420.MyRobot.subsystems;

import com.ctre.phoenix.*;
import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;

import frc.robot.RobotMap;
// import org.usfirst.frc420.MyRobot.commands.*;
import frc.robot.commands.TankDrive;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.AnalogAccelerometer;
import edu.wpi.first.wpilibj.AnalogGyro;
import edu.wpi.first.wpilibj.PowerDistributionPanel;
import edu.wpi.first.wpilibj.SpeedControllerGroup;

public class DriveSubsystem extends Subsystem {

  private VictorSPX leftFrontMotor;
  private VictorSPX leftBackMotor;
  private VictorSPX rightFrontMotor;
  private VictorSPX rightBackMotor;

  public DriveSubsystem() {
    
      leftFrontMotor = new VictorSPX(RobotMap.srx_left1);
      leftFrontMotor.setInverted(false);
      
      leftBackMotor = new VictorSPX(RobotMap.srx_left2);
      leftBackMotor.setInverted(false);

      rightFrontMotor = new VictorSPX(RobotMap.srx_right3);
      rightFrontMotor.setInverted(false);

      rightBackMotor = new VictorSPX(RobotMap.srx_right4);
      rightBackMotor.setInverted(false);      
      
  }

  @Override
  public void initDefaultCommand() {
      setDefaultCommand(new TankDrive());
  }

  @Override
  public void periodic() {
      // Put code here to be run every loop

  }
  // Put methods for controlling this subsystem
  // here. Call these from Commands.
  public void leftGearbox(double power)
  {
      leftFrontMotor.set(ControlMode.PercentOutput,power);
      leftBackMotor.set(ControlMode.PercentOutput,power);
  }
  public void rightGearbox(double power)
  { 
    rightFrontMotor.set(ControlMode.PercentOutput,power);
    rightBackMotor.set(ControlMode.PercentOutput,power);
  }
}


