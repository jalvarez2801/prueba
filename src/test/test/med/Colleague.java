package test.test.med;

public abstract class Colleague {
	private Mediator mediator;

	Colleague(Mediator mediator) {
		this.mediator = mediator;
		mediator.register(this);
	}

	void send(String message) {
		mediator.send(message, this);
	}

	abstract void receive(String message);
}