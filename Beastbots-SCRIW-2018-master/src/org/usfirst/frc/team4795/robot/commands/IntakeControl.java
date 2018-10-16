package org.usfirst.frc.team4795.robot.commands;

import org.usfirst.frc.team4795.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class IntakeControl extends Command {

	public IntakeControl() {
		requires(Robot.intake);
	}
	
	protected void initialize() {
	}

	protected void execute() {
		if (Robot.oi.getButtonB()) {
			Robot.intake.intake();
		}
		if (Robot.oi.getRightBumper()) {
			Robot.intake.rev();
		}
		if (Robot.oi.getLeftBumper()) {
			Robot.intake.shoot();
		}
	}

	protected boolean isFinished() {
		return false;
	}

	protected void end() {
	}

	protected void interrupted() {
		end();
	}

}
