
// import java.time.LocalDateTime;
// import java.lang.reflect.Array;
// import java.time.LocalDate;
// import java.util.Arrays;
// import java.util.Locale;
// import java.time.format.TextStyle;

public class Main {
    public static void main(String[] args) {
        // String nome = "Andrew";
        // int idade = 25;
        // System.out.println("Hello " + nome + " e tenho " + idade + " anos.");
        // if (idade > 18) System.out.println("É maior de idade");

        // boolean result = true;
        // int nota = 9;
        // String conceito = "";

        // if (nota >= 8) {
        // conceito = "MB";
        // }

        // switch (conceito) {
        // case "MB":
        // System.out.println("Aprovado");
        // break;
        // default:
        // System.out.println("Sem dados.");
        // }

        // ola , {nome}. Hoje é {dia da semana}, bom dia/tarde/noite

        // String nome = "Andrew";

        // LocalDate hoje = LocalDate.now();
        // Locale brasil = new
        // Locale.Builder().setLanguage("pt").setRegion("BR").build();

        // String diaSemana = hoje.getDayOfWeek().getDisplayName(TextStyle.FULL,
        // brasil);

        // LocalDateTime agora = LocalDateTime.now();

        // String saudacao;

        // if (agora.getHour() >= 0 && agora.getHour() < 12) {
        // saudacao = "Bom dia";
        // } else if (agora.getHour() >= 12 && agora.getHour() < 18) {
        // saudacao = "Boa tarde";
        // }else if (agora.getHour() >= 18 && agora.getHour() < 24){
        // saudacao = "Boa noite";
        // } else{
        // saudacao = "Vamos continuar";
        // }

        // System.out.printf("Ola %s. Hoje é %s, %s.%n", nome, diaSemana,
        // saudacao.toUpperCase());

        // for (int i = 1; i <= 10; i++) {
        // System.out.println("=========================");
        // for (int j = 0; j <= 10; j++) {
        // System.out.println(j + "x" + i + "=" + j * i);
        // }
        // }

        // int[] numeros = { 1, 2, 3, 4, 5 };

        // String[] letras = { "a", "b", "c", "d", "e" };

        // for (int i = 0; i < numeros.length; i++) {
        // System.out.println(numeros[i]);
        // }

        // System.out.println(Arrays.toString(letras));

        int[] randomNumbers = { 23, 43, 342, 657, 97, 77 };
        // int maior = randomNumbers[0];
        // int menor = randomNumbers[0];
        // int media = 0;

        // for (int i = 0; i < randomNumbers.length; i++) {
        //     if (randomNumbers[i] > maior) {
        //         maior = randomNumbers[i];
        //     }
        //     if (randomNumbers[i] < menor) {
        //         menor = randomNumbers[i];
        //     }
        //     media += randomNumbers[i];
        // }

        System.out.println(soma(randomNumbers));


    }

    public static int soma (int[] numbers){
        int soma = 0;
        for (int i = 0; i < numbers.length; i++) {
            soma += numbers[i];
        }
        return soma;
    }
}