package day02;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

/**
 * @author homo.efficio@gmail.com
 *         created on 2017-01-01.
 */
public class AlgebraTest {

    @Test public void addTest() {
        Algebra algebra = new Algebra();
        assertThat("1 + 2 = 3", algebra.add(1, 2), is(equalTo(3)));
    }

    @Test public void subtractTest() {
        Algebra algebra = new Algebra();
        assertThat("3 - 1 = 2", algebra.subtract(3, 1), is(equalTo(2)));
    }
}
