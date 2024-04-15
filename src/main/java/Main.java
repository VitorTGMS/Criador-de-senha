import java.util.*;

public class Main {
  public static void main(String[] args) {
    StringBuilder senha = new StringBuilder();
    Scanner sc = new Scanner(System.in);

    String sim = "!@#$%&*()_+-=,./:;<>?[]{}^|~`";
    String mai = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    String min = "abcdefghijklmnopqrstuvwxyz";
    String num = "0123456789";
    String[] car = { sim, mai, min, num };// bibliotecas para senha

    Random ran = new Random();

    for (int i = 0; i < 12; i++) {
      int a = ran.nextInt(car.length);// escolhe uma das bibliotecas
      int b = ran.nextInt(car[a].length());// escolhe um digito dentro da biblioteca
      senha.append(car[a].charAt(b));// adiciona o digito escolhido a senha
    }

    System.out.println(senha);
  }
}