
/**
 * Write a description of class RandomArray here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Random;
import java.util.Arrays;
public class RandomArray
{
    int a;
    int b;
    int[][] random;
    
    public RandomArray( int x, int y) {
        a = x;
        b = y;
        random = new int[a][b];
    }
    
    public void loadArray2D() {
        for(int i = 0; i < a; i++) {
            for(int j = 0; j < b; j++) {
                random[i][j] = (int) (Math.random() * 10) + 1;
            }
        }
    }
    public void printArray2D() {
        for(int i = 0; i < a; i++) {
            for(int j = 0; j < b; j++) {
                System.out.print( random[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public void sortArray2D() {
        for(int i = 0; i < a; i++) {
            Arrays.sort(random[i]);
        }
    }
    public int getMean2D() {
        int mean = 0;
        for(int i = 0; i < a; i++) {
            for(int j = 0; j < b; j++) {
                 mean += random[i][j];
            }
        }
        return mean / (a*b);
    }
}   
