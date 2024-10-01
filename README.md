# Serviço de Localização
Este projeto permite consultar distâncias entre coordenadas e processar dados de localização.

## Rotas

- **GET /distancia**: Retorna a distância entre duas coordenadas.
    - Exemplo de requisição: `GET /distancia?lat1=-23.5505&lon1=-46.6333&lat2=40.7128&lon2=-74.0060`
- **POST /processar**: Processa um conjunto de coordenadas.
    - Exemplo de corpo da requisição:
      ```json
      {
        "lat": "-23.5505",
        "lon": "-46.6333"
      }
      ```

- **GET /sobre**: Retorna informações sobre o projeto e o estudante.
    - Resposta esperada:
      ```json
      {
        "estudante": "Seu Nome",
        "projeto": "Serviço de Localização"
      }
      ```
