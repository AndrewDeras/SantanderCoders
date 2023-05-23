import animais.Cachorro;

public class Main {
    public static void main(String[] args) {

        Cachorro cachorro1 = new Cachorro();
        cachorro1.nome = "Rocky";
        cachorro1.cor = "marrom";
        cachorro1.raca = "chihuahua";
        cachorro1.idade = 6;
        cachorro1.peso = 20.2;

        System.out.println("o cachorro está " + cachorro1.reacao("vai dormir"));
    }
}