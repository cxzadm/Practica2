package ec.edu.ups.tdd.calculator;

public class Calculator {
    private int ans;
    public int addition(int a, int b){
        return a+b;
    }

    public int subtraccion(int a, int b) {
        return a-b;
    }

    public int division(int a, int b) {
        return a/b;
    }

    public int multiplicacion(int a, int b) {
        return a*b;
    }

    public int getAns() {
        return ans;
    }

    public void setAns(int ans) {
        this.ans = ans;
    }
}
