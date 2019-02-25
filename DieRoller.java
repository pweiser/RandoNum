import Die;

class DieRoller
{
    public static void main(String [] args)
    {
        Die myDie = new Die();
        myDie.rollDie();
        myDie.writeFile(args[0]);
    }
}