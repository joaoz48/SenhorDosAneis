public class Anao extends Habitante implements Mineracao{
    private float altura;
    private String reino;

    @Override
    public void atacar() {
        System.out.println(this.nome+" usa seu ataque!");
        super.atacar();
    }

    @Override
    public void mostraInfo() {
        System.out.println("-- INFORMAÇÕES DO ANÃO --");
        //Usando o super conseguimos reaproveitar o mostraInfo de habitantes
        super.mostraInfo();
        // Agora adicionamos as particularidades do anão
        System.out.println("Altura: "+this.altura);
        System.out.println("Reino: "+this.reino);
        System.out.println("-------------------------");
    }

    @Override
    public void minerar() {
        System.out.println(this.nome+" comeca a minerar!");
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public String getReino() {
        return reino;
    }

    public void setReino(String reino) {
        this.reino = reino;
    }

}
