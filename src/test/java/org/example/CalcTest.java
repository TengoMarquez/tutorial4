package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalcTest {
  Calc c = new Calc();

    @Test
    void testAddition() {
        assertEquals(4, c.add(2,2));
    }
    @Test
    void testSubtraction() {
        Calc c = new Calc();
        assertEquals(2, c.subtract(4, 2)); // 预期 4 - 2 = 2，但实际若 subtract 有问题，测试会失败
    }
}
