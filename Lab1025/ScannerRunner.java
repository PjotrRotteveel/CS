import java.util.Scanner;
public class ScannerRunner {
    public ScannerRunner() {
    
    }
    
    public static void main(String[] args) {
    String ans = "yes";
    Scanner scr = new Scanner(System.in);
    while(!ans.equals("no")) {
        System.out.print("Type in any sentence (no to quit): ");
        ans = scr.next();
        System.out.println(ans);
    }
    }
}