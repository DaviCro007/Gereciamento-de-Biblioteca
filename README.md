# Gerenciamento de Biblioteca

## 📚 Sobre o projeto

Este projeto foi desenvolvido como um sistema simples de gerenciamento de uma biblioteca, utilizando a linguagem **Java** e conceitos básicos de Programação Orientada a Objetos.

A ideia surgiu da necessidade de representar, de forma prática, algumas operações comuns de uma biblioteca: cadastrar livros, consultar o acervo, realizar empréstimos e registrar a devolução dos livros.

O sistema funciona diretamente pelo **console/terminal**, apresentando um menu de opções para que o usuário possa escolher a operação desejada. Os dados são mantidos em memória durante a execução do programa.

## 🎯 Objetivo

O principal objetivo do projeto é aplicar conceitos fundamentais de Java, como:

- Classes e objetos;
- Encapsulamento;
- Construtores;
- Métodos `get` e `set`;
- Estruturas condicionais;
- Estrutura de repetição;
- `ArrayList`;
- Entrada de dados com `Scanner`;
- Organização do programa em diferentes classes.

## ⚙️ Funcionamento

O sistema é dividido em quatro classes principais:

### `Main.java`

É o ponto de entrada da aplicação. A classe cria o objeto `Biblioteca`, apresenta o menu no console e recebe as opções escolhidas pelo usuário.

O menu possui as seguintes operações:

1. **Cadastrar Livro** — solicita o ID, título e autor do livro.
2. **Listar Livros** — exibe todos os livros cadastrados e informa se estão disponíveis ou emprestados.
3. **Realizar Empréstimo** — solicita o ID do livro e o nome do leitor. Caso o livro esteja disponível, ele passa a ser marcado como emprestado.
4. **Devolver Livro** — solicita o ID do livro e altera seu estado novamente para disponível.
5. **Sair** — encerra o programa.

### `Livro.java`

Representa um livro do acervo.

Cada livro possui:

- `id`: identificador do livro;
- `titulo`: título da obra;
- `autor`: autor da obra;
- `disponivel`: indica se o livro pode ser emprestado.

Quando um novo livro é cadastrado, ele começa automaticamente como **disponível**.

### `Biblioteca.java`

É responsável pelo gerenciamento do acervo e dos empréstimos.

A classe possui dois `ArrayList`:

- `acervo`: armazena os livros cadastrados;
- `emprestimos`: armazena os registros de empréstimos realizados.

Antes de cadastrar um livro, o sistema verifica se já existe outro livro com o mesmo ID. Dessa forma, evita-se a duplicação de identificadores.

Durante um empréstimo, o sistema também verifica se o livro existe e se está disponível. Caso já esteja emprestado, uma mensagem é apresentada ao usuário.

### `Emprestimo.java`

Representa um registro de empréstimo, armazenando:

- o livro emprestado;
- o nome do leitor;
- a data do empréstimo.

## 🔄 Exemplo de uso

Ao executar o programa, o usuário verá um menu semelhante a:

```text
****************************************
                MENU
1. Cadastrar Livro
2. Listar Livros
3. Realizar Empréstimo
4. Devolver Livro
0. Sair
****************************************
Escolha:
```

Por exemplo, para cadastrar um livro:

```text
Escolha: 1
ID: 1
Título: Dom Casmurro
Autor: Machado de Assis
Livro cadastrado com sucesso!
```

Depois, ao listar o acervo:

```text
1 - Dom Casmurro (Machado de Assis) - Disponível
```

Ao realizar um empréstimo:

```text
Escolha: 3
ID do livro: 1
Nome do leitor: Lucas
Empréstimo realizado!
```

O livro passará a aparecer como:

```text
1 - Dom Casmurro (Machado de Assis) - Emprestado
```

Após a devolução, ele volta para o estado **Disponível**.

## 💻 Requisitos

Para executar o projeto, é necessário ter o **Java JDK** instalado no computador.

Recomenda-se utilizar uma versão moderna do Java, como **Java 17 ou superior**.

Para verificar se o Java está instalado:

```bash
java -version
```

Também é possível verificar o compilador:

```bash
javac -version
```

## ▶️ Como executar pelo console

### 1. Baixe ou extraia o projeto

Coloque os quatro arquivos `.java` na mesma pasta:

```text
Main.java
Livro.java
Biblioteca.java
Emprestimo.java
```

### 2. Abra o terminal nessa pasta

No Windows, você pode abrir o PowerShell ou o Prompt de Comando dentro da pasta do projeto.

### 3. Compile os arquivos

Execute:

```bash
javac Main.java Livro.java Biblioteca.java Emprestimo.java
```

Se não aparecer nenhuma mensagem de erro, a compilação foi concluída.

### 4. Execute o programa

No Windows:

```bash
java Main
```

No Linux ou macOS:

```bash
java Main
```

### 5. Utilize o menu

Depois de iniciar, basta digitar o número correspondente à operação desejada.

Para encerrar:

```text
0
```

## 🗂️ Estrutura do projeto

```text
trabalho-faculdade/
├── Main.java
├── Livro.java
├── Biblioteca.java
├── Emprestimo.java
└── README.md
```

## ⚠️ Observações

Este é um sistema de estudo executado em console. Os dados dos livros e empréstimos são armazenados apenas durante a execução do programa.

Ao fechar o sistema, os dados cadastrados são perdidos, pois o projeto não utiliza banco de dados ou arquivos para armazenamento permanente.

Além disso, a data do empréstimo atualmente é definida diretamente no código da aplicação. Portanto, ela não é informada pelo usuário durante a execução.

## 👨‍💻 Tecnologias utilizadas

- **Java**
- **Java Collections (`ArrayList`)**
- **Java Scanner**
- **Programação Orientada a Objetos**
- **Console/Terminal**

## 📌 Considerações finais

O projeto apresenta uma implementação simples, mas permite demonstrar na prática como diferentes classes podem trabalhar juntas para representar um problema do mundo real.

A separação entre `Livro`, `Emprestimo`, `Biblioteca` e `Main` ajuda a organizar as responsabilidades do sistema e facilita futuras melhorias, como adicionar busca de livros, cadastro de leitores, histórico de empréstimos, persistência dos dados e uma interface gráfica.
