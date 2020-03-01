import com.sun.org.apache.bcel.internal.generic.SWITCH;

public class AutoFactory {
    public static IAuto getCar(String carName)
    {
        if (carName.equalsIgnoreCase("BMW"))
                return new BMW335Xi();
        else if(carName.equalsIgnoreCase("Mini"))
                return new MiniCooper();
        return null;
    }
}
