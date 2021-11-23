package it.caculli.gzc.designpatterns.observer;

public class ExecObserver
{
    public ExecObserver()
    {
        System.out.println( "Calling " + getClass().getName() );

        Subscriber[] subscribers = {
                new Subscriber( "Giorgio" ),
                new Subscriber( "Guillaume" ),
                new Subscriber( "Tanguy" )
        };

        ContentCreator palermo = new ContentCreator( "Palermo", true );

        for( Subscriber subscriber : subscribers )
        {
            palermo.addSubscriber( subscriber );
        }

        palermo.notifySubscribers();

        for( Subscriber subscriber : subscribers )
        {
            subscriber.watchVideoFrom( palermo );
        }

        palermo.removeSubscriber( subscribers[ 1 ] );

        palermo.notifySubscribers();

        for( Subscriber subscriber : subscribers )
        {
            subscriber.watchVideoFrom( palermo );
        }
    }
}
