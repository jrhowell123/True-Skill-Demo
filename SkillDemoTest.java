import static org.junit.Assert.*;
import org.junit.*;

public class SkillDemoTest {
    @Test
    public void subtraction(){
        assertEquals(2, SkillDemo.subtract(3,3));//should fail
    }

    @Test
    public void multiplication(){
        assertEquals(6, SkillDemo.multiply(3,3));//should fail
    }
}
