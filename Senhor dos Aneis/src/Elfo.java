public class Elfo extends Habitante implements Cura{
    private String tribo;

    @Override
    public void curar() {
        float energia=this.getEnergia(); // Recuperando a energia atual do herói
        energia= (float) (energia+(energia*0.15)); // Modificando a energia atual do herói
        this.setEnergia(energia); // Setando a nova energia para o herói
        System.out.println("O herói foi curado"); // Informando que o herói foi curado
        System.out.println("Energia após a cura: "+this.getEnergia());
    }

    @Override
    public void atacar() {
        System.out.println(this.nome+" usa seu ataque!");
        super.atacar();
    }
    @Override
    public void mostraInfo() {
        System.out.println("-- INFORMAÇÕES DO ELFO --");
        super.mostraInfo();
        System.out.println("Tribo: "+this.tribo);
        System.out.println("-------------------------");
    }

    public void viajar(){
        System.out.println(this.nome+" esta viajando!");
    }

    public void setTribo(String tribo) {
        this.tribo = tribo;
    }
}
