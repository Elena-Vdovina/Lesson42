package homework2;

// Создайте класс Rectangle (прямоугольник).
// При создании класс должен получать длины сторон. Сохраните их в памяти как поля (атрибуты)
// класса "длина" и "ширина".
public class Rectangle {

  private final String length;

  private final String width;

  public Rectangle(String length, String width) {
    this.length = length;
    this.width = width;
  }

  @Override
  public String toString() {
    return String.format("%s x %s", length, width);
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (!(obj instanceof Rectangle other)) {
      return false;
    }
    return this.length.equalsIgnoreCase(other.length) && this.width.equalsIgnoreCase(other.width);
  }
}
