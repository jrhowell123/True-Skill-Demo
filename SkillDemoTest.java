import static org.junit.Assert.*;
import org.junit.*;

public class SkillDemoTest {
    @Test
    public void subtraction(){
        assertEquals(2, SkillDemo.subtract(3,1));//should pass
    }

    @Test
    public void multiplication(){
        assertEquals(6, SkillDemo.multiply(3,2));//should pass
    }
}
