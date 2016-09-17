package Lab6;


/**
 * Fun with random arrays
 * 
 * Pjotr Rotteveel 
 * September 2016
 */
public class LoopTwoRunner
{
    
    public static void main(String[] args) {
        LoopTwo LT = new LoopTwo();
        LT.loadRandom();
        LT.printArray();
        LT.sortArray();
        LT.printArray();
        double AV = LT.findAverage();
        System.out.println("Average: " + AV );
        System.out.println("The median(s) are/is: ");
        LT.getMedian();
        //LT.getMode();
    }
}
