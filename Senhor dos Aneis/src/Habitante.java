public abstract class Habitante {

    //Atributos
    public static int contador = 0;
    protected int id;
    protected String nome;
    protected int idade;
    protected float energia;
    Arma arma;

    Habitante(){
        this.contador++;
        this.id = contador;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getEnergia() {
        return energia;
    }

    public void setEnergia(float energia) {
        this.energia = energia;
    }

    public Arma getArma() {
        return arma;
    }

    public void setArma(Arma arma) {
        this.arma = arma;
    }

    //Acoes
    public void atacar(){
        if(this.arma==null){
            System.out.println("Arma não adicionada para o herói");
        }else{
            System.out.println("Informações da arma: ");
            System.out.println("Nome: "+arma.getNomeArma());
            System.out.println("Mágica: "+arma.isMagica());

            if(arma.isMagica()){
                System.out.println("Ataque com arma mágica");
                this.energia -= 20;
                System.out.println("Energia após o ataque: "+this.energia);
            }else{
                System.out.println("Ataque com arma normal");
                this.energia -= 10;
                System.out.println("Energia após o ataque: "+this.energia);
            }
        }
    }

    public void mostraInfo(){
        System.out.println("\n");
        System.out.println("ID: "+this.id);
        System.out.println("Nome: "+this.nome);
        System.out.println("Idade: "+this.idade);
        System.out.println("Energia: "+this.energia);
    }
}
