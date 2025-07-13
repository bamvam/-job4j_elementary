package ru.job4j.loop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class CounterTest {

    @Test
    void whenSumFrom0To10Then55() {
        int start = 0;
        int finish = 10;
        int result = Counter.sum(start, finish);
        int expected = 55;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumFrom10To2Then0() {
        int start = 10;
        int finish = 2;
        int result = Counter.sum(start, finish);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

}