import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class MyAssertTest {
    List<String> todos = Arrays.asList("AWS","Azure","Devops");
    @Test
    public void test(){
        boolean test = true;
        assertEquals(true,test);
    }

    @Test
    public void test1(){
        boolean test = todos.contains("AWS");
        //assertEquals(true,test);
        assertEquals(3,todos.size());
        assertTrue("Something went wrong",test);
        assertFalse(todos.contains("GCP"));
        assertArrayEquals(new int[] {1,2},new int[] {1,2});
    }
}
