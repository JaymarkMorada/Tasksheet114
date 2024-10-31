public class Tasksheet120 {

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public static int cumulativeSum(int... numbers) {
        int totalSum = 0;

        for (int num : numbers) {
            int cumulativeSum = 0;

            for (int i = 1; i <= num; i++) {
                cumulativeSum += i;
            }

            System.out.println("Cumulative sum up to " + num + " is: " + cumulativeSum);
            totalSum += cumulativeSum;
        }

        return totalSum;
    }

    public static void main(String[] args) {
        int result = cumulativeSum(4, 5, 10);
        System.out.println("Total sum of cumulative sums: " + result);
    }
}
