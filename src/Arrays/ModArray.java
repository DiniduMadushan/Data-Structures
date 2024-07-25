
package Arrays;


public class ModArray {
  public static void main(String[] args) {
        int[] numbers = {1, 2, 2, 6, 3, 4, 4, 5};
        int mode = findMode(numbers);
        System.out.println("Mode value: " + mode);
    }

    public static int findMode(int[] numbers) {
        int mode = numbers[0];
        int maxCount = 0;

        for (int i = 0; i < numbers.length; i++) {
            int count = 0;
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[j] == numbers[i]) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                mode = numbers[i];
            }
        }

        return mode;
    }
}
