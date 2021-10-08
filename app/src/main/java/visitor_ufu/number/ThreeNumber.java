package visitor_ufu.number;

public class ThreeNumber implements MultiOperation, SumOperation {
    private final int a;
    private final int b;
    private final int c;

    public ThreeNumber(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public int sum() {
        return a + b + c;
    }

    @Override
    public int multiply() {
        return a * b * c;
    }
}
