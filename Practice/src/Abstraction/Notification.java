package Abstraction;

public abstract class Notification {
    String recipient;
    String message;

    Notification(String recipient, String message){
        this.recipient = recipient;
        this.message = message;
    }

    abstract void sendNotification();

    @Override
    public String toString(){
        String display = String.format("To: %s | Message: %s%n", recipient, message);
        return display;
    }

    public static void main (String [] args){
        EmailNotification email = new EmailNotification("My Baby, Onycah", "I love you huhuhu", "ILY BBGIRL");
        SMSNotification sms = new SMSNotification("My Baby, Onycah", "I miss youuu", 256);


        System.out.println(email);
        System.out.println(sms);
        email.sendNotification();
        sms.sendNotification();
    }
}

class EmailNotification extends Notification{
    String subject;

    EmailNotification(String recipient, String message, String subject){
        super(recipient, message);
        this.subject = subject;
    }

    void sendNotification(){
        System.out.printf("""
                Subject: %s
                To: %s
                Dear, %s
                %s%n
                """, subject, recipient, recipient, message);
    }
}

class SMSNotification extends Notification{
    int characterLimit;

    SMSNotification(String recipient, String message, int characterLimit){
        super(recipient, message);
        this.characterLimit = characterLimit;
    }

    void sendNotification(){
        System.out.printf("""
                To: %s
                %s
                Character Limit: %d%n
                   """,recipient, message, characterLimit);
    }
}
