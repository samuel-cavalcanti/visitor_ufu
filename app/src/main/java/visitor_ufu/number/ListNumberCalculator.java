package visitor_ufu.number;

import java.util.List;

public class ListNumberCalculator {


    public int calculateSum(List<SumOperation> numbers) {
        return numbers.stream().map(SumOperation::sum).reduce(0, Integer::sum);
    }

    public int calculateSumMultiplication(List<MultiOperation> numbers){
        return numbers.stream().map(MultiOperation::multiply).reduce(0, Integer::sum);
    }
}
