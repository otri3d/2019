/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;
import frc.robot.commands.TankDrive;
import frc.robot.commands.ArcadeDrive;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;

/**
 * An example subsystem. You can replace me with your own Subsystem.
 */
public class DriveSubsystem extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.
  private VictorSPX leftfrontMotor;
  private VictorSPX leftbackMotor;
  private VictorSPX rightfrontMotor;
  private VictorSPX rightbackMotor;

  // Put in your motors (Victor, Spark, whatnot)
  // private Spark leftfrontMotor;
  // private Spark leftbackMotor;
  // private Spark rightfrontMotor;
  // private Spark rightbackMotor;

  public DriveSubsystem() {
    leftfrontMotor = new VictorSPX(RobotMap.leftfront);
    leftbackMotor = new VictorSPX(RobotMap.leftback);
    rightfrontMotor = new VictorSPX(RobotMap.rightfront);
    rightbackMotor = new VictorSPX(RobotMap.rightback);

  }

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());

    setDefaultCommand(new ArcadeDrive());
    // uncomment for tankdrive
    // setDefaultCommand(new TankDrive());
  }

  @Override
  public void periodic() {

  }

  public void leftGearBox(double power) {
    leftbackMotor.set(ControlMode.PercentOutput, power);
    leftfrontMotor.set(ControlMode.PercentOutput, power);
  }

  public void rigthGearBox(double power) {
    rightbackMotor.set(ControlMode.PercentOutput, power);
    rightfrontMotor.set(ControlMode.PercentOutput, power);
  }
}
