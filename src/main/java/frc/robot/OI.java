/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {

	Joystick wheel;
	Joystick buttonPanel;

	JoystickButton position1;
	JoystickButton position2;
	JoystickButton position3;
	JoystickButton position4;
	
	

	public OI() {
		wheel = new Joystick(0);
		buttonPanel = new Joystick(3);

		position1 = new JoystickButton(buttonPanel, 2);
		position2 = new JoystickButton(buttonPanel, 4);
		position3 = new JoystickButton(buttonPanel, 6);
		position4 = new JoystickButton(buttonPanel, 8);
	}

	public Joystick getWheel() {
		return wheel;
	}

	public JoystickButton getPosition1Button() {
		return position1;
	}

	public JoystickButton getPosition2Button() {
		return position2;
	}

	public JoystickButton getPosition3Button() {
		return position3;
	}

	public JoystickButton getPosition4Button() {
		return position4;
	}
}
