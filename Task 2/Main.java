class Main {
  public static boolean happy = true;

  public static void main(String[] args) {
    if (iAmHappy()) {
      System.out.println("I clap my hands");
    } else {
      System.out.println("I don't clap my hands");
    }
  }

  public static boolean iAmHappy() {
    if (happy) {
      return true;
    } else {
      return false;
    }
  }
}