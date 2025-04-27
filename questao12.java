import java.util.Scanner;

public class Atividades {
    public static void main(String[] args) {

        Scanner q4 = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        String palavra = q4.nextLine();

        String invertida = new StringBuilder(palavra).reverse().toString();

        if (palavra.equals(invertida)) {
        System.out.println("É um palíndromo!");} 
        else {System.out.println("Não é um palíndromo.");}


        q4.close();
    }
}
