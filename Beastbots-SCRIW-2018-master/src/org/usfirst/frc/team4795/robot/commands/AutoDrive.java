package org.usfirst.frc.team4795.robot.commands;

import org.usfirst.frc.team4795.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class AutoDrive extends Command {

	private double Time;
	
	public AutoDrive(double time) {
		requires(Robot.drivebase);
		Time = time;
	}
	protected void intialize() {
		setTimeout(Time);
	}
	
	protected void execute() {
		Robot.drivebase.setMotors(.6, .6);
	}
	
	protected boolean isFinished() {
		return isTimedOut();
	}
	
	protected void end() {
		Robot.drivebase.setMotors(0, 0);
	}

}
