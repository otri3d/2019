/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;

/**
 * An example subsystem.  You can replace me with your own Subsystem.
 */
public class ShoulderSubsystem extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.
  private VictorSPX FrontMotor; 
  private VictorSPX BackMotor;

  // Put in your motors (Victor, Spark, whatnot)
  // private Spark FrontMotor; 
  // private Spark BackMotor;
  
  public ShoulderSubsystem(){
    FrontMotor = new VictorSPX(RobotMap.shoulderFront);
    BackMotor = new VictorSPX(RobotMap.shoulderBack);

  }

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }

  @Override
  public void periodic(){

  }

  public void shoulderGearBox(double power){
    FrontMotor.set(ControlMode.PercentOutput, power);
    BackMotor.set(ControlMode.PercentOutput, power);
  }

}
