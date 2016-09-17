
/**
 * Write a description of class FastCalc here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class FastCalc
{
   private int result;
   public FastCalc(int n){
       result = n;
   }
   public int factorial(int n) {
       int f = result/n;
       for (int i = 0; i <= result; i++) {
           f = f + i * f ;
       }
       System.out.println("The factorial of n is " + result);
       return result;
   }
   public int lol(){
    return 1 * 2 * 3 * 4 * 5 * 6 * 7; 
   }
}
