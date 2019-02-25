import java.util.Random;

class rando{
    public static void main(String[] argv){
	Random rand = new Random();

	int n = rand.nextInt();

	System.out.println("Here is a random number: " + n);
    }
}
