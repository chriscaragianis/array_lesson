class ArrayTest {

  public static void main(String[] args) {
    //Declare 2 array variables
    int[] myArray;
    int[] myOtherArray = {2, 3, 5, 7, 11};

    //Initialize one using 'new'
    myArray = new int[10];
    //myArray = new int[11];
    //Initialize other using literals

    //Access elements
      //retrieve
      int fourthPrime = myOtherArray[3];
      System.out.println(fourthPrime);
      //assign to
      myOtherArray[3] = 777;
      System.out.println(myOtherArray[3]);
    //Print an array variable
    System.out.println(myArray[0]);
    //Print an array with a loop
    for (int i = 0; i < myArray.length; i++) {
      System.out.print(myArray[i] + ", ");
    }

    for (int v : myArray) {
      System.out.print(v + ", ");
    }
    //"Spooky action at a distance"
    //Passing by value and passing by reference:
    //    changing the array to all -5s
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
