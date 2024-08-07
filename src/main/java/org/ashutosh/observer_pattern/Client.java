package org.ashutosh.observer_pattern;

import org.ashutosh.observer_pattern.observables.IPhoneObservable;
import org.ashutosh.observer_pattern.observables.LaptopObservable;
import org.ashutosh.observer_pattern.observables.StockObservable;
import org.ashutosh.observer_pattern.observers.EmailNotificationObserver;

public class Client {
    public static void main(String[] args) {
        StockObservable stockObservable = new IPhoneObservable();
        stockObservable.add(new EmailNotificationObserver("ashutosh@gmail.com", "Ashutosh"));
        stockObservable.setStockCount(5);
        stockObservable = new LaptopObservable();
        stockObservable.add(new EmailNotificationObserver("ashutosh@gmail.com", "Ashutosh"));
        stockObservable.setStockCount(90);
    }
}
