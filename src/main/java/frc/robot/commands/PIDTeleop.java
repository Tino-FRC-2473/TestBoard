/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.shuffleboard.Shuffleboard;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import frc.robot.Robot;

/**
 * An example command.  You can replace me with your own command.
 */
public class PIDTeleop extends Command {

	public PIDTeleop() {
		super ("PID Teleop");
		// Use requires() here to declare subsystem dependencies
		// requires(Robot.sparkSubsystem);
	}

	// Called just before this Command runs the first time
	@Override
	protected void initialize() {
		Shuffleboard.startRecording();

		Robot.oi.getPosition1Button().whenReleased(new RunSparkPID(-2));
		Robot.oi.getPosition2Button().whenReleased(new RunSparkPID(2));
		Robot.oi.getPosition3Button().whenReleased(new RunSparkPID(-4));
		Robot.oi.getPosition4Button().whenReleased(new RunSparkPID(4));
	}

	// Called repeatedly when this Command is scheduled to run
	@Override
	protected void execute() {
		//Robot.sparkSubsystem.printEncoderInfo();
		SmartDashboard.putNumber("Motor Encoder Position", Robot.sparkSubsystem.getEncoderTicks());
	}

	// Make this return true when this Command no longer needs to run execute()
	@Override
	protected boolean isFinished() {
		return false;
	}

	// Called once after isFinished returns true
	@Override
	protected void end() {
		Shuffleboard.stopRecording();
		// Robot.sparkSubsystem.stopMotor();
	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	@Override
	protected void interrupted() {
		Shuffleboard.stopRecording();
		// Robot.sparkSubsystem.stopMotor();
	}
}
