package org.usfirst.frc.team4795.robot.commands;

import org.usfirst.frc.team4795.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class GearShift extends Command {

	public GearShift() {
		requires(Robot.pneumatics);
	}

	protected void initialize() {
	}

	protected void execute() {
		Robot.pneumatics.whoosh(Robot.oi.getButtonA(), Robot.oi.getButtonX());
	}

	@Override
	protected boolean isFinished() {
		return false;
	}

	protected void end() {
	}

	protected void interrupted() {
		end();
	}
}
