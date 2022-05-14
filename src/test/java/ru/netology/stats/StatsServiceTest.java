package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
    public void calcSum() {
        StatsService service = new StatsService();

        int sumActual = service.sum(sales);
        int sumExpected = 8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18;

        Assertions.assertEquals(sumExpected, sumActual);
    }

    @Test
    public void calcABS() {
        StatsService service = new StatsService();

        int absActual = service.average(sales);
        int absExpected = (8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18) / 12;

        Assertions.assertEquals(absExpected, absActual);
    }

    @Test
    public void monthPriority() {
        StatsService service = new StatsService();

        int maxActual = service.maxi(sales);
        int maxExpected = 8;

        Assertions.assertEquals(maxExpected, maxActual);
    }
    @Test
    public void monthNoPriority() {
        StatsService service = new StatsService();

        int minActual = service.min(sales);
        int minExpected = 9;

        Assertions.assertEquals(minExpected, minActual);
    }
    @Test
    public void countMonthPriority() {
        StatsService service = new StatsService();

        int actual = service.countMonthPriority(sales);
        int expected = 5;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void countMonthNoPriority() {
        StatsService service = new StatsService();

        int actual = service.countMonthNoPriority(sales);
        int expected = 5;

        Assertions.assertEquals(expected, actual);
    }


}
