package pl.pp;

public class MojaDziesiataAplikacja {
    public static int[] countAndSumElements(int[] input) {
        if (input == null || input.length == 0) {
            return new int[]{};
        }
        int countNegative = 0;
        int sumPositive = 0;
        for (int i : input) {
            if (i < 0) {
                countNegative++;
            } else if (i > 0) {
                sumPositive += i;
            }
        }
        return new int[]{countNegative, sumPositive};
    }

    public static void main(String[] args) {
        int[] input = {1, 2, 3, 4, 5, -3, -2, -1};
        int[] result = countAndSumElements(input);
        System.out.println("Liczba elementów ujemnych: " + result[0]);
        System.out.println("Suma elementów dodatnich: " + result[1]);
    }
}
