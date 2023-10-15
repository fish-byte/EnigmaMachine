package EnigmaThree;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

public class EnigmaPlugBox
{
    private Integer plugAmt;

    private String plug;

    private static final HashMap<String,String> plugMap = new HashMap<>();
    private String ErrorMessage;

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

    public static HashMap<String,String> getPlugs()
    {
        return plugMap;
    }

    public static String getPlugLetter(String a)
    {
        return getPlugs().getOrDefault(a, a);
    }

    public void setErrorMessage(String ErrorMessage)
    {
        this.ErrorMessage = ErrorMessage;
    }

    public String getErrorMessage()
    {
        return ErrorMessage;
    }

    public Integer getInInt()
    {
        Integer options = 0;
        try
        {
            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
            options = Integer.valueOf(input.readLine());
        }
        catch (Exception e)
        {
            System.out.println("Error: you didn't enter a valid option");
        }
        return options;
    }

    public String getInString()
    {
        String input = "Error";

        try
        {
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            input = in.readLine().toUpperCase();

            if (!input.matches("^[A-Z]$"))
            {
                input = "Error";
            }
        }

        catch (Exception e)
        {
            System.out.println("Error: you didn't enter a valid option");
        }
        return input;
    }


    public void plugAmt(Integer plugAmt, int i)
    {
        if (i > 20)
        {
            System.out.println("You have entered too many wrong choices program will exit!!");
            setErrorMessage("Plug amount was entered wrong too many times");
        }

        else if (plugAmt > 13)
        {
            System.out.println("You can only have 13 cables: ");
            setErrorMessage("You can only have 13 cables");
            plugAmt(getInInt(), i+1);
        }

        else
        {
            setPlugAmt(plugAmt);
        }
    }

    public String plug1(String plug, int i)
    {
        if (i > 20)
        {
            System.out.println("You have entered too many wrong choices program will exit!!");
            setErrorMessage("Too many tries to enter the plug letter");
        }

        else if (plug.contains("Error"))
        {
            System.out.println("The character entered was not a letter or you didn't enter one letter only");
            System.out.println("Please re-enter letter: ");
            return plug1(getInString(), i+1);
        }

        else if (getPlugs().containsValue(plug))
        {
            System.out.println("Plug already in port: " + plug);
            System.out.println("Please re-enter letter: ");
            return plug1(getInString(), i+1);
        }

        setPlug(plug);
        return plug;
    }

    public String plug2(String plug, int i)
    {
        if (i > 20)
        {
            System.out.println("You have entered too many wrong choices program will exit!!");
            setErrorMessage("Too many tries to enter the plug letter");
        }

        else if (plug.equals("Error"))
        {
            System.out.println("The character entered was not a letter or you didn't enter one letter only");
            System.out.println("Please re-enter letter: ");
            return plug2(getInString(), i+1);
        }

        else if (getPlugs().containsValue(plug) || getPlug().equals(plug))
        {
            System.out.println("Plug already in port: " + plug);
            System.out.println("Please re-enter letter: ");
            return plug2(getInString(), i+1);
        }

        setPlug(plug);
        return plug;
    }

    public void plugInput()
    {
        for (int i = 0; i < getPlugAmt(); i++)
        {
            System.out.println("Please enter Port 1 Cable" + "(" + (i + 1) + ")" + " :");
            String plug1 = plug1(getInString(), 1);

            System.out.println("Please enter Port 2 Cable" + "(" + (i + 1) + ")" + " :");
            String plug2 = plug2(getInString(), 1);

            setPlugs(plug1, plug2);
        }
    }
}
