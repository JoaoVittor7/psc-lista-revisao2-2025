import java.util.Scanner;

public class Atividades {
    public static void main(String[] args) {

        Scanner q4 = new Scanner(System.in);
        int idade;

        System.out.println("Digite abaixo sua idade: ");
        idade = q4.nextInt();


        if(idade>=18)
        {System.out.println("O usuario e maior de idade.");}
        else{System.out.println("Menor de idade.");}

        
        q4.close();
    }
}
