package Aula07;

public class Aula07 {
    double note1 = 7.5;
    double note2 = 8.0;

    private double calculateAverage(double note1, double note2) {
        return (note1 + note2) / 2;
    }

    public static void main(String[] args) {
        Aula07 aula = new Aula07();
        double average = aula.calculateAverage(aula.note1, aula.note2);
        System.out.println("The average is: " + average);
    }
}
