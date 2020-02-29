public class ProdutoMock {

    private double ValorProduto = 2300;
    private int Parcelas = 12;

    public double ConsultarValor(){
        double res = this.ValorProduto;

        System.out.println("Valor do Produto: " + ValorProduto );

        return res;
    }

    public boolean ValidarNumeroParcelas(int parcelas){
        int parcelasMaximo = this.Parcelas;
        boolean permitido = false;

        if (parcelas < parcelasMaximo) {
            permitido = true;
            System.out.println("Número de parcelas válido");
        }else{
            System.out.println("Número de parcelas inválido");
        }
        return permitido;
    }

    public double ValorDaParcelas(double preco, int parcelas){

        double precoEstoque = ConsultarValor();
        double valorParcela = 0;
        boolean parcelasValida = ValidarNumeroParcelas(parcelas);

        if(precoEstoque == preco && parcelasValida){
            valorParcela = preco / parcelas;
            System.out.println("Valor das parcelas é" + valorParcela);
        }else{
            System.out.println("Valor do produto ou parcela inválidos");
        }

        return valorParcela;

    }

}

