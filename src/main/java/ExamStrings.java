import static jdk.nashorn.internal.objects.NativeString.indexOf;
import static jdk.nashorn.internal.objects.NativeString.slice;

import java.util.List;

class Exam2Strings {

  public static void main(String[] args) {
    int[] testArray = new int[100];

    for (int i = 0; i < 100; i++) {
      testArray[i] = i;
    }
    printArray(slice(testArray, 50, 10, 50));
  }

  static void printArray(int[] array) {
    for (int i: array) {
      System.out.println((i + ""));
    }
  }
  static int[] slice(int[] array, int to, int from, int stride) {
    int newLength = (int)Math.ceil((double) (to - from) / (double) stride);
    int[] newInt = new int[newLength];

    int iterator = 0;
    for (int i = from; i < to; i += stride) {
      newInt[iterator++] = array[i];
    }
    return newInt;
  }
}

