#language:pt
Funcionalidade: Acessar vários componentes html

  Contexto:
    Dado que o usuário acessou o arquivo Campo de treinamento

#  Cenário: Validar campo textfield
#    Quando o usuário digitar Batatinha
#    Então o resultado do campo textfield deve ser Batatinha

  Esquema do Cenário: Validar campo textfield e textarea
    Quando o usuário digitar <texto> no campo <campo>
    Então o resultado do campo <campo> deve ser <texto>
    Exemplos:
      | texto                | campo     |
      | Batatinha            | textfield |
      | Batatinha Batatinha2 | textarea  |


  Esquema do Cenário: Validar radiobutton "Sexo" e ckeckbox "comida favorita"
    Quando o usuário selecionar <componente> <nome>
    Então o <componente> <nome> deve está selecionado
    Exemplos:
      | componente  | nome        |
      | radiobutton | Masculino   |
      | radiobutton | Feminino    |
      | checkbox    | Carne       |
      | checkbox    | Frango      |
      | checkbox    | Pizza       |
      | checkbox    | Vegetariano |

  @validar_elemento_combobox_escolaridade
  Cenário: Validar elemento combobox escolaridade
    Quando o usuário selecionar um valor no elemento combo
    Então o valor deve aparecer selecionado

  @validar_quantidade_de_opções_na_combobox
  Cenário: Validar quantidade de opções na combobox
    Quando o usário clicar no elemento combobox
    Então a quantidade de opções tem que ser oito

  @validar_opção_Mestrado_selecionado_na_combobox
  Cenário: Validar opção Mestrado selecionado na combobox
    Quando  o usuário selecionar a opção Mestrado na combobox
    Então Mestrado deve aparecer selecionado

  @Validar_elemento_combo_multipla
  Cenário: Validar elemento_combo múltipla
    Quando o usuário selecionar um valor no elemento campo de múltipla escolha
    Então o valor deve aparecer selecionado no elemento combobox de múltipla escolha

  @Interagir_com_o_Botao
  Cenário: Interagir com o Botão
    Quando o usuário clicar no botão Clique me
    Então o nome do botão deve ser alterado para Obrigado

  @Interagir_com_Alert_Simples
  Cenário: Interagir com Alert Simples
    Quando o usuário clicar no botão Alert
    Então  deve aparecer a mensagem de feedback Alert Simples

  @Validar_feedback_do_botao_Confirm
  Esquema do Cenário: Validar feedback do botão Confirm
    Quando o usuário clicar no botão Confirm
    E aparecer a mensagem Confirm Simples
    E clicar no botão <botao>
    Então deve aparecer a mensagem de feedback <mensagem>
    Exemplos:
      | botao    | mensagem   |
      | OK       | Confirmado |
      | Cancelar | Negado   |