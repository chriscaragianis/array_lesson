class StringArray {

  public static void main(String[] args) {
    String[] names = {"Chris", "joe", "StopSign",
                      "Werm"};
    System.out.println("Table of customers\tName");
    System.out.println("---------------------------------");
    for (String v : names) {
      System.out.println("\t\t\t" + v);
    }

  }
}
