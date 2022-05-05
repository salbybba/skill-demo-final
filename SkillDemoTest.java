import static org.junit.Assert.*;
import org.junit.*;

public class SkillDemoTest {
    @Test
    public void helloTest() {
        assertEquals("hello Abby", SkillDemo.helloName("Abby"));
    }
}
