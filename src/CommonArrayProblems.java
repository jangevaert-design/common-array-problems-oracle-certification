public class CommonArrayProblems {

  public static void main(String[] args) {
    int[] numbers = {1, 2, 3, 4, 5};
    for (int i = 1; i < numbers.length; i++) {
      System.out.println(i + "-" + numbers[i]);//prints 1-2 then 2-3 then 3-4 then 4-5
      //do not forget that arrays start from index 0.
    }

    for (int i = 1; i <= numbers.length ; i++) {
      System.out.println(i + "-" + numbers[i]);//throws ArrayOutOfBoundsException because of <=
    }

    //int[20] nums = ... Give the size of the array only at initialization or it will not compile.

    //int size = numbers.length(); will not compile because length in arrays is a field and not
    //a method (like with Strings).

    //numbers.length = 10; does not compile because you can only set an array length during initialization.
  }
}
