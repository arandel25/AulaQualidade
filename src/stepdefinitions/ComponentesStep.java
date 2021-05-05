package stepdefinitions;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import org.junit.Assert;
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
        componentes.fechaNavegador();
    }

    @Quando("o usuário selecionar radiobutton Masculino")
    public void o_usuário_selecionar_radiobutton_Masculino() {
        componentes.testeRadioButton(0);
    }

    @Então("o radiobutton Masculino deve está selecionado")
    public void o_radiobutton_Masculino_deve_está_selecionado() {
        componentes.validaRadioButton(0);
        componentes.fechaNavegador();
    }

    @Quando("o usuário selecionar radiobutton Feminino")
    public void o_usuário_selecionar_radiobutton_Feminino() {
        componentes.testeRadioButton(1);
    }

    @Então("o radiobutton Feminino deve está selecionado")
    public void o_radiobutton_Feminino_deve_está_selecionado() {
        componentes.validaRadioButton(1);
        componentes.fechaNavegador();
    }

    @Quando("o usuário selecionar checkbox Carne")
    public void o_usuário_selecionar_checkbox_Carne() {
        componentes.testeCheckBox(0);
    }

    @Então("o checkbox Carne deve está selecionado")
    public void o_checkbox_Carne_deve_está_selecionado() {
        componentes.validaCheckBox(0);
        componentes.fechaNavegador();
    }

    @Quando("o usuário selecionar checkbox Frango")
    public void o_usuário_selecionar_checkbox_Frango() {
        componentes.testeCheckBox(1);
    }

    @Então("o checkbox Frango deve está selecionado")
    public void o_checkbox_Frango_deve_está_selecionado() {
        componentes.validaCheckBox(1);
        componentes.fechaNavegador();
    }

    @Quando("o usuário selecionar checkbox Pizza")
    public void o_usuário_selecionar_checkbox_Pizza() {
        componentes.testeCheckBox(2);
    }

    @Então("o checkbox Pizza deve está selecionado")
    public void o_checkbox_Pizza_deve_está_selecionado() {
        componentes.validaCheckBox(2);
        componentes.fechaNavegador();
    }

    @Quando("o usuário selecionar checkbox Vegetariano")
    public void o_usuário_selecionar_checkbox_Vegetariano() {
        componentes.testeCheckBox(3);
    }

    @Então("o checkbox Vegetariano deve está selecionado")
    public void o_checkbox_Vegetariano_deve_está_selecionado() {
        componentes.validaCheckBox(3);
        componentes.fechaNavegador();
    }

}