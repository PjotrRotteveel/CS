
/**
 * Write a description of class COE here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Random;
public class COE
{
    int a;
    int b;
    int[][] array;
    public COE( int x, int y ) {
        a = x;
        b = y;
        array = new int[a][b];
    }
    public void loadArray() {
        for(int i = 0; i < a; i++) {
            for(int j = 0; j < b; j++) {
                array[i][j] = (int) (Math.random() * 10) + 1;
            }
        }
    }
}
