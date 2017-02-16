class TriangleExercises {
  String star = "*";

  void asterisk() {
    System.out.println("First task: ");
    System.out.println(star);
  }

  void horizontalLine(int n) {
    System.out.println("Second task: ");

    for (int i = 0; i < n; i ++) {
      System.out.print(star);
    }
    System.out.println("");
  }

  void verticalLine(int n) {
    System.out.println("Third task: ");

    for (int i = 0; i < n; i ++) {
      System.out.println(star);
    }
  }
}
