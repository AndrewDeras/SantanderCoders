import animais.Cachorro;

public class Main {
    public static void main(String[] args) {

        Cachorro cachorro1 =
                new Cachorro("Rambo", "Branco", "Pitbull",7,15.5,"feliz");
        Cachorro cachorro2 =
                new Cachorro("Tontin", "Branco", "Pitbull",7,15.5,"feliz");


        System.out.println(cachorro1.toString());
        System.out.println(cachorro2.toString());

        System.out.println(Cachorro.getNumeroDeCachorros());

    }
}