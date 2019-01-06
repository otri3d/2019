// package org.usfirst.frc420.MyRobot.commands;
// import edu.wpi.first.wpilibj.command.Command;
// import org.usfirst.frc420.MyRobot.Robot;

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;
/**
 *
 */
public class TankDrive extends Command {

    	/** The Constant DELTA_LIMIT. */
	private static final double DELTA_LIMIT = 0.75;
	
	/** The Constant RAMP_UP_CONSTANT. */
	private static final double RAMP_UP_CONSTANT = 0.05;
	
	/** The Constant RAMP_DOWN_CONSTANT. */
	private static final double RAMP_DOWN_CONSTANT = 0.05;
	
	/** Variables used for joystick ramping*/
	double deltaL = 0;
	double deltaR = 0;
	double prevInputL = 0;
	double inputL = 0;
	double prevInputR = 0;
	double inputR = 0;
	

    public TankDrive() {
        requires(Robot.dt);
    }

    // Called just before this Command runs the first time
    @Override
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    @Override
    protected void execute() {
        inputL = Robot.m_oi.leftY()*-1;
		inputR = Robot.m_oi.rightY();
		deltaL = inputL - prevInputL;
		deltaR = inputR - prevInputR;
		
		if(deltaL >= DELTA_LIMIT)
			inputL += RAMP_UP_CONSTANT;
		else if(deltaL <= -DELTA_LIMIT)
			inputL -= RAMP_DOWN_CONSTANT;
		
		if(deltaR >= DELTA_LIMIT)
			inputR += RAMP_UP_CONSTANT;
		else if(deltaR <= -DELTA_LIMIT)
            inputR -= RAMP_DOWN_CONSTANT;
            
        Robot.dt.leftGearbox(inputL);
		Robot.dt.rightGearbox(inputR);
		
		prevInputL = inputL;
		prevInputR = inputR;
    }

    // Make this return true when this Command no longer needs to run execute()
    @Override
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    @Override
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    @Override
    protected void interrupted() {
    }
}
