public class FabricaComum implements  FabricaAbstrata {
    public Lixo criarLixo() {
        return new LixoComum();
    }

    public PontoColeta criarPontoColeta() {
        return new PontoColetaComum();
    }
}
