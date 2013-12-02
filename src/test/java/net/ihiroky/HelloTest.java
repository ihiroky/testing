package net.ihiroky;

import org.junit.Test;

/**
 *
 */
public class HelloTest {

    @Test
    public void testPrintSystemProperties() throws Exception {
        Hello sut = new Hello();
        sut.printSystemProperties();
    }
}
