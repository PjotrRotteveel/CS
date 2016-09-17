
/**
 * Class that will do various calculations
 * 
 * Pjotr Rottevee 
 * 08-25-2016
 */
public class SimpleCalc
{
    private int a;
    private int b;

    public SimpleCalc(int n1, int n2)
    {
        a = n1;
        b = n2;
    }
    public int add() {
        return a + b;
    }
    public int subtract() {
        return a - b;
    }
    public int mult() {
        return a * b;
    }
    public int div() {
        return a / b;
    }
    public boolean isGreater() {
        if(a > b) {
        return true;
        }
        else {
        return false;
        }
    }
}
