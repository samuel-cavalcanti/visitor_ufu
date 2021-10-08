package visitor_ufu.visitors;

import visitor_ufu.numberElement.NumberElement;
import visitor_ufu.numberElement.ThreeElement;
import visitor_ufu.numberElement.TwoElement;

import java.util.List;

public class TotalSumVisitor implements NumberVisitor {

    private int totalSum = 0;

    @Override
    public void visit(TwoElement twoElement) {
        int sum = twoElement.a + twoElement.b;
        System.out.println("Adding " + twoElement.a + "+" + twoElement.b + "=" + sum + " to total");
        totalSum += sum;
    }

    @Override
    public void visit(ThreeElement threeElement) {
        int sum = threeElement.a + threeElement.b + threeElement.c;
        System.out.println("Adding " + threeElement.a + "+" + threeElement.b + "+" + threeElement.c + "=" + sum + " to total");
        totalSum += sum;
    }

    @Override
    public void visit(List<NumberElement> elementList) {
        for (NumberElement element : elementList)
            element.accept(this);
    }

    public int getTotalSum() {
        return totalSum;
    }

}
