package EnigmaOneTest;

import java.io.IOException;

import static EnigmaOne.enigmaUserInput.*;

public class SpindleChoiceTest
{
    public static void main(String[] args) throws IOException
    {
        System.out.println("Please choose 3 spindles between 1 - 5");

        System.out.println("Please enter first spindle: ");
        setRotatorOne();

        System.out.println("Please enter second spindle: ");
        setRotatorTwo();

        System.out.println("Please enter third spindle: ");
        setRotatorThree();
    }
}
