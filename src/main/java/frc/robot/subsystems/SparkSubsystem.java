/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.revrobotics.CANEncoder;
import com.revrobotics.CANPIDController;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;

/**
 * An example subsystem.  You can replace me with your own Subsystem.
 */
public class SparkSubsystem extends Subsystem {
	// Put methods for controlling this subsystem
	// here. Call these from Commands.

	CANSparkMax sparkMax;
	CANEncoder encoder;
	CANPIDController pidController;


	public SparkSubsystem(double P, double I, double D, double IZone) {
		sparkMax = new CANSparkMax(RobotMap.SPMAX, MotorType.kBrushless);
		encoder = sparkMax.getEncoder();
		pidController = sparkMax.getPIDController();
		
		pidController.setP(P);
		pidController.setI(I);
		pidController.setD(D);
		pidController.setIZone(IZone);
	}

	public void runMotor(double power) {
		sparkMax.set(power);
	}

	public void stopMotor() {
		sparkMax.set(0);
	}

	public void resetEncoder() {
		// reset encoder, currently don't know how
	}

	public double getEncoderTicks() {
		return encoder.getPosition();
	}
	
	public CANPIDController getPIDController() {
		return sparkMax.getPIDController();
	}

	public void printEncoderInfo() {
		System.out.println(String.format("Position: %8.3f   |   Velocity: %8.3f", encoder.getPosition(), encoder.getVelocity()));
	}

	@Override
	public void initDefaultCommand() {
		// Set the default command for a subsystem here.
		// setDefaultCommand(new MySpecialCommand());
	}
}
