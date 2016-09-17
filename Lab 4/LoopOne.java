
/**
 * Write a description of class LoopOne here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LoopOne
{
    int b = 5;
    int [] nums = new int [10];
    
    public void loadArray() {
        for(int a = 0; a < nums.length; a++){
            nums[a] = b;
            b = b + 5;
        }
    }
    
    public void printArray() {
        for(int c = 0; c< nums.length; c++){
            System.out.println(nums[c]);
        }
    }
    }