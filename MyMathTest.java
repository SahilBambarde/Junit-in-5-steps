import org.junit.Test;

import static junit.framework.TestCase.fail;
import static org.junit.Assert.assertEquals;


public class MyMathTest {

    private  MyMath math = new MyMath();
    @Test
    public void test(){
        int[] numbers = {1,2,3};

        int result = math.calculateSum(numbers);
        System.out.println(result);
        int expectedResult = 6;
        assertEquals(expectedResult,result);
    }

    @Test
    public void test1(){
        int[] numbers = {};
        MyMath math = new MyMath();
        int result = math.calculateSum(numbers);
        System.out.println(result);
        int expectedResult = 0;
        assertEquals(expectedResult,result);
    }
}
