package visitor_ufu.visitors;

import visitor_ufu.numberElement.NumberElement;
import visitor_ufu.numberElement.ThreeElement;
import visitor_ufu.numberElement.TwoElement;

import java.util.List;

public interface NumberVisitor {

    void visit(TwoElement twoElement);

    void visit(ThreeElement threeElement);

    void visit(List<NumberElement> elementList);
}
