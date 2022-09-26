public class TerraMedia {
    private Habitante[] herois = new Habitante[5];

    public void addHabitante(Habitante habitante){
        for(int i=0;i<herois.length;i++){
            // Conferir se aquela posição i está vazia
            if(herois[i]==null){
                herois[i]=habitante;
                break;
            }
        }
    }

    public void listarHabitantes(){
        for(int i=0; i<herois.length; i++){

            // Verificando se existe um habitante naquela posição i
            if(herois[i]!=null) {

                // Verificando de qual tipo é aquele habitante
                if (herois[i] instanceof Anao) {
                    // Realizando casting para Anao
                    // herois[i] -> Habitante
                    Anao auxAnao = (Anao) herois[i];
                    auxAnao.mostraInfo();
                    auxAnao.minerar();
                    auxAnao.atacar();
                } else if (herois[i] instanceof Elfo) {
                    // Realizando casting para Elfo
                    Elfo auxElfo = (Elfo) herois[i];
                    auxElfo.mostraInfo();
                    auxElfo.atacar();
                    auxElfo.viajar();
                    auxElfo.curar();
                } else {
                    // Realizando casting para Mago
                    Mago auxMago = (Mago) herois[i];
                    auxMago.mostraInfo();
                    auxMago.lancaFeitico();
                    auxMago.atacar();
                    auxMago.curar();

                }

            }
        }
    }
}
