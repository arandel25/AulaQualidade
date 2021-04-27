#language:pt
Funcionalidade: Cadastrar usuário

  @basico
  Cenário: Cadastrar usuário

  @basico
  Cenário: Editar usuário

  @basico
  Cenário: Excluir usuário

  @basico
  Cenário: Pesquisar usuário

  @geral
  Cenário: Validar usuário
    #validar se o campo nome é obrigatório

  @específico
  Cenário: Auditar cadastro do usuário
    #auditoria deve armazenar o
    #nome(quem realiza o cadastro) e a hora do cadastro

  @completo
  Cenário: Alinhamento do botão Cadastrar
    #deve estar alinhado a esquerda