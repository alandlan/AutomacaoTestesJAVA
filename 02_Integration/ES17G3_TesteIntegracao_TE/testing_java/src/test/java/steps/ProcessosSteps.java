package steps;

import cucumber.api.PendingException;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import definition.Processo;
import org.junit.Assert;
import support.RESTSupport;
import groovy.json.internal.LazyMap;

public class ProcessosSteps {

    @Dado("^O usuario esta na pagina de processos$")
    public void oUsuarioEstaNaPaginaDeProcessos() {

        Processo.LimparCampos();
    }

    @E("^o usuario informa o valor \"([^\"]*)\" no campo \"([^\"]*)\"$")
    public void oUsuarioInformaOValorNoCampo(String valor, String campo) throws Throwable {
        Processo.AdicionarCampos(campo,valor);
    }

    @Quando("^o botao salvar for pressionado$")
    public void oBotaoSalvarForPressionado() {
        RESTSupport.executePost(Processo.ObterUrl(), Processo.ObterCampos());
        Processo.AtualizarUltimoCodigo(RESTSupport.key("id").toString());
    }

    @Entao("^a mensagem \"([^\"]*)\" deveria ser exibida$")
    public void aMensagemDeveriaSerExibida(String msg) throws Throwable {
        LazyMap msgJson = new LazyMap();

        msgJson.put("Registro gravado com sucesso.", 201);
        msgJson.put("Sucesso.", 200);
        msgJson.put("Sem informação.", 204);
        msgJson.put("Não autorizado.", 401);
        msgJson.put("Não encontrado.", 404);

        Assert.assertEquals(msgJson.get(msg), RESTSupport.getResponseCode());
    }

    @E("^o valor \"([^\"]*)\" deve ser exibido no campo \"([^\"]*)\" para o usuario$")
    public void oValorDeveSerExibidoNoCampoParaOUsuario(String valor, String campo) throws Throwable {
        Assert.assertEquals(valor, RESTSupport.key(campo));
    }

    @E("^o usuario quer ver o processo numero \"([^\"]*)\"$")
    public void oUsuarioQuerVerOProcessoNumero(String id) throws Throwable {
        Processo.AtualizarUltimoCodigo(id);
    }

    @Quando("^o botao visualizar for pressionado$")
    public void oUsuarioClicarEmVisualizar() {
        RESTSupport.executeGet(Processo.ObterUrl() + Processo.ObterUltimoCodigo() + ".json");
    }

    @Quando("^o botao atualizar for pressionado$")
    public void oUsuarioClicarEmAtualizar() {
        RESTSupport.executePut(Processo.ObterUrl() + Processo.ObterUltimoCodigo() + ".json", Processo.ObterCampos());
    }

    @Quando("^o botao excluir for pressionado$")
    public void oUsuarioClicarEmDeletar() {
        RESTSupport.executeDelete(Processo.ObterUrl() + Processo.ObterUltimoCodigo() + ".json");
    }
}
