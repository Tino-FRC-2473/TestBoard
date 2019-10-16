/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import com.revrobotics.CANPIDController;
import com.revrobotics.ControlType;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

/**
 * An example command.  You can replace me with your own command.
 */
public class RunSparkPID extends Command {

    double target;

    public RunSparkPID(double target) {
		super ("Run Spark PID");
		// Use requires() here to declare subsystem dependencies
		requires(Robot.sparkSubsystem);

		this.target = target;
	}

	// Called just before this Command runs the first time
	@Override
	protected void initialize() {
		System.out.println("Running Spark PID command with target " + target);
		Robot.sparkSubsystem.getPIDController().setReference(target, ControlType.kPosition);
	}

	// Called repeatedly when this Command is scheduled to run
	@Override
	protected void execute() {
		//Robot.sparkSubsystem.printEncoderInfo();
	}

	// Make this return true when this Command no longer needs to run execute()
	@Override
	protected boolean isFinished() {
		return false;
	}

	// Called once after isFinished returns true
	@Override
	protected void end() {
		
	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	@Override
	protected void interrupted() {
		// Robot.sparkSubsystem.stopMotor();
	}
}
