public class FabricaEletronico implements FabricaAbstrata {
    public Lixo criarLixo() {
        return new LixoEletronico();
    }

    public PontoColeta criarPontoColeta() {
        return new PontoColetaEletronico();
    }
}
