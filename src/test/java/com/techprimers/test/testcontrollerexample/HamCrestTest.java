package com.techprimers.test.testcontrollerexample;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;


public class HamCrestTest {

    @Test
    public void testHelloWorld() {

        List<Integer> numbers = Arrays.asList(12, 15, 45);


        assertThat(numbers, hasSize(3));


        assertThat(numbers, hasItems(12, 45));
        assertThat(numbers, everyItem(greaterThan(10))); //herbir ifade 10dan büyük olmalı
        assertThat(numbers, everyItem(lessThan(100))); //her ifade 10 dan az olmalı

        assertThat("", isEmptyString());
        assertThat("ABCDE", containsString("BCD"));
        assertThat("ABCDE", startsWith("ABCDE"));
        assertThat("ABCDE", endsWith("CDE"));

    }
}
