package com.evan.designpattern.observer.api;

/**
 * @Author: Evan on 1/22/2016  19:06.
 * Email: evan.wan@ndpmedia.com
 */
public interface Subject {

    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers();

}
