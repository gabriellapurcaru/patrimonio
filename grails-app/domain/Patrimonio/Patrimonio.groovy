package Patrimonio

import javax.xml.soap.Text

class Patrimonio {
    int rp
    int tipo_bem_id
    BigDecimal valor_produto
    Date data_nota_fiscal
    int fornecedor_id
    int processo
    String fonte
    int lotacao_id
    String estado_bem
    String tombamento
    string num_movimentacao
    Date data_mov
    Text rascunho
    int nota_fiscal
    int num_empenho

    static constraints = {
    }
}
