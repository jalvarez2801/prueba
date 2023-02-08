package test.test.dip;

public class Main {
	public static void main(String[] args) {
		User user = new User(new EmailNotificationService());
		user.sendNotification("Hello, World!");

		user = new User(new SmsNotificationService());
		user.sendNotification("Hello, World!");
	}
}