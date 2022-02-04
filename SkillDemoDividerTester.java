import static org.junit.Assert.*;
import org.junit.*;

public class SkillDemoDividerTester {
    @Test
    public void divideTest(){
        assertEquals(2, SkillDemoDivider.divide(5,2));
    }
}
