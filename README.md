# generics
### Introdução a linguagem Java
## Prática integradora
# Objetivo
O objetivo deste guia prático é que possamos fortalecer e aprofundar os conceitos sobre
interfaces Java, implementação e abstração via factory de objetos.
Preparar, apontar, VAMOS !!
# Exercício 1
- Crie a interface Precedente<T> com um método public int precedeA (T t).
- Crie a classe Pessoa, com os atributos String nome e cpf, seus métodos de acesso e
os construtores que você considera apropriados.
- Criar uma classe Pessoa que implemente Precedente<Pessoa>, e sobrescreva o
método int precedeA(Pessoa p).
- Defina um critério de precedência para implementar o método acima. Pode ser que
uma pessoa preceda outra se o seu CPF for inferior, ou o nome for alfabeticamente
inferior e assim por diante.
- Crie a classe SortUtil com o método:
public static <T> void sort (Precedente <T> arr[ ]).
- Dentro do método anterior, desenvolva o algoritmo de bolha (bubble sort) para
ordenar a matriz.
- Discussão: O método de classificação pode classificar uma matriz de qualquer tipo de
dados?
- Crie um programa, declare um array com várias pessoas, classifique-o e exiba-o.
- Crie a classe Celular, com os atributos: numero e proprietario, implemente
Precedente<Celular> e proceda da mesma forma que fizemos com Pessoa do ponto
anterior.
- [Stéphanie da Silva Leal](https://github.com/stephleal)
- [Lucas Garcia Macchione Prudente Correa](https://github.com/LucasGarcia97)
- [Mauro Bergonzoni Junqueira](https://github.com/mbjunqueiraweb)
- [Iberê Abondanza Kuhlmann](https://github.com/ikuhlmann-meli)
- [Matheus Santos Alencar](https://github.com/matheussalencar)
