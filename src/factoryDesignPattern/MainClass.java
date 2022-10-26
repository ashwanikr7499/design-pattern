package factoryDesignPattern;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter type of notification");
        String type=sc.nextLine();
        NotificationService notificationService=NotificationFactory.getNotificationService(type);
        assert notificationService != null;
        notificationService.notifyUser();
    }
}
