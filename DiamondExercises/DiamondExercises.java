class DiamondExercises {
  String asterisk = "*";

  void centeredDiamond(int n) {
    System.out.println("First diamond task: centered triangle");

    for (int i = 1; i <= n; i += 2) {
      for (int k = 0; k < (4 - i / 2); k ++) {
        System.out.print(" ");
      }
      for (int j = 0; j < i; j ++) {
        System.out.print(asterisk);
      }
      System.out.println("");
    }
  }
}
