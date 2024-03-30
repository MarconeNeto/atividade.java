import java.util.Scanner;

public class CustoMaças {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o número de maçãs compradas: ");
        int quantidade = scanner.nextInt();
        
        double custoTotal;
        if (quantidade < 12) {
            custoTotal = quantidade * 1.30;
        } else {
            custoTotal = quantidade * 1.00;
        }
        
        System.out.println("O custo total da compra é: R$" + custoTotal);
        
        scanner.close();
    }
}

