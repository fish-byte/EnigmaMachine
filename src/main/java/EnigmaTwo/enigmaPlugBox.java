package EnigmaTwo;

import java.util.HashMap;

public abstract class enigmaPlugBox
{
    private static Integer plugAmt;

    private static String plug;

    protected static final HashMap<String,String> plugMap = new HashMap<>();

    public static void setPlugAmt(Integer plugs)
    {
        plugAmt = plugs;
    }

    public static Integer getPlugAmt()
    {
        return plugAmt;
    }

    protected static void setPlug(String plugIn)
    {
        plug = plugIn;
    }

    protected static String getPlug()
    {
        return plug;
    }

    protected static void setPlugs(String plug1, String plug2)
    {
        plugMap.put(plug1,plug2);
        plugMap.put(plug2,plug1);
    }

    protected static HashMap<String,String> getPlugs()
    {
        return plugMap;
    }

    public static String getPlugLetter(String a)
    {
        return getPlugs().getOrDefault(a, a);
    }


}
