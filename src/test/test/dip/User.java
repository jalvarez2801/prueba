package test.test.dip;

public class User {
	private NotificationService notificationService;

	public User(NotificationService notificationService) {
		this.notificationService = notificationService;
	}

	public void sendNotification(String message) {
		notificationService.notify(message);
	}
}
