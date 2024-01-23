package lv.rvt;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import rvt.Money;
import org.junit.Test;

public class MoneyTest {

    @Test
    public void testPlusMethod(){

        Money macins1 = new Money(10, 10);
        Money macins2 = new Money(5, 90);
        Money macins3 = macins1.plus(macins2);
        Money macins4 = new Money(4, 85);
        Money result1 = macins4.plus(macins2);

        assertEquals(10, result1.euros()); assertEquals(75, result1.cents());


        assertEquals(16, macins3.euros());
        assertEquals(16, macins3.euros());

    }
    @Test
    public void testLessMethod(){
        Money macins1 = new Money(1,1);
        Money macins2 = new Money(2,2);

        assertFalse(macins2.lessThan(macins1));
        assertTrue(macins1.lessThan(macins2));
    }

    @Test
    public void testLessThan(){
        Money mon1 = new Money(2, 80);
        Money mon2 = new Money(2, 90);
        Money mon3 = new Money(10, 10);

        boolean result1 = mon1.lessThan(mon2);
        boolean result2 = mon3.lessThan(mon1);

        assertTrue (result1);
        assertFalse (result2);

    }

    @Test
    public void testMinusMethot() {
        Money mon1 = new Money(2, 80);
        Money mon2 = new Money(2, 90);
        Money mon3 = new Money(10, 10);

        Money result1 = mon1.minus(mon2);
        Money result2 = mon2.minus(mon1);
        Money result3 = mon3.minus(mon2);

        assertEquals(0, result1.euros()); assertEquals(0, result1.cents());
        assertEquals(0, result2.euros()); assertEquals(10, result2.cents());
        assertEquals(7, result3.euros()); assertEquals(20, result3.cents());
    }


}


