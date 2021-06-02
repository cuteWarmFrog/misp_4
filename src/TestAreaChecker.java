import point.AreaChecker;

import org.junit.Test;
import point.Point;

import static org.junit.Assert.*;

public class TestAreaChecker {
    @Test
    public void testChecker1() {
        testChecker(1);
    }

    @Test
    public void testChecker2() {
        testChecker(2);
    }

    @Test
    public void testChecker3() {
        testChecker(3);
    }

    @Test
    public void testChecker4() {
        testChecker(4);
    }

    @Test
    public void testChecker5() {
        testChecker(5);
    }


    public void testChecker(double r) {
        AreaChecker ac = new AreaChecker();

        Point point = new Point(0, 0, r);
        assertTrue(ac.checkIfShotHitArea(point));

        point = new Point(0, -r/2, r);
        assertTrue(ac.checkIfShotHitArea(point));
        point = new Point(0, -r, r);
        assertTrue(ac.checkIfShotHitArea(point));
        point = new Point(-r/2, -r/2, r);
        assertTrue(ac.checkIfShotHitArea(point));
        point = new Point(-r, 0, r);
        assertTrue(ac.checkIfShotHitArea(point));
        point = new Point(-r/2, 0, r);
        assertTrue(ac.checkIfShotHitArea(point));

        point = new Point(-r, r/2, r);
        assertTrue(ac.checkIfShotHitArea(point));
        point = new Point(-r/2, r/2, r);
        assertTrue(ac.checkIfShotHitArea(point));
        point = new Point(0, r/2, r);
        assertTrue(ac.checkIfShotHitArea(point));
        point = new Point(r/4, r/4, r);
        assertTrue(ac.checkIfShotHitArea(point));

        point = new Point(r/2, r/2, r);
        assertFalse(ac.checkIfShotHitArea(point));
        point = new Point(r/2, -r/2, r);
        assertFalse(ac.checkIfShotHitArea(point));
    }
}