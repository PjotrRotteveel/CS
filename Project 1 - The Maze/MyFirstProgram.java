
/**
 * Maze code
 * 
 * Pjotr Rotteveel 
 * 08/30/2016
 */
public class MyFirstProgram
{
    public static void run()
    {
        Maze maze = new Maze();
        MazeWalker mazeWalker = new MazeWalker();
        mazeWalker.walkMaze(maze.getMazeBot());
    }
}
