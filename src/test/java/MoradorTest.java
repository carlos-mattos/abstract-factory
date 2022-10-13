import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoradorTest {

    @Test
    void deveAgendarColetaLixoComum() {
        FabricaAbstrata fabrica = new FabricaComum();
        Morador morador = new Morador(fabrica);
        assertEquals("Seu pedido de coleta de lixo COMUM foi agendado!", morador.agendarColeta());
    }

    @Test
    void deveAgendarColetaLixoEletronico() {
        FabricaAbstrata fabrica = new FabricaEletronico();
        Morador morador = new Morador(fabrica);
        assertEquals("Seu pedido de coleta de lixo ELETRONICO foi agendado!", morador.agendarColeta());
    }

    @Test
    void deveAgendarColetaLixoReciclavel() {
        FabricaAbstrata fabrica = new FabricaReciclavel();
        Morador morador = new Morador(fabrica);
        assertEquals("Seu pedido de coleta de lixo RECICLAVEL foi agendado!", morador.agendarColeta());
    }

    @Test
    void deveBuscarPontoDeColetaComum() {
        FabricaAbstrata fabrica = new FabricaComum();
        Morador morador = new Morador(fabrica);
        assertEquals("Endereco do ponto lixo COMUM - Rua exemplo, bairro exemplo, numero exemplo", morador.buscarPontoDeColeta());
    }

    @Test
    void deveBuscarPontoDeColetaEletronico() {
        FabricaAbstrata fabrica = new FabricaEletronico();
        Morador morador = new Morador(fabrica);
        assertEquals("Endereco do ponto lixo ELETRONICO - Rua exemplo, bairro exemplo, numero exemplo", morador.buscarPontoDeColeta());
    }

    @Test
    void deveBuscarPontoDeColetaReciclavel() {
        FabricaAbstrata fabrica = new FabricaReciclavel();
        Morador morador = new Morador(fabrica);
        assertEquals("Endereco do ponto lixo RECICLAVEL - Rua exemplo, bairro exemplo, numero exemplo", morador.buscarPontoDeColeta());
    }

    @Test
    void deveAvaliarPontoDeColetaComum() {
        FabricaAbstrata fabrica = new FabricaComum();
        Morador morador = new Morador(fabrica);
        assertEquals("Avalicao ponto lixo COMUM registrado", morador.avaliarPontoDeColeta());
    }

    @Test
    void deveAvaliarPontoDeColetaEletronico() {
        FabricaAbstrata fabrica = new FabricaEletronico();
        Morador morador = new Morador(fabrica);
        assertEquals("Avalicao ponto lixo ELETRONICO registrado", morador.avaliarPontoDeColeta());
    }

    @Test
    void deveAvaliarPontoDeColetaReciclavel() {
        FabricaAbstrata fabrica = new FabricaReciclavel();
        Morador morador = new Morador(fabrica);
        assertEquals("Avalicao ponto lixo RECICLAVEL registrado", morador.avaliarPontoDeColeta());
    }
}