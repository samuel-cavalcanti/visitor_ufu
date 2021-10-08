package visitor_ufu;

import org.junit.jupiter.api.Test;
import visitor_ufu.number.*;

import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberTest {

    @Test
    void testSum() {
        TwoNumber two1 = new TwoNumber(3, 3);
        TwoNumber two2 = new TwoNumber(2, 7);
        ThreeNumber three = new ThreeNumber(3, 4, 5);

        assertEquals(6, two1.sum());
        assertEquals(9, two2.sum());
        assertEquals(12, three.sum());

        List<SumOperation> sumNumberList = new LinkedList<>();
        sumNumberList.add(two1);
        sumNumberList.add(two2);
        sumNumberList.add(three);

        assertEquals(27, new ListNumberCalculator().calculateSum(sumNumberList));
    }

    @Test
    void testMultiplication() {
        TwoNumber two1 = new TwoNumber(3, 3);
        TwoNumber two2 = new TwoNumber(2, 7);
        ThreeNumber three = new ThreeNumber(3, 4, 5);
        assertEquals(9, two1.multiply());
        assertEquals(14, two2.multiply());
        assertEquals(60, three.multiply());

        List<MultiOperation> sumNumberList = new LinkedList<>();
        sumNumberList.add(two1);
        sumNumberList.add(two2);
        sumNumberList.add(three);

        assertEquals(83, new ListNumberCalculator().calculateSumMultiplication(sumNumberList));
    }
}
