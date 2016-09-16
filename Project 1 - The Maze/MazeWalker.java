
/**
 * Code to navigate the turtle through the maze
 * 
 * Pjotr Rotteveel
 * 08/30/2016
 */
public class MazeWalker
{
    // instance variables - replace the example below with your own
    private int x;
    int a = 0;

    public void walkMaze(MazeBot mazeBot) {
    while(a<2) {
        mazeBot.moveForward();
        a++;
    }
    int a = 0;
    mazeBot.turnLeft();
    while(a<3) {
        mazeBot.moveForward();
        a++;
    }
    mazeBot.turnRight();
    while(a<5) {
        mazeBot.moveForward();
        a++;
    }
    mazeBot.turnRight();
    while(a<9) {
        mazeBot.moveForward();
        a++;
    }
    mazeBot.turnLeft();
    while(a<12) {
        mazeBot.moveForward();
        a++;
    }
    mazeBot.turnLeft();
    while(a<14) {
        mazeBot.moveForward();
        a++;
    }
    mazeBot.turnRight();
    while(a<16) {
        mazeBot.moveForward();
        a++;
    }
    if (a >= 16) {
        while(a<800) {
            while(a<100) {
                mazeBot.turnLeft();
                a++;
            }
            mazeBot.moveForward();
            while(a<200) {
                mazeBot.turnRight();
                a++;
            }
        }
}
}
}