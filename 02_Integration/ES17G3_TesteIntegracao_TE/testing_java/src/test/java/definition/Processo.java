package definition;

import groovy.json.internal.LazyMap;

public class Processo {

    private static final String URL = "http://agapito-server.herokuapp.com/processos/";
    private static LazyMap listaCampos = new LazyMap();
    private static String ultimoCodigo;

    public static void AdicionarCampos(String campo, String valor) {

        listaCampos.put(campo, valor);
    }

    public static void LimparCampos() {

        listaCampos.clear();
    }

    public static LazyMap ObterCampos() {

        return listaCampos;
    }

    public static String ObterUrl() {

        return URL;
    }

    public static String ObterUltimoCodigo() {

        return ultimoCodigo;
    }

    public static void AtualizarUltimoCodigo(String id) {

        ultimoCodigo = id;
    }

}
