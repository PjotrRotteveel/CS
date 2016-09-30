
/**
 * Write a description of class ball here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Random;
public class ball
{
    int x = 0;
    int y = 0;
    int radius = 0;
    double heading = 0.0;
    BallWorld canvas = null;
    BallBot BB = null;
    
    public ball( int start_x, int start_y, int start_radius, double start_heading, BallWorld start_canvas) {
        x = start_x;
        y = start_y;
        radius = start_radius;
        heading = start_heading;
        canvas = start_canvas;
        TGPoint startPoint = new TGPoint(x, y);
        BB = new BallBot (canvas, startPoint, heading, radius);
    }
    
    public void bounceBall(){
        if(BB.canMoveForward(canvas)){
            BB.moveForward();
        }
        else {
            BB.setHeading(Math.random() * 360);
        }
    }
}
