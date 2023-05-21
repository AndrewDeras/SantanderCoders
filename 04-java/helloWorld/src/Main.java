import java.time.LocalDateTime;
import java.time.LocalDate;
import java.util.Locale;
import java.time.format.TextStyle;

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

        String nome = "Andrew";

        LocalDate hoje = LocalDate.now();
        Locale brasil = new Locale.Builder().setLanguage("pt").setRegion("BR").build();

        String diaSemana = hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil);

        LocalDateTime agora = LocalDateTime.now();

        String saudacao;

        if (agora.getHour() >= 0 && agora.getHour() < 12) {
            saudacao = "Bom dia";
        } else if (agora.getHour() >= 12 && agora.getHour() < 18) {
            saudacao = "Boa tarde";
        }else if (agora.getHour() >= 18 && agora.getHour() < 24){
            saudacao = "Boa noite";
        } else{
            saudacao = "Vamos continuar";
        }

        System.out.printf("Olá %s. Hoje é %s, %s.%n", nome, diaSemana, saudacao);

    }
}