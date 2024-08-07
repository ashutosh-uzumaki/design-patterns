package org.ashutosh.observer_pattern.observables;

import org.ashutosh.observer_pattern.observers.NotificationObserver;

import java.util.ArrayList;
import java.util.List;

public class LaptopObservable implements StockObservable{
    List<NotificationObserver> notificationObserverList = new ArrayList<>();
    public int stockCount = 0;
    @Override
    public void add(NotificationObserver notificationObserver) {
        notificationObserverList.add(notificationObserver);
    }

    @Override
    public void remove(NotificationObserver notificationObserver) {
        notificationObserverList.remove(notificationObserver);
    }

    @Override
    public void notifySubscribers() {
        for(NotificationObserver notificationObserver: notificationObserverList){
            System.out.println("Inside Laptop");
            notificationObserver.update();
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
