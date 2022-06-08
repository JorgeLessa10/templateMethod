/*
 ** created by: jorge.lessa
 */
public class LocacaoPS3 extends Locacao{
    @Override
    public Double getValorFinal() {
        return this.calcularValor() * 0.9;
    }
}
