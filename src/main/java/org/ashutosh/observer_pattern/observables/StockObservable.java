package org.ashutosh.observer_pattern.observables;

import org.ashutosh.observer_pattern.observers.NotificationObserver;

public interface StockObservable {
    void add(NotificationObserver notificationObserver);
    void remove(NotificationObserver notificationObserver);
    void notifySubscribers();
    void setStockCount(int newStockCount);

}
