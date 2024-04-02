import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.runner.RunWith;



public class MyBeforeAfterTest {
    @BeforeEach
    public void beforeEach(){
        System.out.println("beforeEach");
    }

    @BeforeAll
    public void beforeAll(){
        System.out.println("beforeAll");
    }

    @Test
    public void test1(){
        System.out.println("test1");
    }

    @Test
    public void test2(){
        System.out.println("test2");
    }

    @Test
    public void test3(){
        System.out.println("test3");
    }

    @AfterAll
    public void afterAll(){
        System.out.println("afterAll");
    }
}
