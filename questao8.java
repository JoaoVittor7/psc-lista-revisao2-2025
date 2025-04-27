import java.util.Scanner;

public class Atividades {
    public static void main(String[] args) {

        Scanner q4 = new Scanner(System.in);
        int numero;


        System.out.println("Digite aqui um numero, o sistema vai verificar se o mesmo se trata de um numero par ou impar: ");
        numero = q4.nextInt();

        if(numero % 2 == 0)
        {System.out.println("O numero se trata de um numero par.");}
        else{System.out.println("numero impar.");}


        q4.close();
    }
}
