# ies_1.2
Ambiente de desenvolvimento em equipa

  Utilizar um framework para a construção de projetos com gestão explícita de dependências.
⎯ Aplicar práticas de gestão cooperativa do código fonte com o git.
⎯ Utilizar tecnologia de containers para facilitar a preparação de ambientes de execução (e.g.:
Docker).

## Questões

1) O que é um “maven goal”?

Maven Goal seria o objetivo de cada tarefa executada em cada fase.

2) Quais os principais “maven goals” e a respetiva sequência de invocação?

compiler:compile – the compile goal from the compiler plugin is bound to the compile phase
compiler:testCompile is bound to the test-compile phase
surefire:test is bound to test phase
install:install is bound to install phase
jar:jar and war:war is bound to package phase


