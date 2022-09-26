public class Mago extends Habitante implements Cura,Feitico{
    private String cor;

    @Override
    public void curar() {
        float energia=this.getEnergia(); // Recuperando a energia atual do herói
        energia= (float) (energia+(energia*0.15)); // Modificando a energia atual do herói
        this.setEnergia(energia); // Setando a nova energia para o herói
        System.out.println("O herói foi curado"); // Informando que o herói foi curado
        System.out.println("Energia após a cura: "+this.getEnergia());
    }

    @Override
    public void lancaFeitico() {
        float energia=this.getEnergia(); // Recuperando a energia atual do herói
        energia= (float)(energia-(energia*0.1)); // Modificando a energia atual do herói
        this.setEnergia(energia); // Setando a nova energia para o herói
        System.out.println("O mago lançou um feitiço!"); // Informando que o mago lançou feitico
        System.out.println("Sua energia atual: "+this.getEnergia());
    }

    @Override
    public void atacar() {
        System.out.println(this.nome+" usa seu ataque!");
    }

    @Override
    public void mostraInfo() {
        System.out.println("-- INFORMAÇÕES DO MAGO --");
        super.mostraInfo();
        System.out.println("Tribo: "+this.cor);
        System.out.println("-------------------------");
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}
