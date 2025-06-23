package Aula04;

public class Aula04 {
    // primitive types

    private String name;
    private int age;
    private double height; 
    private boolean isStudent;
    private char initial;

    public Aula04(String name, int age, double height, boolean isStudent, char initial) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.isStudent = isStudent;
        this.initial = initial;
    }

    public static void main(String[] args) {
        Aula04 data = new Aula04("Gabriel", 20, 1.75, true, 'G');
        System.out.println("Hello, " + data.name + "! You are " + data.age + " years old, " +
                           "your height is " + data.height + "m, " +
                           "it is " + data.isStudent + " that you are a student, " +
                           "and your initial is '" + data.initial + "'.");
    }
}
