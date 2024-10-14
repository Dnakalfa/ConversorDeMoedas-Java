
# Conversor de Moedas 2.0
# Olá, eu sou o Umberto! 👋
## Descrição

Esta aplicação permite aos usuários converter valores entre diferentes moedas de forma interativa e fácil. Através de uma interface gráfica construída com JavaFX, os usuários podem selecionar a moeda de origem e a moeda de destino, inserir o valor a ser convertido e visualizar o resultado instantaneamente. Além disso, a aplicação mantém um histórico das conversões realizadas, permitindo que os usuários visualizem suas conversões recentes.

## Funcionalidades

- **Conversões entre múltiplas moedas**: Atualmente, a aplicação suporta a conversão entre Dólar, Euro, Peso Argentino, Libra Inglesa e Real.
- **Interface Gráfica**: Uma interface amigável para facilitar a interação do usuário.
- **Histórico de Conversões**: O aplicativo armazena as últimas 10 conversões realizadas.
- **Cotações Dinâmicas**: As cotações das moedas são atualizadas em tempo real através da integração com uma API de câmbio.

## Tecnologias Utilizadas

- **Java**: Linguagem de programação principal.
- **JavaFX**: Para a construção da interface gráfica.
- **Gson**: Para deserialização de dados JSON da API.
- **Maven**: Para gerenciamento de dependências.

## Requisitos

- JDK 11 ou superior
- Maven
- Biblioteca JavaFX (deve ser configurada conforme as instruções abaixo)

## Instalação

1. Clone o repositório:
   ```bash
   git clone https://github.com/seuusuario/conversor-monedas.git
   cd conversor-monedas
   ```

2. **Configuração do JavaFX**:
   - Faça o download do [JavaFX SDK](https://gluonhq.com/products/javafx/).
   - No seu IDE, configure o `module-path` para o diretório `lib` do JavaFX SDK.
   - Adicione as seguintes opções de VM nas configurações do seu projeto:
     ```
     --module-path /caminho/para/javafx-sdk/lib --add-modules javafx.controls,javafx.fxml
     ```

3. **Instale as dependências**:
   - Utilize o Maven para instalar as dependências necessárias. Execute o comando:
     ```bash
     mvn install
     ```

## Execução

Para executar a aplicação, você pode usar o Maven diretamente com o seguinte comando:

```bash
mvn javafx:run
```

## Uso

1. Inicie a aplicação.
2. Na interface, escolha a moeda de origem e a moeda de destino.
3. Insira o valor que deseja converter e clique em "Converter".
4. O resultado será exibido na tela, junto com o histórico das últimas conversões.

### Captura De Tela Inicial
![image](https://github.com/Dnakalfa/ConversorDeMoedas-Java/blob/master/prints/inicial.png)
### Captura De Tela Com Opções
![image](https://github.com/Dnakalfa/ConversorDeMoedas-Java/blob/master/prints/opcoes.png)
### Captura De Tela Com Conversões e Historico
![image](https://github.com/Dnakalfa/ConversorDeMoedas-Java/blob/master/prints/convertido.png)
## Contribuição

Contribuições são bem-vindas! Sinta-se à vontade para abrir um problema ou um pull request.

## Licença

Este projeto está licenciado sob a MIT License. Veja o arquivo LICENSE para mais detalhes.

### Desenvolvido apartir de conhecimentos adquiridos em cursos, palestras e mentorias na Alura/Programa ONE - Oracle Next Education.

Atualmente estou ampliando estes pequenos projetos, que ocorrerão a medida que o aprendizado evoluir.

## Contato

Para dúvidas ou sugestões, entre em contato com [umberto_souza@hotmail.com](mailto:umberto_souza@hotmail.com).
