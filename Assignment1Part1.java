public class Assignment1Part1 {
  public static void main(String[]args) {
    question1();
    question2();
    question3();
    question4();
    question5();
  }
  public static void question1() {
    System.out.println("Hello World!");
  }
  public static void question2() {
    System.out.println(" 22");
    System.out.println("2  2");
    System.out.println("  2");
    System.out.println(" 2");
    System.out.println("22222");
  }
  public static void question3() {
    System.out.println("n-1 for each n base");
    System.out.println("23_5 = 13_10");
    System.out.println("101_2 = 13_10");
    System.out.println("10101011_2 + 10010001_2 = 100111100_2");
    System.out.println("10101011_2 + 10010001_2 = 179_10 + 145_10 = 324_10");
    System.out.println("11010010_2 + 11000101_2 = 110010111_2");
    System.out.println("110010111_2 = 407_10");
  }
  public static void question4() {
    System.out.println((false||false)&&(true&&(!false)));
    System.out.println(false&&(true&&true));
    System.out.println(false&&true);
    System.out.println(false);
  }
  public static void question5() {
    int x = 1;  // x = 1
    int y = 2;  // y = 2
    x = y;      // x = 2
    y = x;      // y = 2
    // so that simply wont work.
  }
}