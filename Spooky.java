import java.util.Arrays;

class Spooky {

  public static void main(String[] args) {
    int[] a = {5,5,5,5,5};
    int[] b = {7,7,7,7,7};

    System.out.println("A is " + Arrays.toString(a) + " and B is "
                       + Arrays.toString(b));
    arrayCopy(a, b);
    System.out.println("Assigning B to A (using arrayCopy)");
    System.out.println("A is " + Arrays.toString(a) + " and B is "
                       + Arrays.toString(b));

    b[0] += 2;
    System.out.println("Add two to B");
    System.out.println("A is " + Arrays.toString(a) + " and B is "
                       + Arrays.toString(b));

  }

  public static void arrayCopy(int[] a, int[] b) {
    //Makes the contents a match the content of b
    for (int i = 0; i < b.length; i++) {
      a[i] = b[i];
    }
  }
}
