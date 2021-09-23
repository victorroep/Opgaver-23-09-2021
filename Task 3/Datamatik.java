class Datamatik {
    //3.I
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Jesper", 30, false);
        //3.J
        Student student1 = new Student("Victor", 21, false, 'a');
        Student student2 = new Student("Simon", 21, false, 'a');
        //3.K
        System.out.println(teacher.name);
        //3.L
        System.out.println(student1.name + ", team: " + student1.datamatikerTeam);
        System.out.println(student2.name + ", team: " + student2.datamatikerTeam);
    }
}
