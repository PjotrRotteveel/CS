
/**
 * Creates a loop and reverses it
 * 
 * Pjotr Rotteveel 
 * 9/21/2016
 */
public class ReverseArray
{   
    int[] nums = new int [10];
    int a = nums.length - 1;
    public void createArray() {
        for(int i = 0; i < 10; i++) {
            nums[i] = i;
        }
    }
    public void printArray() {
        for(int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
    public void reverseArray() {
        for(int i = 0; i < nums.length; i++) {
            System.out.println(nums[a]);
            a--;
        }
    }
}
