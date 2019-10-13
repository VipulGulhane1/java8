import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Test {

 public static final List<String> VALUES = Arrays.asList("AA", "AB", "BC", "CD", "AE");

 public static void main(String args[]) {

  Predicate<String> containsLetterA = VALUES -> VALUES.contains("AB");
  for (String i : VALUES) {
   System.out.println(containsLetterA.test(i));
  }
 }

}
