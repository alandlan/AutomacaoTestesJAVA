public class Produto {

    public boolean verificarValorNegativo(int Valor){
        boolean res = false;
        if (Valor < 0) {
            res = true;
        }
        System.out.println(res);
        return res;
    }

    public boolean verificarDesconto(float Preco, float Desconto){

        boolean res = false;

        if(Preco > Desconto) {
            res = true;
            System.out.println("Desconto aceitável");
        }else{
            System.out.println("Desconto NÃO aceitável");
        }

        return res;
    }
}

