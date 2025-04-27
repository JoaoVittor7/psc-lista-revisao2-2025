import java.util.Scanner;

public class Atividades {
    public static void main(String[] args) {

        Scanner q4 = new Scanner(System.in);
        int jogadorUm, jogadorDois;

        System.out.println("Escolha oque vai jogar Jogador Um ( 1 - Pedra, 2 - papel ou 3 - tesoura):");
        jogadorUm = q4.nextInt();

        System.out.println("Escolha oque vai jogar Jogador Dois ( 1 - Pedra, 2 - papel ou 3 - tesoura):");
        jogadorDois = q4.nextInt();

        if(jogadorUm == jogadorDois)
        {System.out.println("Empate!");}

        else if(jogadorUm == 1 && jogadorDois == 3||
                (jogadorUm == 2 && jogadorDois == 1)||
                  (jogadorUm == 3 && jogadorDois == 2))
        {System.out.println("Jogador Um foi o vencedor.");}
        else{System.out.println("Jogador Dois foi o vencedor");}        

        q4.close();
    }
}
