import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MethodTest {
    Method method;
    @BeforeEach
    void setUp() {
        method = new Method();
    }

    @Test
    void tax() {
        int expend = 36;
        int actual = Method.tax(600);
        Assertions.assertEquals(expend,actual);

    }

    @Test
    void taxEarningMinusSpendings() {
        int expend = 45 ;
        int actual = Method.taxEarningMinusSpendings(600,300);
        Assertions.assertEquals(expend,actual);
    }
}