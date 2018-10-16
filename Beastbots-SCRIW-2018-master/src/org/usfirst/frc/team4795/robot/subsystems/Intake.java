package org.usfirst.frc.team4795.robot.subsystems;

import org.usfirst.frc.team4795.robot.RobotMap;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Intake extends Subsystem {

	private Spark left;
	private VictorSP right;
	private Talon shootLeft;
	private Talon shootRight;
	private double speed;
	
	public Intake() {
		left = new Spark(RobotMap.LEFT_MOTOR.value);
		right = new VictorSP(RobotMap.RIGHT_MOTOR.value);
		shootLeft = new Talon(RobotMap.SHOOT_LEFT.value);
		shootRight = new Talon(RobotMap.SHOOT_RIGHT.value);
		speed = 1.00;
	}
	
	public void rev() {
		shootLeft.set(-speed);
		shootRight.set(speed);
	}
	
	public void shoot() {
		left.set(-speed);
		right.set(speed);
		shootLeft.set(-speed);
		shootRight.set(speed);
	}
	
	public void intake() {
		left.set(.6 * speed);
		right.set(.6 * -speed);
		shootLeft.set(.8 * speed);
		shootRight.set(.8 * -speed);
	}
	
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub

	}

}
