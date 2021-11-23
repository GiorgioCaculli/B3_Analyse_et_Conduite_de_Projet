package it.caculli.gzc.designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class ContentCreator implements Observable
{
    private String nickname;
    private boolean privateAccount;
    private List< Observer > subscribers;

    public ContentCreator( String nickname, boolean privateAccount )
    {
        this.nickname = nickname;
        this.privateAccount = privateAccount;
        subscribers = new ArrayList<>();
    }

    @Override
    public void notifySubscribers()
    {
        for( Observer subscriber : subscribers )
        {
            System.out.println( "Notifying subscriber: " + subscriber );
            subscriber.update( this );
        }
    }

    @Override
    public boolean addSubscriber( Observer o )
    {
        if( o instanceof Subscriber )
        {
            if( subscribers.contains( o ) )
            {
                return false;
            }
            return subscribers.add( o );
        }
        return false;
    }

    @Override
    public boolean removeSubscriber( Observer o )
    {
        if( o instanceof Subscriber )
        {
            return subscribers.remove( o );
        }
        return false;
    }

    public boolean watchVideoFrom( Subscriber subscriber )
    {
        if( privateAccount )
        {
            if( subscribers.contains( subscriber ) )
            {
                return true;
            }
            return false;
        }
        return true;
    }

    public String getNickname()
    {
        return nickname;
    }

    public void setNickname( String nickname )
    {
        this.nickname = nickname;
    }

    public boolean isAccountPrivate()
    {
        return privateAccount;
    }

    public void makePrivate()
    {
        this.privateAccount = true;
    }

    public void makeNotPrivate()
    {
        this.privateAccount = false;
    }

    @Override
    public String toString()
    {
        return nickname;
    }
}
