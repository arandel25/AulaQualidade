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