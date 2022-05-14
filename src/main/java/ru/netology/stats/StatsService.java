package ru.netology.stats;

public class StatsService {
    public int sum(int[] sales) { // Расчет суммы всех продаж
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int average(int[] sales, int sum) { // Расчет средней суммы продаж в месяц

        int abs = sum / sales.length;

        return abs;

    }

    public int maxi(int[] sales) {  // Расчет номера месяца максимальной выручки
        int maxi = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxi]) {
                maxi = i;
            }
        }
        return maxi + 1; // месяцы считаются с первого, а не с нулевого. Прибавляем 1
    }

    public int min(int[] sales) { // Расчет номера месяца минимальной выручки
        int mini = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[mini]) {
                mini = i;
            }
        }
        return mini + 1; // месяцы считаются с первого, а не с нулевого. Прибавляем 1
    }

    public int countMonthPriority(int[] sales, int abs, int sum) { // Расчет средней суммы продаж в месяц

        int countMax = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > abs) {
                countMax++;
            }

        }
        return countMax;

    }

    public int countMonthNoPriority(int[] sales, int abs, int sum) { // Расчет средней суммы продаж в месяц
        int countMin = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < abs) {
                countMin++;
            }

        }
        return countMin;

    }
}