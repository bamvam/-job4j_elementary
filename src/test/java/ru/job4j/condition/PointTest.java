package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.offset;

class PointTest {
    @Test
    void whenPoints3dThenDistance() {
        Point a = new Point(0, 0, 0);
        Point b = new Point(2, 0, 1);
        double result = a.distance3d(b);
        double expected = Math.sqrt(5); // √(2² + 0² + 1²) = √5 ≈ 2.236
        assertThat(result).isCloseTo(expected, offset(0.001));
    }

    @Test
    void whenSame3dPointsThenZero() {
        Point a = new Point(5, 5, 5);
        Point b = new Point(5, 5, 5);
        double result = a.distance3d(b);
        assertThat(result).isCloseTo(0.0, offset(0.001));
    }

    @Test
    void whenVertical3dDistance() {
        Point a = new Point(0, 0, 5);
        Point b = new Point(0, 0, 10);
        double result = a.distance3d(b);
        assertThat(result).isCloseTo(5.0, offset(0.001));
    }

    @Test
    void whenMixed2dAnd3dPoints() {
        Point a = new Point(0, 0);     // 2D точка (z=0)
        Point b = new Point(0, 0, 3);  // 3D точка
        double result = a.distance3d(b);
        assertThat(result).isCloseTo(3.0, offset(0.001));
    }
}