class Main {
  public static void main(String[] args) {
    System.out.println("Hello Davoud!");

    int number = 200;
    printNumberTo(number);
  }

  public static void printNumberTo(int n) {
    for (int i = 0; i <= n; i++) {
      System.out.println(i);
    }
  }

}