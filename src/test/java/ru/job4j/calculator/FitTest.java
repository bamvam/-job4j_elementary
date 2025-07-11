package ru.job4j.calculator;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class FitTest {

    @Test
    void whenMan180Then92() {
        short input = 180;
        double expected = 92;
        double output = Fit.manWeight(input);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenWoman170Then69() {
        short input = 170;
        double expected = 69;
        double output = Fit.womanWeight(input);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenMan187Then100dot05() {
        short input = 187;
        double expected = 100.05;
        double output = Fit.manWeight(input);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenWoman160Then57dot5() {
        short input = 160;
        double expected = 57.5;
        double output = Fit.womanWeight(input);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

}