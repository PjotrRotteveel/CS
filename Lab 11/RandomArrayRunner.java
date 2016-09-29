
/**
 * Write a description of class RandomArrayRunner here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RandomArrayRunner
{
    public static void main(String[] args) {
        RandomArray RA = new RandomArray( Integer.parseInt(args[0]), Integer.parseInt(args[1]));
        RA.loadArray2D();
        RA.printArray2D();
        RA.sortArray2D();
        RA.printArray2D();
        System.out.println("Mean: " + RA.getMean2D());
    }
}
