class TaskFour {
    // 4.A
    static int[] intArray = { 0, -20, 3, 5, 1, 19 };
    static String[] stringArray = { "String a", "String b", "String c" };
    static boolean[] boolArray = { true, true, false, true, false };

    public static void main(String[] args) {
        printStrings(stringArray);
        System.out.println(sumInts(intArray));
        System.out.println(average(intArray));
        for(int i = 0; i < sortArray(intArray).length; i++){
            System.out.println(sortArray(intArray)[i]);
        }
    }

    // 4.B
    public static void printStrings(String[] strings) {
        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);
        }
    }

    // 4.C
    public static int sumInts(int[] ints) {
        int container = 0;
        for (int i = 0; i < ints.length; i++) {
            container += ints[i];
        }
        return container;
    }

    // 4.D
    public static float average(int[] ints) {
        return sumInts(ints) / ints.length;
    }

    // 4.E
    public static int[] sortArray(int[] ints) {
        for (int i = 0; i < ints.length; i++) {
            for (int e = 0; e < ints.length; e++) {
                int temp = ints[i];
                if (ints[e] > ints[i]) {
                    ints[i] = ints[e];
                    ints[e] = temp;
                }
            }
        }
        return ints;
    }
}
