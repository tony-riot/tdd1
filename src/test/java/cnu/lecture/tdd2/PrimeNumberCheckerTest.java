package cnu.lecture.tdd2;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by tchi on 2016. 4. 17..
 */
@RunWith(Parameterized.class)
public class PrimeNumberCheckerTest {
    private int inputNumber;
    private boolean expectedResult;
    private PrimeNumberChecker checker;

    @Before
    public void setup() {
        checker = new PrimeNumberChecker();
    }

    public static class PrimeNumberValidationInput {
        public int number;
        public boolean expectation;

        public PrimeNumberValidationInput(int number, boolean expectation) {
            this.number = number;
            this.expectation = expectation;
        }
    }

    @Parameterized.Parameters
    public static Collection<PrimeNumberValidationInput> primeNumbers() {
        return Arrays.asList(new PrimeNumberValidationInput[] {
                new PrimeNumberValidationInput(2, true),
                new PrimeNumberValidationInput(6, false)
        });
    }

    public PrimeNumberCheckerTest(PrimeNumberValidationInput input) {
        this.inputNumber = input.number;
        this.expectedResult = input.expectation;
    }

    @Test
    public void testCheckerValidatePrimeNumber() {
        assertThat(checker.validate(inputNumber), is(expectedResult));
    }
}
