
/**
 * Write a description of class COErunner here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class COErunner
{
    public static void main(String[] args) {
        COE CE = new COE( Integer.parseInt(args[0]), Integer.parseInt(args[1]) );
        CE.loadArray();
    }
}
