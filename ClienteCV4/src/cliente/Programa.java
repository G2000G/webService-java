package cliente;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Conversor conversor = new ConversorService().getConversorPort();
        Scanner in = new Scanner(System.in);

        System.out.println("Bem-vindo ao Conversor de Temperaturas, digite: \n1 para converter de Celsius para Kelvin: \n2 para converter de Kelvin para Celsius:\n ");
        int tipo = in.nextInt();

        System.out.println("Digite a temperatura que deseja converter: ");
        int temp = in.nextInt();

        System.out.println(conversor.conversor(tipo,temp));
    }

}