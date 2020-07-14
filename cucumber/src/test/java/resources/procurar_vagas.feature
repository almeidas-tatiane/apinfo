#language: pt
Funcionalidade: Procurar vagas de QA no site da APInfo

  @fluxoprincipal
  Cenario: Procurar vagas de QA no site da APInfo
    Dado que estou na pagina da ApInfo
    Quando faco uma busca por vagas de QA
    Entao visualizo vagas disponiveis
    E valido a palavra QA encontrada no resultado
