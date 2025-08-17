package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class MaxTest {
    @Test
    void whenLeft1Right2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenLeft5Right3Then5() {
        int left = 5;
        int right = 3;
        int result = Max.max(left, right);
        int expected = 5;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenNumbersEqual() {
        int left = 7;
        int right = 7;
        int result = Max.max(left, right);
        int expected = 7;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void maxOfThreeFirstMax() {
        assertThat(Max.max(10, 5, 3)).isEqualTo(10);
    }

    @Test
    void maxOfThreeSecondMax() {
        assertThat(Max.max(1, 8, 3)).isEqualTo(8);
    }

    @Test
    void maxOfThreeThirdMax() {
        assertThat(Max.max(1, 2, 15)).isEqualTo(15);
    }

    @Test
    void maxOfThreeAllEqual() {
        assertThat(Max.max(5, 5, 5)).isEqualTo(5);
    }

    @Test
    void maxOfFourFirstMax() {
        assertThat(Max.max(20, 10, 15, 5)).isEqualTo(20);
    }

    @Test
    void maxOfFourSecondMax() {
        assertThat(Max.max(5, 25, 10, 15)).isEqualTo(25);
    }

    @Test
    void maxOfFourThirdMax() {
        assertThat(Max.max(5, 10, 30, 15)).isEqualTo(30);
    }

    @Test
    void maxOfFourFourthMax() {
        assertThat(Max.max(5, 10, 15, 40)).isEqualTo(40);
    }

    @Test
    void maxOfFourAllEqual() {
        assertThat(Max.max(7, 7, 7, 7)).isEqualTo(7);
    }
}