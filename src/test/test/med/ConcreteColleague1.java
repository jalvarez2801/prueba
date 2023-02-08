package test.test.med;

public class ConcreteColleague1 extends Colleague {
	ConcreteColleague1(Mediator mediator) {
		super(mediator);
	}

	@Override
	void receive(String message) {
		System.out.println("Colleague 1 received: " + message);
	}
}