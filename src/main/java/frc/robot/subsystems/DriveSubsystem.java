/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.PIDController;
import edu.wpi.first.wpilibj.SerialPort;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;
import frc.robot.commands.TankDrive;
import frc.robot.commands.ArcadeDrive;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;
import com.kauailabs.navx.frc.AHRS;


public class DriveSubsystem extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.
  private VictorSPX leftfrontMotor;
  private VictorSPX leftbackMotor;
  private VictorSPX rightfrontMotor;
  private VictorSPX rightbackMotor;

  public PIDController gyroPID;

  private static final double kP = 0.03;
  private static final double kI = 0.01;
  private static final double kD = 0.00;
  private static final double kF = 0.00;

  private static final double kToleranceDegrees = 2.0f;

  private AHRS ahrs; 

  public DriveSubsystem() {
    leftfrontMotor = new VictorSPX(RobotMap.leftfront);
    leftbackMotor = new VictorSPX(RobotMap.leftback);
    rightfrontMotor = new VictorSPX(RobotMap.rightfront);
    rightbackMotor = new VictorSPX(RobotMap.rightback);

    try {
      ahrs = new AHRS(SerialPort.Port.kMXP);
    } catch (RuntimeException e){
      DriverStation.reportError("NAVX error" + e.getMessage(), true);
    }

  }

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());

    //setDefaultCommand(new ArcadeDrive());
     setDefaultCommand(new TankDrive());
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

  // autonomous methods 

  public void DriveStraightNoSensors(double power, double time){
    {
      leftGearBox(-power);
      rigthGearBox(power);
    }
    Timer.delay(time);
  }

  public void turnRight(double power, double time){
    {
      leftGearBox(-power);
      rigthGearBox(0);
    }
    Timer.delay(time);
  }

  public void turnLeft(double power, double time){
    {
      leftGearBox(0);
      rigthGearBox(power);
    }
    Timer.delay(time);
  }

  // gyro methods
  public double angle(){
    return ahrs.getAngle();
  }
  public double Yaw(){ // z axis
    return ahrs.getYaw();
  }
  public double Pitch(){ // x axis 
    return ahrs.getPitch();
  }
  public double Roll(){ // Y acis
    return ahrs.getRoll();
  }
  public AHRS getAhrs(){
    return ahrs;
  }
  public double rate(){
    return ahrs.getRate();
  }
}
