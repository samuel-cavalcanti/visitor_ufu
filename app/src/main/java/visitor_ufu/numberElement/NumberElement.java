package visitor_ufu.numberElement;

import visitor_ufu.visitors.NumberVisitor;

public interface NumberElement {

    void accept(NumberVisitor visitor);
}
