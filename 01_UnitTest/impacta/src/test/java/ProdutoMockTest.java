import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ProdutoMockTest {

    private double valorProduto;

    @Before
    public void prepareTests(){
        valorProduto = 2300;
    }

    @Test
    public void ConsultarPreco(){
        ProdutoMock produtoMock = new ProdutoMock();
        boolean condicao = false;
        double precoProduto = this.valorProduto;
        double preco;

        preco = produtoMock.ConsultarValor();

        if(preco == precoProduto) condicao = true;

        Assert.assertTrue(condicao);
    }

    @Test
    public void ValidarQuantidadeParcelasValidas(){
        ProdutoMock produtoMock = new ProdutoMock();
        boolean expect = true;
        boolean actual;

        actual = produtoMock.ValidarNumeroParcelas(6);

        Assert.assertEquals(expect,actual);
    }

    @Test
    public void ValidarQuantidadeParcelasInvalidas(){
        ProdutoMock produtoMock = new ProdutoMock();
        boolean expect = false;
        boolean actual;

        actual = produtoMock.ValidarNumeroParcelas(18);

        Assert.assertEquals(expect,actual);
    }

    @Test
    public void ConsultarValorParcela(){
        ProdutoMock produtoMock = new ProdutoMock();
        double expect = 1150;
        double actual;

        actual = produtoMock.ValorDaParcelas(2300, 2);

        Assert.assertEquals(expect,actual, 0);
    }

}
