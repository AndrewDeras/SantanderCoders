package animais;

public class Passaros {

    static int numeroDePassaros;

    private String nome;
    private String cor;
    private int idade;

    public Passaros(String nome, String cor, int idade) {
        this.nome = nome;
        this.cor = cor;
        this.idade = idade;
        numeroDePassaros ++;
    }


    @Override
    public String toString() {
        return "Passaros{" +
                "nome='" + nome + '\'' +
                '}';
    }

    void voar(){}
    void comer(){}

    void soar(){
        System.out.println("Piu piu");
    }
}
