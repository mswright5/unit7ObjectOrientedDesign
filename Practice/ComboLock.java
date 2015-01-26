
/**
 * Simulates a combo lock
 * 
 * @author Matt Wright & Joe Deahr 
 * @version January 26, 2015
 */
public class ComboLock
{
    private int first, second, third, turns;
    private boolean stateFirst, stateSecond, stateThird;

    public ComboLock( int secret1, int secret2, int secret3 ) {
        first = secret1;
        second = secret2;
        third = secret3;
        stateFirst = false;
        stateSecond = false;
        stateThird = false;
    }

    public void reset() {
        stateFirst = false;
        stateSecond = false; 
        stateThird = false;
    }

    public void turnLeft( int ticks ) {
        //If the first secret was entered correctly, and the ticks are equal to the second secret, set the second number to true, else, restart because you messed up
        if(stateFirst && ticks == second && !stateSecond){stateSecond = true;}        
        else{reset();}
    }

    public void turnRight( int ticks ) {
        if(ticks == first){stateFirst = true;}

        else if(ticks == third && stateSecond && !stateThird){stateThird = true; }

        else{reset();}
    }

    public boolean open() {
        if(stateFirst && stateSecond && stateThird){return true;}

        return false;
    }
}
