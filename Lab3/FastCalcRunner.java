
/**
 * Get's the factorial value of n
 * 
 * @Pjotr Rotteveel 
 * September 2016
 */
public class FastCalcRunner{   
    public static void main(String[] args) {
        int n = 7;
        FastCalc FC = new FastCalc(n);
        System.out.println("The value of n is: " + n);
        System.out.println(FC.lol());
    }
}
