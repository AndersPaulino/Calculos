# Calculadora de Estatísticas

Esta é uma aplicação Spring Boot que permite calcular estatísticas básicas com base nos números inseridos pelo usuário.
A aplicação fornece endpoints para inserir números e obter os resultados dos cálculos.

## Como Usar

### Endpoint POST `/api/calculos`

Este endpoint permite que você insira uma lista de números. A lista pode conter qualquer quantidade de números. Eles serão armazenados para posterior cálculo dos resultados.

**Exemplo de entrada (JSON):**
```json
[
    1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20
]
```
Exemplo de resposta:
```yaml
Números inseridos com sucesso!
Números inseridos: 20 [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20]
```
### Endpoint GET `/api/resultados`

Este endpoint retorna os resultados dos cálculos estatísticos com base nos números inseridos anteriormente.

Exemplo de resposta:
```yaml
Números inseridos: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20]
Número de dados inseridos: 20
Média dos números inseridos: 10.500
Desvio Padrão: 5.766
Mediana: 10.5
```
Caso nenhum número tenha sido inserido, a resposta será:
```yaml
Nenhum número foi inserido ainda.
```
Executando a Aplicação

Certifique-se de ter o ambiente Java e o Spring Boot configurados em sua máquina. Você pode executar a aplicação usando a classe principal AppApplication ou através do Maven:
```arduino
mvn spring-boot:run
```
Acesse os endpoints usando ferramentas como o Postman ou um navegador da web.
