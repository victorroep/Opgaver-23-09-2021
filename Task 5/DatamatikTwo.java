class DatamatikTwo {
    //5.A
    static StudentTwo[] students = {new StudentTwo("Victor", 21, false, 'a'),
                            new StudentTwo("William", 22, false, 'b'),
                            new StudentTwo("Johan", 22, false, 'a'),
                            new StudentTwo("Simone", 36, true, 'a'),
                            new StudentTwo("Nicklas", 28, false, 'a'),
                            new StudentTwo("Emilio", 23, false, 'b'),
                            new StudentTwo("Christina", 25, true, 'a'),
                            new StudentTwo("Rasmus", 32, false, 'b'),
                            new StudentTwo("Emil", 19, false, 'a'),
                            new StudentTwo("Egonine", 26, true, 'b')};
    public static void main(String[] args) {
        studentName(students, 1);
        studentName(students, 4);
        studentName(students, 3);
        studentName(students, 6);
        findStudentByName(students, "Victor");
        findStudentByName(students, "Egonine");
        findStudentByName(students, "Emilio");
        findStudentByName(students, "Carl");
    }
    //5.B
    public static void studentName(StudentTwo[] _students, int index){
        System.out.println(_students[index].name);
    }
    //5.C
    public static void findStudentByName(StudentTwo[] _students, String name){
        for(int i = 0; i < _students.length; i++){
            if(_students[i].name == name){
                System.out.println(i);
                return;
            }
        }
        System.out.println("No students found with given name.");

    }
}
