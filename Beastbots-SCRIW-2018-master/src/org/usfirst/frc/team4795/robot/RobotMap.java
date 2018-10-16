/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team4795.robot;

public enum RobotMap {
	//CAN Motor mappings
	LEFT_MOTOR_ONE(1),
	LEFT_MOTOR_TWO(2),
	LEFT_MOTOR_THREE(3), //Victor SPX
	RIGHT_MOTOR_ONE(4),
	RIGHT_MOTOR_TWO(5), //Victor SPX
	RIGHT_MOTOR_THREE(6), //Victor SPX
	ARM(7),
	//PWM Mappings
	LEFT_MOTOR(1),
	SHOOT_LEFT(2),
	RIGHT_MOTOR(3),
	SHOOT_RIGHT(4),
	//Controller mapping
	MAIN_CONTROLLER(0),
	//Pneumatics
	VALVE_ONE(0),
	VALVE_TWO(1);
	
	public final int value;
	
	RobotMap(int value) {

	this.value = value;
	}
}	
	
