package visitor_ufu.number;

public class TwoNumber implements MultiOperation, SumOperation {
    private final int a;
    private final int b;

    public TwoNumber(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public int sum() {
        return a + b;
    }

    @Override
    public int multiply() {
        return a * b;
    }

}
