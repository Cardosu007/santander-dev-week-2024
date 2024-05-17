# Santander Dev Week 2024
 Java RESTful criada para a Santander Dev Week

 ## Diagrama de Classes

 ```mermaid

classDiagram
    class User {
        -String name
        -Account account
        -List<Feature> features
        -Card card
        -List<News> news
    }

    class Account {
        -String number
        -String agency
        -float balance
        -float limit
    }

    class Feature {
        -String icon
        -String description
    }

    class Card {
        -String number
        -float limit
    }

    class News {
        -String newsIcon
        -String newsDescription
    }

    User --> Account
    User --> Feature
    User --> Card
    User --> News

```
