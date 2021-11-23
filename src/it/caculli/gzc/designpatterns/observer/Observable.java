package it.caculli.gzc.designpatterns.observer;

public interface Observable
{
    void notifySubscribers();
    boolean addSubscriber( Observer o );
    boolean removeSubscriber( Observer o );
}
