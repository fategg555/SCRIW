/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team4795.robot.subsystems;

import org.usfirst.frc.team4795.robot.Robot;
import org.usfirst.frc.team4795.robot.RobotMap;
import org.usfirst.frc.team4795.robot.commands.ArcadeDrive;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;

import edu.wpi.first.wpilibj.command.Subsystem;

public class Drivebase extends Subsystem {

	private TalonSRX rightMotorOne;
	private VictorSPX rightMotorTwo;
	private VictorSPX rightMotorThree;
	private TalonSRX leftMotorOne;
	private TalonSRX leftMotorTwo;
	private VictorSPX leftMotorThree;

	public Drivebase() {
		leftMotorOne = new TalonSRX(RobotMap.LEFT_MOTOR_ONE.value);
		leftMotorTwo = new TalonSRX(RobotMap.LEFT_MOTOR_TWO.value);
		leftMotorThree = new VictorSPX(RobotMap.LEFT_MOTOR_THREE.value);
		rightMotorOne = new TalonSRX(RobotMap.RIGHT_MOTOR_ONE.value);
		rightMotorTwo = new VictorSPX(RobotMap.RIGHT_MOTOR_TWO.value);
		rightMotorThree = new VictorSPX(RobotMap.RIGHT_MOTOR_THREE.value);

		Robot.initTalon(leftMotorOne);
		Robot.initTalon(leftMotorTwo);
		Robot.initVictor(leftMotorThree);
		Robot.initTalon(rightMotorOne);
		Robot.initVictor(rightMotorTwo);
		Robot.initVictor(rightMotorThree);

		Robot.masterTalon(leftMotorOne);
		Robot.masterTalon(rightMotorOne);

		leftMotorTwo.follow(leftMotorOne);
		leftMotorThree.follow(leftMotorOne);

		leftMotorTwo.setInverted(true); //  compensating
		leftMotorThree.setInverted(true);// for wiring

		rightMotorTwo.follow(rightMotorOne);
		rightMotorThree.follow(rightMotorOne);
	}

	public void setMotors(double leftValue, double rightValue) {
		leftMotorOne.set(ControlMode.PercentOutput, leftValue);
		rightMotorOne.set(ControlMode.PercentOutput, rightValue);
	}

	public void initDefaultCommand() {
		setDefaultCommand(new ArcadeDrive());
	}
}
