package day02;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

/**
 * @author omwomw@sk.com
 *         created on 2017. 1. 3.
 */
public class AlgebraTest {

    @Test public void subtractTest() {

        Algebra algebra = new Algebra();
        assertThat("3 - 1 = 2", algebra.subtract(3, 1), is(equalTo(2)));
    }

    @Test public void addTest() {

        Algebra algebra = new Algebra();
        assertThat("3 + 1 = 4", algebra.add(3, 1), is(equalTo(4)));
    }
}
