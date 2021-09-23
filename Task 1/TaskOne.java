class TaskOne {
    public static void main(String[] args) {
        printEmptyLine();
        print("Gnom");
        printInfo("Victor","21");
    }
    //1.B
    public static void printEmptyLine() {
		System.out.println("");
	}
    //1.C
    public static void print(String s){
        System.out.println(s);
    }
    //1.D
    public static void printInfo(String name, String age){
        System.out.println("Hello, my name is " + name + ". I am " + age + " years old.");
    }
}