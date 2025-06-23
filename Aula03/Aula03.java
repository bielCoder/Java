package Aula03;

public class Aula03 {
    private String name;
    private String className;

    public Aula03(String name, String className) {
       
        this.name = name;
        this.className = className;
    }

    public static void main(String[] args) {
      
        Aula03 data = new Aula03("Gabriel", "Aula 03");
        System.out.println("Hello, " + data.name + " Seja bem vindo a " + data.className + "!");
    }
}
