package test.test.dip;

public class EmailNotificationService implements NotificationService {
	@Override
	public void notify(String message) {
		System.out.println("Sending email: " + message);
	}
}