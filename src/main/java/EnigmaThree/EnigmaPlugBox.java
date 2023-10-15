package EnigmaThree;

import java.util.HashMap;

public class EnigmaPlugBox
{
    private Integer plugAmt;

    private String plug;

    private HashMap<String,String> plugMap = new HashMap<>();

    public void setPlugAmt(Integer plugAmt)
    {
        this.plugAmt = plugAmt;
    }

    public Integer getPlugAmt()
    {
        return plugAmt;
    }

    public void setPlug(String plug)
    {
        this.plug = plug;
    }

    public String getPlug()
    {
        return plug;
    }

    public void setPlugs(String plug1, String plug2)
    {
        plugMap.put(plug1,plug2);
        plugMap.put(plug2,plug1);
    }

    public HashMap<String,String> getPlugs()
    {
        return plugMap;
    }

    public String getPlugLetter(String a)
    {
        return getPlugs().getOrDefault(a, a);
    }


}
