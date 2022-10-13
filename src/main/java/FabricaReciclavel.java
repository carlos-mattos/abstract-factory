public class FabricaReciclavel implements FabricaAbstrata {
    public Lixo criarLixo() {
        return new LixoReciclavel();
    }

    public PontoColeta criarPontoColeta() {
        return new PontoColetaReciclavel();
    }
}
