#language:pt
Funcionalidade: Acessar site Senac Faculdade Palhoça

  Contexto:
    Dado que o usuário está com o navegador aberto

  Cenário: Acessar página do google
    Quando acessar a url www.google.com
    Então a página do google deve ser apresentada

  Cenário: Acessar site da Faculdade Senac
    Dado que o usuário acessou a url www.google.com
    E pesquisou por Faculdade Senac
    Quando clicar no link Senac Santa Catarina
    Então o site da faculdade Santa Catarina deve ser apresentado

  Esquema do Cenário: Pesquisar os cursos cozinheiro e depilador
    Dado que o usuário acessou a url https://www.sc.senac.br/
    E pesquisou pelo curso <curso>
    E o curso está com inscrições aberta
    Quando clicar no curso <curso>
    Então as unidades com matriculas abertas devem ser apresentadas
    Exemplos:
      | curso      |
      | Cozinheiro |
      | Depilador  |