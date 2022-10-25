package factoryDesignPattern;

public class Email implements NotificationService{
    @Override
    public void notifyUser() {
        System.out.println("Notifying via email");
    }
}
