import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.*;

public class EulerProblemsTest {
    @Test
    public void testProblem1() {
        assertThat(EulerProblems.answer1(), is(233168));
    }

    @Test
    public void testProblem2() {
        assertThat(EulerProblems.answer2(), is(4613732));
    }

    @Test
    public void testProblem3() {
        assertThat(EulerProblems.answer3(), is(6857L));
    }
}
