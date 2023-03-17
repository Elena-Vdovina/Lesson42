package homework2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// При попытке сравнить два прямоугольника они должны оказываться одинаковыми, если сами
// прямоугольники как геометрические фигуры равны - если их можно совместить, повернув и наложив
// друг на друга.
public class CompareRunner {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String l1 = br.readLine();
    String w1 = br.readLine();
    String l2 = br.readLine();
    String w2 = br.readLine();
    Rectangle r1 = new Rectangle(l1, w1);
    Rectangle r2 = new Rectangle(l2, w2);
    Rectangle r3 = new Rectangle(w2, l2);
    if (r1.equals(r3)) {
      System.out.println("Прямоугольник " + r1.toString() + " == прямоугольнику " +
          r2.toString() + "\n");
    } else {
      System.out.println("Прямоугольник " + r1.toString() + " != прямоугольнику " +
          r2.toString() + "\n");
    }
  }
}
