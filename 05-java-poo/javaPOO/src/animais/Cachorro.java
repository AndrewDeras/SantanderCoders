package animais;

public class Cachorro {
    public String nome;
    public String cor;
    public String raca;
    public int idade;
    public double peso;
    public String estadoDeEspirito;

    public  void comer(){};

    public  void latir(){
        System.out.println("Latindo");
    }

    public String pegarBolinha(){
        return "Pegou a bolinha";
    }

    public String reacao(String acao) {
        if(acao.equals("carinho")){
            this.estadoDeEspirito = "feliz";
        }
        if(acao.equals("vai dormir")){
            this.estadoDeEspirito =  "triste";
        }

        return this.estadoDeEspirito;

    }
}
