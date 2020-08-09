#language: pt
Funcionalidade: Procurar vagas no site da APInfo

  @fluxoprincipal
  Cenario: Procurar vagas de QA no site da APInfo
    Dado que estou na pagina da ApInfo
    Quando faco uma busca por vagas de QA
    Entao visualizo vagas disponiveis
    E valido a palavra QA encontrada no resultado
    
   @fluxoalternativo
  Esquema do Cenario: Procurar diferentes vagas no site da APInfo
    Dado que estou na pagina da ApInfo
    Quando faco uma busca por vagas de <vagas>
    Entao visualizo vagas disponiveis
    E valido a palavra <vagas> encontrada no resultado
    
    Exemplos:
    |vagas|
    |"QA"|
    |"Testes"|
    |"Automatizador"|
