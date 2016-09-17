package Lab6;


/**
 * Fun with random arrays
 * 
 * Pjotr Rotteveel 
 * September 2016
 */
import java.util.Random;
import java.util.Arrays;
public class LoopTwo
{
    int[] n = new int [10];
    int a = 0;
    public void loadRandom() {
        for(int i = 0; i < n.length; i++) {
           Random random = new Random();
           int a = random.nextInt(100);
           n[i] = a;
        }
    }
    public void printArray() {
        System.out.println("The content of the array:");
        for(int i = 0; i < n.length; i++) {
            System.out.println(n[i]);
        }
    }
    public void sortArray() {
        Arrays.sort(n);
    }
    public double findAverage() {
        double a = 0;
        for(int i = 0; i < n.length; i++) {
            a += n[i];
        }
        return a / n.length;
    }
    public void getMedian(){
        System.out.println(n[4] + " " + n[5]);
    }
//    public void getMode() {
//   
//        for(int a = 0; a < n.length; a++) {
//            for(int i = 0; i < n.length; i++) {
//                if(n[a] == n[i]) {
//                    System.out.println("The mode is: " + n[a]);
//                    break;
//                }
//                else {
//                    System.out.println("False");
//                }
//            int Highest = n[0];
//            int Next    = 0;
//            int Count   = 1;
//            for(int i = 1; i < n.lenght; i++) {
//                for( int j = i+1; j < n.length; j++) {
//                    Next = n[j];
//                    if ( Next == Highest ) {
//                        Count++;
                    }
//                }
//            }
//        }
//            
//        }
//    }
//}
