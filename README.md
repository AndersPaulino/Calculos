<!DOCTYPE html>
<html>

<head>
    <title>Calculadora de Estatísticas</title>
</head>

<body>

    <h1>Calculadora de Estatísticas</h1>

    <p>Esta é uma aplicação Spring Boot que permite calcular estatísticas básicas com base nos números inseridos pelo usuário.
        A aplicação fornece endpoints para inserir números e obter os resultados dos cálculos.</p>

    <h2>Como Usar</h2>

    <h3>Endpoint POST <code>/api/calculos</code></h3>

    <p>Este endpoint permite que você insira uma lista de números. A lista pode conter qualquer quantidade de números. Eles serão armazenados para posterior cálculo dos resultados.</p>

    <h4>Exemplo de entrada (JSON):</h4>
    <pre>
        <code>
[
    1, 2, 3, 4, 5, 6, 7, 8, 9, 10
]
        </code>
    </pre>

    <p>Exemplo de resposta:</p>
    <pre>
        <code>
Números inseridos com sucesso!
Números inseridos: 20 [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20]
        </code>
    </pre>

    <h3>Endpoint GET <code>/api/resultados</code></h3>

    <p>Este endpoint retorna os resultados dos cálculos estatísticos com base nos números inseridos anteriormente.</p>

    <p>Exemplo de resposta:</p>
    <pre>
        <code>
Números inseridos: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20]
Número de dados inseridos: 20
Média dos números inseridos: 10,500
Desvio Padrão: 5,766
Mediana: 10.5
        </code>
    </pre>

    <p>Caso nenhum número tenha sido inserido, a resposta será:</p>
    <pre>
        <code>
Nenhum número foi inserido ainda.
        </code>
    </pre>

    <h2>Executando a Aplicação</h2>

    <p>Certifique-se de ter o ambiente Java e o Spring Boot configurados em sua máquina. Você pode executar a aplicação usando a classe principal <code>AppApplication</code> ou através do Maven:</p>

    <pre>
        <code>
mvn spring-boot:run
        </code>
    </pre>

    <p>Acesse os endpoints usando ferramentas como o Postman ou um navegador da web.</p>

</body>

</html>
