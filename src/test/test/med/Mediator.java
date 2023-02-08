package test.test.med;

public interface Mediator {
	void register(Colleague colleague);

	void send(String message, Colleague sender);
}
