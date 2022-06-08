import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/*
 ** created by: jorge.lessa
 */
class LocacaoPS3Test {

    @Test
    void deveRetornarRetornarValorFinal()
    {
        Jogo j1 = new Jogo("FIFA 22", 1.99);
        LocacaoPS3 locacaoPS3 = new LocacaoPS3();
        locacaoPS3.setJogo(j1);
        locacaoPS3.setQuantidadeDeDias(5);
        assertEquals(8.955, locacaoPS3.getValorFinal());
    }

    @Test
    void deveRetornarRetornarInformacoesDaLocacao()
    {
        Jogo j1 = new Jogo("FIFA 22", 1.99);
        LocacaoPS3 locacaoPS3 = new LocacaoPS3();
        locacaoPS3.setJogo(j1);
        locacaoPS3.setQuantidadeDeDias(5);
        assertEquals("Nome do jogo: FIFA 22, alugado por: 5 dias\n" +
                "Valor final da locação:  8.955", locacaoPS3.descricaoCompleta());
    }

}