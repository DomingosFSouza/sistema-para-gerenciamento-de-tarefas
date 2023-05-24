# **Meu projeto de gerenciamento de tarefas**

O projeto construído conta com um cadastro de tarefas efetivo, tendo como eficiência no tempo de uso do cliente, já que há poucas tarefas, não há requisição de mudança de telas via URLs. Além do cadastro de tarefas, o sistema conta com uma listagem geral de tarefas, com páginação, buscando minimizar a poluição visual; edição parcial, através da funcionalidade "Concluído"; Exclusão de tarefas.

O projeto foi produzido a partir de um modelo de processo espiral e incremental, contando com uso de *KanBan* produzido localmente, para melhoria da gestão de tempo e evasão dos riscos 

## Configurações utilizadas

Tecnologia | Versão | Status
---------- | ------ |----------
JSF|2.2|Em uso
Maven|4.0.0-alpha-5|Em uso
PrimeFaces|6.0|Em uso
JPA|2.1|Em pausa
Hibernate|5.6.14.Final|Em pausa
PostgreSQL|14.6|Em pausa
ApacheTomCat|8.5.88|Em uso

*Para maiores informações, também consultar: [pom.xml](../sistema-para-gerenciamento-de-tarefas/em-desenvolvimento/sistema-gestao-tarefas/pom.xml) para configurações utilizadas no projeto que está em desenvolvimento.*

## Melhorias em avanço
- Com auxílio da gestão de dependências do Maven, os códigos que envolvem a persistência do Hibernate, com uso de JPA, foram produzidos, bem como a criação da tabela e caminho para ligação e uso dessas tecnologias;
- Finalização do modal de edição;
- Finalização do filtro de pesquisa para visualização das tarefas (terá uma facilidade maior em sua execução, após a conexão completa com o postgres, devido a facilidade do uso de suas querys);
- Implementação de services e regras de negócio;
- Melhoria constante na escrita do código para facilitar a leitura, além de seus comentários.

## Melhorias futuras
- Finalização do estudo de SpringFramework para verificar a viabilidade de seu uso;
- Utilização de Bootstrap para implementação do layout e construção do sistema;
- Início da produção de uma documentação mais robusta, para evitar maiores problemas e fomentar o aprendizado de quem precisará estudar o sistema.

## Observações

1. *Algumas telas foram criadas e se encontram na pasta [telas](../telas/). Essas telas foram feitas separadamentes, contendo protótipos para seguimento do projeto. No caso, a ideia seria produzir algumas telas por partes de salvar cada passo dado, neste momento (localmente e facilmente).*

1. *Vale ressaltar também que o código funcional e em maior estabilidade está sendo reproduzido com as classes de testes.*

1. *Infelizmente, os códigos .xhtml estavam tendo algum conflito com comentários, então, os mesmo forarm removidos. Qualquer dúvida sobre os mesmos, poderá ser ser retirada comigo, por qualquer canal de contato preferível.*


