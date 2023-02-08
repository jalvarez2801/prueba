package test.test.med;

public class Main {
	public static void main(String[] args) {
		Mediator mediator = new ConcreteMediator();
		Colleague colleague1 = new ConcreteColleague1(mediator);
		Colleague colleague2 = new ConcreteColleague2(mediator);

		colleague1.send("Hello, colleague 2");
		colleague2.send("Hi, colleague 1");
	}
}