/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team4795.robot;

import org.usfirst.frc.team4795.robot.commands.AutoDrive;
import org.usfirst.frc.team4795.robot.subsystems.Arm;
import org.usfirst.frc.team4795.robot.subsystems.Drivebase;
import org.usfirst.frc.team4795.robot.subsystems.Intake;
import org.usfirst.frc.team4795.robot.subsystems.Pneumatics;

import com.ctre.phoenix.motorcontrol.LimitSwitchNormal;
import com.ctre.phoenix.motorcontrol.LimitSwitchSource;
import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.command.Scheduler;

public class Robot extends TimedRobot {

	public static OI oi;
	public static Drivebase drivebase;
	public static Pneumatics pneumatics;
	public static Intake intake;
	public static Arm arm;

	@Override
	public void robotInit() {
		oi = new OI();
		drivebase = new Drivebase();
		pneumatics = new Pneumatics();
		intake = new Intake();
		arm = new Arm();
	}

	@Override
	public void disabledInit() {

	}

	public void disabledPeriodic() {
		Scheduler.getInstance().run();
	}

	public void autonomousInit() {
		Scheduler.getInstance().add(new AutoDrive(4));
	}

	public void autonomousPeriodic() {
		Scheduler.getInstance().run();
	}

	public void teleopInit() {

	}

	public void teleopPeriodic() {
		Scheduler.getInstance().run();
	}

	public void testPeriodic() {
	}

	public static void masterTalon(TalonSRX motor) {
		motor.configContinuousCurrentLimit(10, 0);
		motor.configPeakCurrentLimit(12, 0);
		motor.configPeakCurrentDuration(20, 0);
		motor.enableCurrentLimit(true);
		motor.configOpenloopRamp(0.8, 0);
		motor.configClosedloopRamp(1.0, 0);
	}

	public static void initTalon(TalonSRX motor) {
		motor.setNeutralMode(NeutralMode.Brake);
		motor.neutralOutput();
		motor.setSensorPhase(false);
		motor.configForwardLimitSwitchSource(LimitSwitchSource.FeedbackConnector, LimitSwitchNormal.NormallyOpen, 0);
		motor.configReverseLimitSwitchSource(LimitSwitchSource.FeedbackConnector, LimitSwitchNormal.NormallyOpen, 0);
		motor.configNominalOutputForward(0.0, 0);
		motor.configNominalOutputReverse(0.0, 0);
	}

	public static void initVictor(VictorSPX motor) {
		motor.setNeutralMode(NeutralMode.Brake);
		motor.neutralOutput();
		motor.setSensorPhase(false);
		motor.configNominalOutputForward(0.0, 0);
		motor.configNominalOutputReverse(0.0, 0);
	}
}
