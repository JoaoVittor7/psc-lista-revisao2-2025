import java.util.Scanner;

public class Atividades {
    public static void main(String[] args) {

        Scanner q4 = new Scanner(System.in);

        Double salario, imposto;

        System.out.print("Digite aqui o valor do salario: R$");
        salario = q4.nextDouble();

        if(salario<=2259.20)
        {imposto = 0.0;}
        else if(salario>=3500 && salario<4664.88)
        {imposto = (salario/100 * 15);}
        else{imposto = (salario/100 * 27.5);}

        System.out.println("O valor do imposto de renda a ser pago e de: R$"+imposto);

        q4.close();
    }
}


