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

    @Quando("o usuário digitar Batatinha no campo textfield")
    public void o_usuário_digitar_Batatinha_no_campo_textfield() {
        componentes.testeTextField();
    }

    @Então("o resultado do campo textfield deve ser Batatinha")
    public void o_resultado_do_campo_textfield_deve_ser_Batatinha() {
        componentes.validaTextField();
        componentes.fechaNavegador();
    }

    @Quando("o usuário digitar Batatinha Batatinha{int} no campo textarea")
    public void o_usuário_digitar_Batatinha_Batatinha_no_campo_textarea(Integer int1) {
        componentes.testeTextArea();
    }

    @Então("o resultado do campo textarea deve ser Batatinha Batatinha{int}")
    public void o_resultado_do_campo_textarea_deve_ser_Batatinha_Batatinha(Integer int1) {
        componentes.validaTextArea();
//        componentes.fechaNavegador();
    }
}
