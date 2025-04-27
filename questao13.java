import java.util.Scanner;

public class Atividades {
    public static void main(String[] args) {

        Scanner q4 = new Scanner(System.in);

        int numeroUm, numeroDois, numeroTres, maior;

        System.out.println("Digite o primeiro numero: ");
        numeroUm = q4.nextInt();

        System.out.println("Digite o segundo numero: ");
        numeroDois = q4.nextInt();

        System.out.println("Digite o terceiro numero: ");
        numeroTres = q4.nextInt();

        if(numeroUm>numeroDois && numeroUm>numeroTres)
        {maior = numeroUm;}

        else if(numeroDois > numeroUm && numeroDois > numeroTres)
        {maior = numeroDois;}

        else{maior = numeroTres;}

        System.out.println("O maior numero digitado foi: "+maior);

        q4.close();
    }
}


