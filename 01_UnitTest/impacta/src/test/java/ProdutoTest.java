import org.junit.Assert;
import org.junit.Test;

public class ProdutoTest {

    //Teste Unitario
    @Test
    public void testValorNegativo(){

        Produto produto = new Produto();
        boolean actual;
        boolean expect = true;

        actual = produto.verificarValorNegativo(-2);

        Assert.assertEquals(expect,actual);
    }

    @Test
    public void testValorPositivo(){

        Produto produto = new Produto();
        boolean actual;
        boolean expect = false;

        actual = produto.verificarValorNegativo(2);

        Assert.assertEquals(expect, actual);
    }

    //Condição
    @Test
    public void testDescontoAceitavelProduto(){

        Produto produto = new Produto();
        float preco = 1500;
        float desconto = 300;
        boolean actual;
        boolean expext = true;

        actual = produto.verificarDesconto(preco,desconto);

        Assert.assertEquals(expext,actual);

    }

    @Test
    public void testDescontoNaoAceitavelProduto(){

        Produto produto = new Produto();
        float preco = 1500;
        float desconto = 2300;
        boolean actual;
        boolean expext = false;

        actual = produto.verificarDesconto(preco,desconto);

        Assert.assertEquals(expext,actual);

    }



}
