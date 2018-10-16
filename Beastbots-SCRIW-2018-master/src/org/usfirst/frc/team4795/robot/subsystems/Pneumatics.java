package org.usfirst.frc.team4795.robot.subsystems;

import org.usfirst.frc.team4795.robot.RobotMap;
import org.usfirst.frc.team4795.robot.commands.GearShift;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Pneumatics extends Subsystem {

	private DoubleSolenoid gearShifter;
	private Compressor charles;

	public Pneumatics() {
		gearShifter = new DoubleSolenoid(RobotMap.VALVE_ONE.value, RobotMap.VALVE_TWO.value);
		gearShifter.set(DoubleSolenoid.Value.kForward);
		charles = new Compressor();
	}

	public void whoosh(boolean bool, boolean boolbool) {
		if (bool) {
			gearShifter.set(DoubleSolenoid.Value.kForward);
		}
		if (boolbool) {
			gearShifter.set(DoubleSolenoid.Value.kReverse);
		}
	}

	@Override
	protected void initDefaultCommand() {
		setDefaultCommand(new GearShift());
	}

}
