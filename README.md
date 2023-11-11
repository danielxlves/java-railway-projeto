# Santander Dev Week 2023

## Link da api na nuvem. 
https://java-railway-projeto-production.up.railway.app/swagger-ui/index.html
ou
https://java-railway-projeto-production.up.railway.app/users/{id}

### Diagrama de classes da api

```mermaid
classDiagram
  class User {
    - name: String
    - account: Account
    - features: Features[]
    - card: Card
    - news: News[]
  }

  class Account {
    - ag: int
    - cc: String
    - balance: double
    - limit: double
  }

  class Features {
    - icon: String
    - description: String
  }

  class Card {
    - number: int
    - limit: double
  }

  class News {
    - icon: String
    - description: String
  }

  User "1" *-- "1" Account 
  User "1" *-- "N" Features 
  User "1" *-- "1" Card 
  User "1" *-- "N" News 
  ```
