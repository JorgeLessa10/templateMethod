import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/*
 ** created by: jorge.lessa
 */
class LocacaoPS4Test {

    @Test
    void deveRetornarRetornarValorFinal()
    {
        Jogo j1 = new Jogo("FIFA 22", 1.99);
        LocacaoPS4 locacaoPS4 = new LocacaoPS4();
        locacaoPS4.setJogo(j1);
        locacaoPS4.setQuantidadeDeDias(5);
        assertEquals(9.95, locacaoPS4.getValorFinal());
    }

    @Test
    void deveRetornarRetornarInformacoesDaLocacao()
    {
        Jogo j1 = new Jogo("FIFA 22", 1.99);
        LocacaoPS4 locacaoPS4 = new LocacaoPS4();
        locacaoPS4.setJogo(j1);
        locacaoPS4.setQuantidadeDeDias(5);
        assertEquals("Nome do jogo: FIFA 22, alugado por: 5 dias\n" +
                "Valor final da locação:  9.95", locacaoPS4.descricaoCompleta());
    }

}