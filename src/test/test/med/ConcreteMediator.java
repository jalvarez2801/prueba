package test.test.med;

import java.util.ArrayList;
import java.util.List;

public class ConcreteMediator implements Mediator {
	private List<Colleague> colleagues = new ArrayList<>();

	@Override
	public void register(Colleague colleague) {
		colleagues.add(colleague);
	}

	@Override
	public void send(String message, Colleague sender) {
		for (Colleague colleague : colleagues) {
			if (!colleague.equals(sender)) {
				colleague.receive(message);
			}
		}
	}
}