package homework1;

// Необходимо создать собственное исключение InvalidEmail.
// При попытке создать Account нужно выбрасывать собственное исключение,
// если в переданном адресе электронной почты нет символа '@'.
public class InvalidEmailExeption extends IllegalArgumentException {

  public InvalidEmailExeption(String email) {
    super("Строка не является e-mail: " + email);
  }
}
