# Foody - Food Recipes Android App

## Sobre

Foody é um aplicativo de busca e pesquisa de receitas online.

Desenvolvido para dispositivos Android utilizando a linguagem Kotlin, Foody permite buscar
receitas online para os mais variados tipos de refeições e dietas.

Para a construção do aplicativo utilizamos diversos componentes de Arquitetura do Android, 
tais como: componentes de Navegação, Data Binding, biblioteca Room, Data Store Preferences,
Live Data, View Model, Kotlin Flow, DiffUtil, View Pager, Motion Layout, entre vários outros.

Foody opera com uma fonte de dados remoto utilizando a biblioteca Retrofit.
Recebemos uma lista de receitas como resposta à requisição GET
para a nossa API Spoonacular.

Implementamos também uma fonte de dados locais para que se possa salvar uma receita favorita
e armazenar dados em cache na base de dados do dispositivo.

## Features

- Pesquisar receitas e filtra-las por tipo de refeição e dieta
- Receitas detalhadas com foto, descrição, ingredientes e instruções
- Adicionar receitas aos Favoritos
- Receber uma piada sobre comida ao clicar em Food Joke
- Suporte para Tema Escuro