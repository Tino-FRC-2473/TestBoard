/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.Servo;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.InstantCommand;
import frc.robot.Robot;
import frc.robot.subsystems.ServoSubsystem;

public class RunServo extends InstantCommand {

  private double targetPosition;

  public RunServo(double position) {
    requires(Robot.servoSubsystem);
    targetPosition = position;
    // Use requires() here to declare subsystem dependencies
    // eg. requires(chassis);
  }

  protected void initialize() {
    Robot.servoSubsystem.setServoPosition(targetPosition);
  }
  
  protected void execute() {
    
  }

  protected boolean isFinished() {
    return false;
  }

  protected void end() {
  }

  protected void interrupted() {
  }
}
