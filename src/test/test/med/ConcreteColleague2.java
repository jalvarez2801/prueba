package test.test.med;

public class ConcreteColleague2 extends Colleague {
	ConcreteColleague2(Mediator mediator) {
		super(mediator);
	}

	@Override
	void receive(String message) {
		System.out.println("Colleague 2 received: " + message);
	}
}