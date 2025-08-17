package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.within;

class PointTest {
    @Test
    void whenPoints00And20Then2() {
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double result = a.distance(b);
        assertThat(result).isEqualTo(2.0, within(0.01));
    }

    @Test
    void whenPointsMinus1Minus1And1And1Then2Dot83() {
        Point a = new Point(-1, -1);
        Point b = new Point(1, 1);
        double result = a.distance(b);
        assertThat(result).isEqualTo(2.828, within(0.01));
    }

    @Test
    void whenPointsMinus2Minus2And2And2Then5Dot66() {
        Point a = new Point(-2, -2);
        Point b = new Point(2, 2);
        double result = a.distance(b);
        assertThat(result).isEqualTo(5.656, within(0.01));
    }
}