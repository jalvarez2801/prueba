package test.test.dip;

public class SmsNotificationService implements NotificationService {
	@Override
	public void notify(String message) {
		System.out.println("Sending SMS: " + message);
	}
}