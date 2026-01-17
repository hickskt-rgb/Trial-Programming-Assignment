// Kamarre Hicks
import java.util.Scanner;

publc class CMSC401_A0 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int numLines = sc.nextInt();

    for (int i = o; i < numLines; i++) {
      int n = sc.nextInt();
      int[] numbers = new int[n - 2];

      for (int j = 0; j < n - 2; j++) {
        numbers[j] = sc.nextInt();
      }

      int x = sc.nextInt();
      int y = sc.nextInt();

      int min = Math.min(numbers[x - 1], numbers[y - 1 ]);
      System.out.println(min);
    }

    sc.close();
  }
}
  
