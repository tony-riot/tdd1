package cnu.lecture.tdd2;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.junit.Assert.fail;

/**
 * Created by tchi on 2016. 4. 17..
 */
@Category(ExampleCategoryTest.class)
public class CategorizedTest {

    @Test
    public void testCategorizedTest() {
        fail("it is not fail");
    }
}
