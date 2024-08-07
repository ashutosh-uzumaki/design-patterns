package org.ashutosh.observer_pattern.observables;

import org.ashutosh.observer_pattern.observers.NotificationObserver;

import java.util.ArrayList;
import java.util.List;

public class IPhoneObservable implements StockObservable{
    List<NotificationObserver> notificationObserversList = new ArrayList<>();
    public int stockCount = 0;
    @Override
    public void add(NotificationObserver notificationObserver) {
        notificationObserversList.add(notificationObserver);
    }

    @Override
    public void remove(NotificationObserver notificationObserver) {
        notificationObserversList.remove(notificationObserver);
    }

    @Override
    public void notifySubscribers() {
        for(NotificationObserver notificationObservers: notificationObserversList){
            System.out.println("Iphone observable");
            notificationObservers.update();
        }
    }

    @Override
    public void setStockCount(int newStockCount) {
        if(stockCount == 0 && newStockCount > 0){
            notifySubscribers();
        }
        stockCount += newStockCount;
    }
}
