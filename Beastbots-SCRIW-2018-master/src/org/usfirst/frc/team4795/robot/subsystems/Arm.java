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
	
	public void Lift(double upvalue) {
		arm1.set(ControlMode.PercentOutput, upvalue);
	}
	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub

	}

}
