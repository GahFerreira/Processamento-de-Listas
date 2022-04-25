# Processamento de Listas

Projeto em Java para processar listas de elementos Double que usam a Interface List, para a disciplina de Programação Orientada a Objetos.

O resultado do processamento é uma Dupla, classe implementada no projeto usando tipos genéricos, que guarda dois elementos Double.

O diagrama UML no qual foi baseado o projeto está a seguir:
![Diagrama UML - Processamento de Listas](https://user-images.githubusercontent.com/49258183/165016467-56ac9942-bb2f-4043-a53c-376d43432930.png)
Os métodos de ‘MinhaClasse’ devem executar o algoritmo a seguir:

    Iterar 'e' vezes:
        Iterar sobre os pares contidos em 'ins/outs':
            p = w1 * in’ + w0
            dif = out’ - p
            w0 += dif * lr
            w1 += dif * lr * in’
        // A cada dez iterações do for externo exibir 'iteração_atual/w1/w0'
    Retornar 'w1' e 'w0' (nesta ordem) como uma dupla genérica
