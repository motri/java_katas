// mine
public class Kata {
  public static int[] invert(int[] array) {

  for (int i = 0; i < array.length; i++) {
    int number = array[i];
    array[i] = number * -1;
  }
  return array;
  }
}

// best

public class Kata {
  public static int[] invert(int[] array) {
    return java.util.Arrays.stream(array).map(i -> -i).toArray();
  }
}
