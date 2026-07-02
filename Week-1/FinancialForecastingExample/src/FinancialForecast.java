public class FinancialForecast {

    // Recursive method
    public static double futureValue(double currentValue, double growthRate, int years) {

        // Base case
        if (years == 0)
            return currentValue;

        // Recursive call
        return futureValue(currentValue, growthRate, years - 1) * (1 + growthRate);
    }

    public static void main(String[] args) {

        double currentValue = 10000;
        double growthRate = 0.10;     // 10%
        int years = 5;

        double result = futureValue(currentValue, growthRate, years);

        System.out.println("Future Value after " + years + " years = " + result);
    }
}