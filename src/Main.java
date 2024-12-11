import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // --------------------- Aula 01
//      NumberFormat conversao = NumberFormat.getCurrencyInstance();
//      String valorProd = conversao.format(120.80);
//      System.out.println(valorProd);


        // ------------------- Aula 02
//        int a = 4;
//        int b = 5;
//        System.out.println(a > b);


        // ------------------- Aula 03
//        precoProd = R$ 40,00
//        Comprar somente se o valor form entre R$ 20 e R$ 30
//        int precoProduto = 40;
//        boolean comprar = precoProduto >=20 && precoProduto <= 30;
//        System.out.println(comprar);


        // ------------------- Aula 04
//        boolean temEmprego = true;
//        boolean temEmpresa = false;
//        boolean temEntrada = true;
//        boolean podefinanciar = (temEmprego || temEmpresa) && temEntrada;
//        System.out.println(podefinanciar);


        // ------------------- Aula 05
//        int valorCarro = 80_000;
//        if(valorCarro > 100_000)
//            System.out.println("Não comprar! O carro está com o valor acima da tabela");
//        else if (valorCarro >= 90_000 && valorCarro <= 100_000)
//            System.out.println("Comprar o carro! O valor está dentro do esperado");
//        else
//            System.out.println("Não comprar! O carro está com o valor abaixo da tabela");


        // ------------------- Aula 06
//        int ingresso = 550;

//        String terAcesso = "Pista";
//        if (ingresso >=500)
//            terAcesso = "VIP";
//        String terAcesso = ingresso >= 500 ? "VIP" : "Pista";

//        System.out.println(terAcesso);




        // ------------------- Desafio
        Scanner numeroDigitado = new Scanner(System.in);
        System.out.println("Digite um numero:");
        int numero = numeroDigitado.nextInt();

        int qtdNumeros = String.valueOf(Math.abs(numero)).length();

        if (qtdNumeros == 1)
            System.out.println("O numero digitado tem 1 digito");
        else if (qtdNumeros == 2)
            System.out.println("O numero digitado tem 2 digitos");
        else if (qtdNumeros == 3)
            System.out.println("O numero digitado tem 3 digitos");
        else if (qtdNumeros == 4)
            System.out.println("O numero digitado tem 4 digitos");
        else if (qtdNumeros == 5)
            System.out.println("O numero digitado tem 5 digitos");
        else
            System.out.println("O numero digitado tem mais que 5 digitos");


//        System.out.println("O numero digitado tem: " + qtdNumeros + " Digitos");
    }
}