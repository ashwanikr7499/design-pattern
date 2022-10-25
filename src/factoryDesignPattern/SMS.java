package factoryDesignPattern;

public class SMS implements NotificationService {
    @Override
    public void notifyUser() {
        System.out.println("Notifying via SMS!");
    }
}
