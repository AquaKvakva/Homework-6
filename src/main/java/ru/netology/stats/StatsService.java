package ru.netology.stats;

public class StatsService {

    public int getAllAmount( int [] stats ) {
        int sum = 0;
        for (int i = 0; i < stats.length; i++) {
            int num = stats[i];
            sum += num;
        }
        return sum;
    }

    public int getAverageSalesAmount ( int [] stats ) {
        int sum = 0;
        int averageSum = 0;
        for (int i = 0; i < stats.length; i++) {
            int num = stats[i];
            sum += num;
            averageSum = sum / stats.length;
        }
        return averageSum;
    }

    public int maxSales( int [] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }

        return maxMonth + 1;
    }

    public int minSales(int[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }

        return minMonth + 1;
    }

    public int getSalesBelowAverage ( int [] sales) {
        int belowAverage = 0;
        int averageSum = getAverageSalesAmount( sales ) ;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > averageSum) {
                belowAverage ++;
            }
        }
        return belowAverage;
    }

    public int getSalesAboveAverage( int [] sales) {
        int aboveAverage = 0;
        int averageSum = getAverageSalesAmount( sales ) ;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < averageSum) {
                aboveAverage ++;
            }
        }
        return aboveAverage;
    }


}
