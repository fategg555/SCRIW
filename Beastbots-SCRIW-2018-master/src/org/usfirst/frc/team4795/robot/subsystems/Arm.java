package org.usfirst.frc.team4795.robot.subsystems;

import org.usfirst.frc.team4795.robot.Robot;
import org.usfirst.frc.team4795.robot.RobotMap;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.command.Subsystem;

public class Arm extends Subsystem {
	private TalonSRX arm1;
	
	public Arm () {
		arm1 = new TalonSRX(RobotMap.ARM.value);
		
		Robot.initTalon(arm1);
		Robot.masterTalon(arm1);
	}
	
	public void Lift(boolean upvalue, boolean downvalue) {
		if (upvalue == true) {
			arm1.set(ControlMode.PercentOutput, 0.5);
		} else if (downvalue == true) {
			arm1.set(ControlMode.PercentOutput, -0.5);
		} else {
			arm1.set(ControlMode.PercentOutput, 0.0);
		}
	}
	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub

	}

}
