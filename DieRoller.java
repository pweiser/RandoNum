import Die.java;
import java.io.File;

class DieRoller
{
    public static void main(String [] args)
    {
        Die myDie = new Die();
        int result = myDie.rollDie();
        myDie.writeFile(args[0], result);
    }

    public static void writeFile(String file, int res){
	BufferedWriter writer = new BufferedWriter(new FileWriter(file));
	writer.write(str);

	writer.close();
    }
}
