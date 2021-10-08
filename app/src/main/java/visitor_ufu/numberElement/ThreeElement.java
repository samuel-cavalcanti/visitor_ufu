package visitor_ufu.numberElement;

import visitor_ufu.visitors.NumberVisitor;

public class ThreeElement implements NumberElement {
    public final int a;
    public final int b;
    public final int c;


    public ThreeElement(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }


    @Override
    public void accept(NumberVisitor visitor) {
        visitor.visit(this);
    }
}
