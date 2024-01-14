package frc.robot;

import edu.wpi.first.wpilibj.PS4Controller;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.GenericHID.RumbleType;

public class ControllerRumble {
	private PS4Controller controller;

	public ControllerRumble(PS4Controller controller) {
		this.controller = controller;
	}

	public void rumble(int duration) {
		Timer timer = new Timer();
		timer.restart();
		while (!timer.hasElapsed(duration)) {
			controller.setRumble(RumbleType.kLeftRumble, 1.0);
			controller.setRumble(RumbleType.kRightRumble, 1.0);
		}
		timer.stop();
		controller.setRumble(RumbleType.kLeftRumble, 0.0);
			controller.setRumble(RumbleType.kRightRumble, 0.0);
	}

}