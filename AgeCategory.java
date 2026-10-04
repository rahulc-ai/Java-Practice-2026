public class AgeCategory {
  public static void main(String[] args) {
    int age = 17;
    if (age >= 60) {
      System.out.println("Senior Citizen");
    } else if (age >= 18) {
      System.out.println("Adult");
    } else if (age >= 13) {
      System.out.println("Teenager");
    } else {
      System.out.println("Child");
    }
  }
}