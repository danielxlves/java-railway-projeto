# Santander Dev Week 2023

## Diagrama de classes da api

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
  User "1" *-- "n" Features 
  User "1" *-- "1" Card 
  User "1" *-- "n" News 
  ```
