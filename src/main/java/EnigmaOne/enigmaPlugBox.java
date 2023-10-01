package EnigmaOne;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class enigmaPlugBox
{
    static HashMap<String,String> plugMap = new HashMap<>();

    public static void plugChoice() throws IOException
    {
        BufferedReader plugIn = new BufferedReader(new InputStreamReader(System.in));
        Integer numOfPlugs = Integer.valueOf(plugIn.readLine());

        if (numOfPlugs <= 13)
        {
            {
                for (int i = 0; i < numOfPlugs; i++)
                {
                    System.out.println("Please enter Port 1 " + "(" + (i + 1) + ")" + " :");
                    String plug1 = plugIn.readLine().toUpperCase();

                    while (plugMap.containsKey(plug1))
                    {
                        System.out.println("The port " + plug1 + " is already in use");
                        System.out.println("Please enter Port 1 " + "(" + (i + 1) + ")" + " :");
                        plug1 = plugIn.readLine().toUpperCase();
                    }

                    System.out.println("Please enter Port 2 " + "(" + (i + 1) + ")" + " :");
                    String plug2 = plugIn.readLine().toUpperCase();

                    while (plugMap.containsKey(plug2) || plug2.equals(plug1))
                    {
                        System.out.println("The port " + plug2 + " is already in use");
                        System.out.println("Please enter Port 1 " + "(" + (i + 1) + ")" + " :");
                        plug2 = plugIn.readLine().toUpperCase();
                    }

                    setPlug(plug1, plug2);
                }
            }
        }

        else
        {
            System.out.println("You can only have 13 plugs");
            System.out.println("Please enter the amount of cables:");
            plugChoice();
        }
    }

    public static void setPlug(String plug1, String plug2)
    {
        plugMap.put(plug1,plug2);
        plugMap.put(plug2,plug1);
    }

    public static HashMap<String,String> getPlugs()
    {
        return plugMap;
    }



}
