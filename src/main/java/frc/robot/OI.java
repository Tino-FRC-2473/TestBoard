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

	JoystickButton panelButton2;
	JoystickButton panelButton4;
	JoystickButton panelButton6;
	JoystickButton panelButton8;

	JoystickButton wheelButton1;
	JoystickButton wheelButton2;
	JoystickButton wheelButton3;
	JoystickButton wheelButton4;
	
	

	public OI() {
		wheel = new Joystick(0);
		buttonPanel = new Joystick(3);

		panelButton2 = new JoystickButton(buttonPanel, 2);
		panelButton4 = new JoystickButton(buttonPanel, 4);
		panelButton6 = new JoystickButton(buttonPanel, 6);
		panelButton8 = new JoystickButton(buttonPanel, 8);

		wheelButton1 = new JoystickButton(wheel, 1);
		wheelButton2 = new JoystickButton(wheel, 2);
		wheelButton3 = new JoystickButton(wheel, 3);
		wheelButton4 = new JoystickButton(wheel, 4);
	}

	public Joystick getWheel() {
		return wheel;
	}

	public JoystickButton getPanelButton2() {
		return panelButton2;
	}

	public JoystickButton getPanelButton4() {
		return panelButton4;
	}

	public JoystickButton getPanelButton6() {
		return panelButton6;
	}

	public JoystickButton getPanelButton8() {
		return panelButton8;
	}

	public JoystickButton getWheelButton1() {
		return wheelButton1;
	}

	public JoystickButton getWheelButton2() {
		return wheelButton2;
	}

	public JoystickButton getWheelButton3() {
		return wheelButton3;
	}

	public JoystickButton getWheelButton4() {
		return wheelButton4;
	}
}
