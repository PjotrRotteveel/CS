
/**
 * Write a description of class BallRunner here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Random;

public class BallRunner
{
    public static void main (String args[]){
        Random random = new Random();
        BallWorld canvas = new BallWorld(500, 500);
        for(int i = 0; i<=4; i++) {
            ball BL1 = new ball(random.nextInt(500), random.nextInt(500), 25, 0, canvas );
            ball BL2 = new ball(random.nextInt(500), random.nextInt(500), random.nextInt(100), 10, canvas );
            ball BL3 = new ball(random.nextInt(500), random.nextInt(500), random.nextInt(100), 10, canvas );
            ball BL4 = new ball(random.nextInt(500), random.nextInt(500), random.nextInt(100), 10, canvas );
            ball BL5 = new ball(random.nextInt(500), random.nextInt(500), random.nextInt(100), 10, canvas );
            ball BL6 = new ball(random.nextInt(500), random.nextInt(500), random.nextInt(100), 10, canvas );
            ball BL7 = new ball(random.nextInt(500), random.nextInt(500), random.nextInt(100), 10, canvas );
            ball BL8 = new ball(random.nextInt(500), random.nextInt(500), random.nextInt(100), 10, canvas );
            ball BL9 = new ball(random.nextInt(500), random.nextInt(500), random.nextInt(100), 10, canvas );
            ball BL10 = new ball(random.nextInt(500), random.nextInt(500), random.nextInt(100), 10, canvas );
            while (true) {
                BL1.bounceBall();
                BL2.bounceBall();
                BL3.bounceBall();
                BL4.bounceBall();
                BL5.bounceBall();
                BL6.bounceBall();
                BL7.bounceBall();
                BL8.bounceBall();
                BL9.bounceBall();
                BL10.bounceBall();
            }
        }
   }
}
