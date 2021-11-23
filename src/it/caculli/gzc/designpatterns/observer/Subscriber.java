package it.caculli.gzc.designpatterns.observer;

import java.util.Objects;

public class Subscriber implements Observer
{
    private String nickname;

    public Subscriber( String nickname )
    {
        this.nickname = nickname;
    }

    @Override
    public void update( Observable o )
    {
        System.out.println( nickname + "! There is new content from " + o );
    }

    public void watchVideoFrom( ContentCreator contentCreator )
    {
        if( contentCreator.watchVideoFrom( this ) )
        {
            System.out.println( nickname + " is watching a video from " + contentCreator );
            return;
        }
        System.out.println( contentCreator + "'s account is private" );
    }

    public String getNickname()
    {
        return nickname;
    }

    public void setNickname( String nickname )
    {
        this.nickname = nickname;
    }

    @Override
    public String toString()
    {
        return nickname;
    }

    @Override
    public boolean equals( Object o )
    {
        if ( this == o ) return true;
        if ( o == null || getClass() != o.getClass() ) return false;
        Subscriber that = ( Subscriber ) o;
        return Objects.equals( nickname, that.nickname );
    }

    @Override
    public int hashCode()
    {
        return Objects.hash( nickname );
    }
}
