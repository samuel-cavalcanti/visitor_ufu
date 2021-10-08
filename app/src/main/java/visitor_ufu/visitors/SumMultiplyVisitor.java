package visitor_ufu.visitors;

import visitor_ufu.numberElement.NumberElement;
import visitor_ufu.numberElement.ThreeElement;
import visitor_ufu.numberElement.TwoElement;

import java.util.List;

public class SumMultiplyVisitor implements NumberVisitor {
    private int sum = 0;

    @Override
    public void visit(TwoElement twoElement) {
        int result = twoElement.a * twoElement.b;
        sum += result;

    }

    @Override
    public void visit(ThreeElement threeElement) {
        int result = threeElement.a * threeElement.b * threeElement.c;
        sum += result;
    }

    @Override
    public void visit(List<NumberElement> elementList) {
        for (NumberElement element : elementList)
            element.accept(this);
    }

    public int getTotalSum() {
        return sum;
    }
}
