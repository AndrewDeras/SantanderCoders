package animais;

public class Gato {
    static int numeroDeGatos;

    private String nome;
    private String cor;
    private String corOlhos;
    private int idade;

    public Gato(String nome, String cor, String corOlhos, int idade) {
        this.nome = nome;
        this.cor = cor;
        this.corOlhos = corOlhos;
        this.idade = idade;

        numeroDeGatos ++;
    }

    void comer(){}
    void dormir(){}

    void soar(){
        System.out.println("Miau");
    }

    @Override
    public String toString() {
        return "Gato{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
