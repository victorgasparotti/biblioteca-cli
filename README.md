# 📚 Biblioteca CLI

Gerenciador de biblioteca pessoal em linha de comando, desenvolvido em **Java** como parte dos estudos de programação orientada a objetos.

O programa permite cadastrar livros, listar os livros salvos e marcar quais já foram lidos — tudo direto pelo terminal, sem depender de banco de dados ou bibliotecas externas.

## ✨ Funcionalidades

- ➕ Adicionar um novo livro (título, autor e ano)
- 📋 Listar todos os livros cadastrados
- ✅ Marcar um livro como lido
- 🚪 Sair do programa

## 🖥️ Como funciona

Ao rodar o programa, um menu interativo é exibido no terminal:

```
===Minha Biblioteca===

1. Adicionar livro
2. Listar livros
3. Marcar como lido
4. Sair

Escolha uma opção:
```

O usuário escolhe uma opção digitando o número correspondente, e o programa executa a ação escolhida em loop até que a opção "Sair" seja selecionada.

## 🛠️ Tecnologias utilizadas

- Java
- Coleções (`ArrayList`)
- Leitura de entrada via `Scanner`
- Orientação a objetos (classes `Principal` e `Livro`)

## 📂 Estrutura do projeto

```
├── Principal.java   # Contém o menu e a lógica principal do programa
└── Livro.java        # Classe que representa um livro (título, autor, ano, status de leitura)
```

## 👤 Autor

Victor Gasparotti
