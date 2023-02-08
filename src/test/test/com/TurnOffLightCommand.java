package test.test.com;

public class TurnOffLightCommand implements Command {
	private Light light;

	TurnOffLightCommand(Light light) {
		this.light = light;
	}

	@Override
	public void execute() {
		light.turnOff();
	}
}