package EnigmaOne;

import java.util.HashMap;

public abstract class enigmaRotator
{
    static HashMap<String, Integer> inputWl = new HashMap<>();
    static HashMap<Integer, Integer> Spindle1 = new HashMap<>();
    static HashMap<Integer,Integer> Spindle2 = new HashMap<>();
    static HashMap<Integer,Integer> Spindle3 = new HashMap<>();
    static HashMap<Integer,Integer> Spindle4 = new HashMap<>();
    static HashMap<Integer,Integer> Spindle5 = new HashMap<>();
    static HashMap<Integer, Integer> Reflector = new HashMap<>();

    public static HashMap<String, Integer> getInputWheel()
    {
        inputWl.put("A",1);
        inputWl.put("B",2);
        inputWl.put("C",3);
        inputWl.put("D",4);
        inputWl.put("E",5);
        inputWl.put("F",6);
        inputWl.put("G",7);
        inputWl.put("H",8);
        inputWl.put("I",9);
        inputWl.put("J",10);
        inputWl.put("K",11);
        inputWl.put("L",12);
        inputWl.put("M",13);
        inputWl.put("N",14);
        inputWl.put("O",15);
        inputWl.put("P",16);
        inputWl.put("Q",17);
        inputWl.put("R",18);
        inputWl.put("S",19);
        inputWl.put("T",20);
        inputWl.put("U",21);
        inputWl.put("V",22);
        inputWl.put("W",23);
        inputWl.put("X",24);
        inputWl.put("Y",25);
        inputWl.put("Z",26);
        return inputWl;
    }

    public static HashMap<Integer, Integer> getSpindleOne()
    {
        Spindle1.put(1, 21);
        Spindle1.put(2, 24);
        Spindle1.put(3, 11);
        Spindle1.put(4, 8);
        Spindle1.put(5, 20);
        Spindle1.put(6, 12);
        Spindle1.put(7, 6);
        Spindle1.put(8, 14);
        Spindle1.put(9, 3);
        Spindle1.put(10, 19);
        Spindle1.put(11, 18);
        Spindle1.put(12, 17);
        Spindle1.put(13, 23);
        Spindle1.put(14, 9);
        Spindle1.put(15, 25);
        Spindle1.put(16, 15);
        Spindle1.put(17, 16);
        Spindle1.put(18, 7);
        Spindle1.put(19, 2);
        Spindle1.put(20, 22);
        Spindle1.put(21, 13);
        Spindle1.put(22, 1);
        Spindle1.put(23, 10);
        Spindle1.put(24, 26);
        Spindle1.put(25, 4);
        Spindle1.put(26, 5);
        return Spindle1;
    }


    public static HashMap<Integer,Integer> spindleTwo()
    {
        Spindle2.put(1, 20);
        Spindle2.put(2, 5);
        Spindle2.put(3, 16);
        Spindle2.put(4, 1);
        Spindle2.put(5, 22);
        Spindle2.put(6, 9);
        Spindle2.put(7, 2);
        Spindle2.put(8, 4);
        Spindle2.put(9, 21);
        Spindle2.put(10, 26);
        Spindle2.put(11, 17);
        Spindle2.put(12, 23);
        Spindle2.put(13, 15);
        Spindle2.put(14, 19);
        Spindle2.put(15, 13);
        Spindle2.put(16, 11);
        Spindle2.put(17, 24);
        Spindle2.put(18, 8);
        Spindle2.put(19, 12);
        Spindle2.put(20, 6);
        Spindle2.put(21, 25);
        Spindle2.put(22, 7);
        Spindle2.put(23, 10);
        Spindle2.put(24, 3);
        Spindle2.put(25, 14);
        Spindle2.put(26, 18);

        return Spindle2;

    }

    public static HashMap<Integer,Integer> spindleThree()
    {
        Spindle3.put(1, 6);
        Spindle3.put(2, 14);
        Spindle3.put(3, 2);
        Spindle3.put(4, 10);
        Spindle3.put(5, 26);
        Spindle3.put(6, 4);
        Spindle3.put(7, 23);
        Spindle3.put(8, 15);
        Spindle3.put(9, 20);
        Spindle3.put(10, 7);
        Spindle3.put(11, 3);
        Spindle3.put(12, 5);
        Spindle3.put(13, 17);
        Spindle3.put(14, 22);
        Spindle3.put(15, 11);
        Spindle3.put(16, 21);
        Spindle3.put(17, 16);
        Spindle3.put(18, 19);
        Spindle3.put(19, 24);
        Spindle3.put(20, 13);
        Spindle3.put(21, 18);
        Spindle3.put(22, 1);
        Spindle3.put(23, 25);
        Spindle3.put(24, 8);
        Spindle3.put(25, 9);
        Spindle3.put(26, 12);

        return Spindle3;
    }

    public static HashMap<Integer,Integer> spindleFour()
    {
        Spindle4.put(1, 19);
        Spindle4.put(2, 26);
        Spindle4.put(3, 12);
        Spindle4.put(4, 25);
        Spindle4.put(5, 11);
        Spindle4.put(6, 20);
        Spindle4.put(7, 9);
        Spindle4.put(8, 8);
        Spindle4.put(9, 3);
        Spindle4.put(10, 10);
        Spindle4.put(11, 1);
        Spindle4.put(12, 16);
        Spindle4.put(13, 13);
        Spindle4.put(14, 23);
        Spindle4.put(15, 2);
        Spindle4.put(16, 14);
        Spindle4.put(17, 7);
        Spindle4.put(18, 4);
        Spindle4.put(19, 15);
        Spindle4.put(20, 18);
        Spindle4.put(21, 6);
        Spindle4.put(22, 17);
        Spindle4.put(23, 5);
        Spindle4.put(24, 24);
        Spindle4.put(25, 21);
        Spindle4.put(26, 22);

        return Spindle4;
    }

    public static HashMap<Integer,Integer> spindleFive()
    {
        Spindle5.put(1, 5);
        Spindle5.put(2, 10);
        Spindle5.put(3, 7);
        Spindle5.put(4, 20);
        Spindle5.put(5, 24);
        Spindle5.put(6, 2);
        Spindle5.put(7, 4);
        Spindle5.put(8, 18);
        Spindle5.put(9, 6);
        Spindle5.put(10, 23);
        Spindle5.put(11, 12);
        Spindle5.put(12, 26);
        Spindle5.put(13, 11);
        Spindle5.put(14, 8);
        Spindle5.put(15, 14);
        Spindle5.put(16, 19);
        Spindle5.put(17, 9);
        Spindle5.put(18, 1);
        Spindle5.put(19, 17);
        Spindle5.put(20, 15);
        Spindle5.put(21, 21);
        Spindle5.put(22, 13);
        Spindle5.put(23, 25);
        Spindle5.put(24, 16);
        Spindle5.put(25, 22);
        Spindle5.put(26, 3);

        return Spindle5;
    }


    public static HashMap<Integer, Integer> getReflector()
    {
        Reflector.put(1,26);
        Reflector.put(2,25);
        Reflector.put(3,24);
        Reflector.put(4,23);
        Reflector.put(5,22);
        Reflector.put(6,21);
        Reflector.put(7,20);
        Reflector.put(8,19);
        Reflector.put(9,18);
        Reflector.put(10,17);
        Reflector.put(11,16);
        Reflector.put(12,15);
        Reflector.put(13,14);
        Reflector.put(14,13);
        Reflector.put(15,12);
        Reflector.put(16,11);
        Reflector.put(17,10);
        Reflector.put(18,9);
        Reflector.put(19,8);
        Reflector.put(20,7);
        Reflector.put(21,6);
        Reflector.put(22,5);
        Reflector.put(23,4);
        Reflector.put(24,3);
        Reflector.put(25,2);
        Reflector.put(26,1);

        return Reflector;
    }

}
