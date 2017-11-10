import java.lang.Character;

public class JadenCase {

  public String toJadenCase(String phrase) {
    if(phrase == null || phrase.equals("")) return null;

    char[] array = phrase.toCharArray();

    for(int x = 0; x < array.length; x++) {
      if(x == 0 || array[x-1] == ' ') {
        array[x] = Character.toUpperCase(array[x]);
      }
    }

    return new String(array);
  }

}

// or

import java.util.Arrays;
import java.util.stream.Collectors;

public class JadenCase {

  public String toJadenCase(String phrase) {
      if (null == phrase || phrase.length() == 0) {
          return null;
      }

      return Arrays.stream(phrase.split(" "))
                   .map(i -> i.substring(0, 1).toUpperCase() + i.substring(1, i.length()))
                   .collect(Collectors.joining(" "));
  }

}
