class TriangleExercises {
  String star = "*";

  void asterisk() {
    System.out.println("First task: print asterisk");
    System.out.println(star);
  }

  void horizontalLine(int n) {
    System.out.println("Second task: horizontal line");

    for (int i = 0; i < n; i ++) {
      System.out.print(star);
    }
    System.out.println("");
  }

  void verticalLine(int n) {
    System.out.println("Third task: vertical line");

    for (int i = 0; i < n; i ++) {
      System.out.println(star);
    }
  }

  void rightTriangle(int n) {
    System.out.println("Fourth task: right triangle");

    for (int i = 0; i < n; i ++) {
      for (int j = 0; j <= i; j ++) {
        System.out.print(star);
      }
      System.out.println("");
    }
  }
}
