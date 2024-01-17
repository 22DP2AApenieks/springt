package lv.rvt;

import static org.junit.Assert.assertEquals;
import rvt.Money;
import org.junit.Test;

public record MoneyTest() {

    @Test
    public void testPlusMethod(){

        Money macins1 = new Money(10, 10);
        Money macins2 = new Money(5, 90);
        Money macins3 = macins1.plus(macins2);


        assertEquals(16, macins3.euros());
        assertEquals(0, macins3.euros());

    }
    public void testLessMethod(){
        assertFalse(macins1.lessThen(macins2))
    }


    }

}
