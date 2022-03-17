package ru.job4j.condition;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class MaxTest {

    @Test
    public void whenMax15To30Then30() {
        int result = Max.max(15, 30);
        assertThat(result, is(30));
    }

    @Test
    public void whenMax5To1Then5() {
        int result = Max.max(5, 1);
        assertThat(result, is(5));
    }

    @Test
    public void whenMax8To8Then8() {
        int result = Max.max(8, 8);
        assertThat(result, is(8));
    }
}