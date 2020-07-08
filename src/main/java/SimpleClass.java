import java.util.Scanner;

public class SimpleClass {
  Scanner scanner = new Scanner(System.in);

  public void helloUser() {
    System.out.println("Please, enter your number");
    int userNumber = scanner.nextInt();
    if (userNumber > 7) System.out.println("Привет");
  }

  public void nameChecker() {
    String name = "Вячеслав";
    System.out.println("Please, enter your name: ");
    String nameForCheck = scanner.next();

    if (nameForCheck.equals(name)) {
      System.out.println("Привет, Вячеслав!");
    } else {
      System.out.println("Нет такого имени");
    }
  }

  public void elementsOfArray() {
    System.out.println("Please, enter size of array: ");
    int arraySize = scanner.nextInt();
    if (arraySize <= 0) System.out.println("Incorrect size of array!");
    int[] array = new int[arraySize];
    for (int i = 0; i < arraySize; i++) {
      System.out.println("Please, enter [" + i + "] argument of array: ");
      array[i] = scanner.nextInt();
    }
    System.out.println("Elements of array that multiple 3: ");
    for (int j = 0; j < arraySize; j++) {
      if (array[j] % 3 == 0) System.out.println(array[j]);
    }
  }
}
