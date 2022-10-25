package factoryDesignPattern;

public class NotificationFactory
{
    public static NotificationService getNotificationService(String type)
    {
        if(type.equalsIgnoreCase("email"))
            return new Email();
        else if(type.equalsIgnoreCase("sms"))
            return new SMS();
        else return null;
    }
}
