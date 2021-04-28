package stepdefinitions;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import util.Componentes;

public class ComponentesStep {

    Componentes componentes = new Componentes();

    @Dado("que o usuário acessou o arquivo Campo de treinamento")
    public void que_o_usuário_acessou_o_arquivo_Campo_de_treinamento() {
        componentes.inicializa();
    }

    @Quando("que o usuário digitar Batatinha")
    public void que_o_usuário_digitar_Batatinha() {
        componentes.testeTextField();
    }

    @Então("o resultado do campo textfield deve ser Batatinha")
    public void o_resultado_do_campo_textfield_deve_ser_Batatinha() {
        componentes.validaTextField();
        componentes.fechaNavegador();
    }
}
