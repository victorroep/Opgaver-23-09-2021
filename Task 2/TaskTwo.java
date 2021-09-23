class TaskTwo {
  public static boolean happy = true;

  public static void main(String[] args) {
    if (iAmHappy()) {
      System.out.println("I clap my hands");
    } else {
      System.out.println("I don't clap my hands");
    }
    System.out.println(sum(1,5));
    System.out.println(capitalize("hej med dig"));
    System.out.println(detectFirstCase("Asd"));
    System.out.println(detectFirstCase("asd"));
  }
  //2.A
  public static boolean iAmHappy() {
    if (happy) {
      return true;
    } else {
      return false;
    }
  }
  //2.B
  public static int sum(int a, int b) {
    return a + b;
  }
  //2.C
  public static String capitalize(String string){
    return string.toUpperCase();
  }
  //2.D
  public static boolean detectFirstCase(String string){
    return Character.isUpperCase(string.charAt(0));
  }
}