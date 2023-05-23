package animais;

public class Cachorro {

    static int numeroDeCachorros;

    private String nome;
    private String cor;
    private String raca;
    private int idade;
    private double peso;
    private String estadoDeEspirito;


    public Cachorro(String nome, String cor, String raca, int idade, double peso, String estadoDeEspirito) {
        this.nome = nome;
        this.cor = cor;
        this.raca = raca;
        this.idade = idade;
        this.peso = peso;
        this.estadoDeEspirito = estadoDeEspirito;
        numeroDeCachorros ++;
    }

    public static int getNumeroDeCachorros() {
        return numeroDeCachorros;
    }

    public static void setNumeroDeCachorros(int numeroDeCachorros) {
        Cachorro.numeroDeCachorros = numeroDeCachorros;
    }

    public String getNome() {
        return this.nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getEstadoDeEspirito() {
        return estadoDeEspirito;
    }

    public void setEstadoDeEspirito(String estadoDeEspirito) {
        this.estadoDeEspirito = estadoDeEspirito;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void comer() {
    }

    public void latir() {
        System.out.println("Latindo");
    }

    public String pegarBolinha() {
        return "Pegou a bolinha";
    }

    @Override
    public String toString() {
        return "Cachorro{" +
                "nome='" + nome + '\'' +
                '}';
    }

    public String reacao(String acao) {
        // if(acao.equals("carinho")){
        // this.estadoDeEspirito = "feliz";
        // }
        // if(acao.equals("vai dormir")){
        // this.estadoDeEspirito = "triste";
        // }

        switch (acao) {
            case "carinho":
                this.estadoDeEspirito = "feliz";
                break;
            case "vai dormir":
                this.estadoDeEspirito = "bravo";
                break;
            case "pisar na patinha":
                this.estadoDeEspirito = "triste";
                break;
            default:
                this.estadoDeEspirito = "neutro";
                break;
        }
        return this.estadoDeEspirito;

    }
}
