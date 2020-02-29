#language: pt
  @run
  Funcionalidade: Realizando Funcoes Basicas na Classe de Processo.

    Cenario de Fundo:
      Dado O usuario esta na pagina de processos

    Cenario: POST com campo preenchidos corretamente
      E o usuario informa o valor "257" no campo "vara"
      E o usuario informa o valor "7001245.8.23-001" no campo "numero_processo"
      E o usuario informa o valor "Tutela Antecipada" no campo "natureza"
      E o usuario informa o valor "Alberto da Cunha" no campo "partes"
      E o usuario informa o valor "N" no campo "urgente"
      E o usuario informa o valor "N" no campo "arbitramento"
      E o usuario informa o valor "Valmir Farias" no campo "assistente_social"
      E o usuario informa o valor "2019-02-12" no campo "data_entrada"
      E o usuario informa o valor "2020-01-20" no campo "data_saida"
      E o usuario informa o valor "2019-08-13" no campo "data_agendamento"
      E o usuario informa o valor "Julgado" no campo "status"
      E o usuario informa o valor "O juiz negou provimento ao recurso" no campo "observacao"
      Quando o botao salvar for pressionado
      Entao a mensagem "Registro gravado com sucesso." deveria ser exibida
      E o valor "257" deve ser exibido no campo "vara" para o usuario

    Esquema do Cenario: GET com campos preenchidos corretamente
      E o usuario quer ver o processo numero <id>
      Quando o botao visualizar for pressionado
      Entao a mensagem "<mensagem>" deveria ser exibida

      Exemplos:
      | id     | mensagem        |
      | 7      | Sucesso.        |
      | 321332 | Não encontrado. |

    Cenario: PUT com todos os campos preenchidos corretamente
      E o usuario quer ver o processo numero "7"
      E o usuario informa o valor "257" no campo "vara"
      E o usuario informa o valor "7001245.8.23-001" no campo "numero_processo"
      E o usuario informa o valor "Tutela Antecipada" no campo "natureza"
      E o usuario informa o valor "Alberto da Cunha" no campo "partes"
      E o usuario informa o valor "N" no campo "urgente"
      E o usuario informa o valor "N" no campo "arbitramento"
      E o usuario informa o valor "Valmir Farias de Sá" no campo "assistente_social"
      E o usuario informa o valor "2019-02-12" no campo "data_entrada"
      E o usuario informa o valor "2020-01-20" no campo "data_saida"
      E o usuario informa o valor "2019-08-13" no campo "data_agendamento"
      E o usuario informa o valor "Julgado" no campo "status"
      E o usuario informa o valor "O juiz negou provimento ao recurso" no campo "observacao"
      Quando o botao atualizar for pressionado
      Entao a mensagem "Sucesso." deveria ser exibida
      E o valor "257" deve ser exibido no campo "vara" para o usuario

    Cenario: DELETE com todos os campos preenchidos corretamente
      E o usuario informa o valor "257" no campo "vara"
      E o usuario informa o valor "7001245.8.23-001" no campo "numero_processo"
      E o usuario informa o valor "Tutela Antecipada" no campo "natureza"
      E o usuario informa o valor "Alberto da Cunha" no campo "partes"
      E o usuario informa o valor "N" no campo "urgente"
      E o usuario informa o valor "N" no campo "arbitramento"
      E o usuario informa o valor "Valmir Farias" no campo "assistente_social"
      E o usuario informa o valor "2019-02-12" no campo "data_entrada"
      E o usuario informa o valor "2020-01-20" no campo "data_saida"
      E o usuario informa o valor "2019-08-13" no campo "data_agendamento"
      E o usuario informa o valor "Julgado" no campo "status"
      E o usuario informa o valor "O juiz negou provimento ao recurso" no campo "observacao"
      E o botao salvar for pressionado
      Quando o botao excluir for pressionado
      E o botao visualizar for pressionado
      Entao a mensagem "Não encontrado." deveria ser exibida