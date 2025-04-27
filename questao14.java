import java.util.Scanner;

public class Atividades {
    public static void main(String[] args) {

        Scanner q4 = new Scanner(System.in);

        Double nota;

        System.out.println("Digite aqui a nota: ");
        nota = q4.nextDouble();

        if(nota>=6) 
        {System.out.println("Aluno aprovado!");}
        else{System.out.println("Aluno reprovado.");}

        q4.close();
    }
}


