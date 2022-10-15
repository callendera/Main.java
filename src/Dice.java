import java.util.Random;
public class Dice
{
    private final static Random random = new Random();
    public Dice() {}
    public int getRoll()
    {
        return random.nextInt(6) + 1;
    }
}