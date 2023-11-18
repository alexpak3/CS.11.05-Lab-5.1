public class ArrayUtility {

    public static void print(int[] array) {
        for (int i = 0; i<array.length-1;i++){
            System.out.print(array[i]);}
    }

    public static int sum(int[] array) {
        int result = 0;
        for ( int i =0; i< array.length; i++){
            result += array[i];
        }
        return result;
    }

    public static double average(int[] array) {
        double result = 0.0;
        double average = 0.0;
        for (int i = 0; i<array.length;i++){
            average += array[i];
        }
        result = average/array.length;
        return Math.round(result*100.0)/100.0;

    }

    public static int minimum(int[] array) {
        if (array.length == 0) {
            return 0;
        }
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            min = Math.min(min, array[i]);
        }
        return min;
    }

    public static int maximum(int[] array) {
        if (array.length == 0) {
            return 0;
        }
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static int evenCount(int[] array) {
        int count = 0;
        for ( int arrays : array){
            if ( arrays%2==0) {
                count++;
            }
        }
        return count;
    }

    public static int[] reverseOne(int[] array) {
        int[] reversed = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            reversed[i] = array[array.length - i - 1];
        }
        return reversed;
    }

    public static void reverseTwo(int[] array) {
        int temp;
        for (int i = 0; i < array.length / 2; i++) {
            temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
    }

    public static boolean linearSearchInt(int[] array, int num) {
        for (int nums : array) {
            if (nums == num) {
                return true;
            }
        }
        return false;
    }

    public static boolean linearSearchString(String[] array, String str) {
        for (String strings : array) {
            if (strings.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static void multiplyByTwo(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] *= 2;
        }
    }

    public static void multiplyByN(int[] array, int n) {
        int result =0 ;
            for (int i = 0; i < array.length; i++) {
                array[i] *= n;

        }
    }

    public static String toString(int[] array) {
        if (array.length == 0) {
            return "";
        }
        String result = "";
        for (int i = 0; i < array.length - 1; i++) {
            result += array[i] + ", ";
        }
        result += array[array.length - 1];
        return result;
    }

    public static boolean twoSum(int[] array, int num) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == num) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void shiftRight(int[] array) {
        if (array.length <= 1) {
            return;
        }
        int lastElement = array[array.length - 1];
        for (int i = array.length - 1; i > 0; i--) {
            array[i] = array[i - 1];
        }
        array[0] = lastElement;
    }

    public static void shiftLeft(int[] array) {
        if (array.length <= 1) {
            return;

        }
        int firstElement = array[0];
        for (int i = 0; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }
        array[array.length - 1] = firstElement;
    }

    public static void shiftRightNTimes(int[] array, int n) {
        if (array.length <= 1) {
            return; // No need to shift if the array has 0 or 1 element
        }
        n = n % array.length; // Adjust n to be within the length of the array
        int[] temp = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            temp[(i + n) % array.length] = array[i];
        }
        for (int i = 0; i < array.length; i++) {
            array[i] = temp[i];
        }
    }

    public static void shiftLeftNTimes(int[] array, int n) {
        if (array.length <= 1) {
            return; // No need to shift if the array has 0 or 1 element
        }
        n = n % array.length; // Adjust n to be within the length of the array
        int[] temp = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            temp[(i - n + array.length) % array.length] = array[i];
        }
        for (int i = 0; i < array.length; i++) {
            array[i] = temp[i];
        }
    }


}
