package cnu.lecture.tdd2;

import org.junit.Test;

import java.io.IOException;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

/**
 * Created by tchi on 2016. 4. 17..
 */
public class PhoneBillCalculatorTest {
    @Test
    public void testCalculatorReadMethod() throws IOException {
        //TODO your job here!
        PhoneBillCalculator calculator = new PhoneBillCalculator();
        calculator.read();
        assertThat(calculator.calculate(), is(greaterThan(0f)));
    }
}
