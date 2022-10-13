public class Morador {

    private Lixo lixo;
    private PontoColeta pontoColeta;

    public Morador(FabricaAbstrata fabrica) {
        this.lixo = fabrica.criarLixo();
        this.pontoColeta = fabrica.criarPontoColeta();
    }

    public String agendarColeta() {
        return this.lixo.agendarColeta();
    }

    public String buscarPontoDeColeta() {
        return this.pontoColeta.buscarPonto();
    }

    public String avaliarPontoDeColeta() {
        return this.pontoColeta.avaliarPonto();
    }

}
