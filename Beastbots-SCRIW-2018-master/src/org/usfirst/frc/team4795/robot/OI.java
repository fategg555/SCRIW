/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team4795.robot;

import edu.wpi.first.wpilibj.Joystick;

public class OI {

	private static final double DEADZONE = 0.2;

	public final Joystick CONTROLLER = new Joystick(RobotMap.MAIN_CONTROLLER.value);

	public double getLeftJoyY() {
		final double raw = CONTROLLER.getRawAxis(1);
		return Math.abs(raw) < DEADZONE ? 0.0 : raw;
	}

	public double getRightJoyX() {
		final double raw = CONTROLLER.getRawAxis(4);
		return Math.abs(raw) < DEADZONE ? 0.0 : raw;
	}

	public boolean getButtonA() {
		return CONTROLLER.getRawButton(1);
	}

	public boolean getButtonX() {
		return CONTROLLER.getRawButton(3);
	}

	public boolean getButtonY() {
		return CONTROLLER.getRawButton(4);
	}

	public boolean getButtonB() {
		return CONTROLLER.getRawButton(5);
	}
	
	public boolean getRightBumper() {
		return CONTROLLER.getRawButton(6);
	}
	
	public boolean getLeftBumper() {
		return CONTROLLER.getRawButton(7);
	}
	
	public double getRightTrigger() {
		return Math.abs(CONTROLLER.getRawAxis(3)) < DEADZONE ? 0.0 : CONTROLLER.getRawAxis(3);
	}

	public OI() {

	}
}
