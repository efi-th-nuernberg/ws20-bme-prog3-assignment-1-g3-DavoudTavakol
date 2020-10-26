class Main {
  public static void main(String[] args) {
    System.out.println("Hello Davoud!");

    int number = 200;
    printNumberTo(number);
  }

  public static void printNumberTo(int n) {
    for (int i = 1; i <= n; i++) {
      if (i % 5 == 0) {
        System.out.println(i + " Zahl ist durch 5 Teilbar!");
      }
      if (i % 10 == 9) {
        System.out.println(i + " Zahl endet mit einer 9!");
      }
      if ((i + i - 1) % 3 == 0) {
        System.out.println(i + " Zahl addiert mit vorgänger ist durch 3 teilbar!");
      } else {
        System.out.println(i);
      }
    }
  }

}