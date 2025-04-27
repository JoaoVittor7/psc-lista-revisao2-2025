import java.util.Scanner;

public class Atividades {
    public static void main(String[] args) {

        Scanner q4 = new Scanner(System.in);
        Double valorProduto, desconto;

        System.out.println("Digite aqui o valor do produto: ");
        valorProduto = q4.nextDouble();

        System.out.println("Digite aqui a porcentagem do desconto: ");
        desconto = q4.nextDouble();

        Double ProdutocomDesconto = valorProduto - (valorProduto*desconto/100);

        System.out.println("O valor final do produto e de: "+ProdutocomDesconto);

        q4.close();
    }
}
