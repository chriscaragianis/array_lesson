class ArrayTest {

  public static void main(String[] args) {
    //Declare 2 array variables
    //Initialize one using 'new'
    //Initialize other using literals
    //Access elements
    //Print an array variable
    //Print an array with a loop
    //"Spooky action at a distance"
    //Passing by value and passing by reference
  }

  //Changing a primitive type in a method
  public static void intChanger(int input) {
    input = -5;
  }

  //A bad method with several problems
  public static void arrayChanger(int[] input) {
    for (int i = 0; i < input.length; i++) {
      input[i] = -5;
    }
  }

  //A better idea
  public static int[] goodArrayChanger(int[] input) {
    int[] output = new int[input.length];
    for (int i = 0; i < input.length; i++) {
      output[i] = -5;
    }
    return output;
  }
}
