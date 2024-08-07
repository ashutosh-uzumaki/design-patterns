package org.ashutosh.observer_pattern.observers;

public class EmailNotificationObserver implements NotificationObserver{
    String email;
    String name;

    public EmailNotificationObserver(String email, String name){
        this.email = email;
        this.name = name;
    }
    @Override
    public void update(){
        sendEmail(email);
    }

    public void sendEmail(String email){
        System.out.println("Email sent to "+email);
    }
}
