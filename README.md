# Santander Dev Week 2024
 Java RESTful criada para a Santander Dev Week

 ## Diagrama de Classes

 ```mermaid

classDiagram
    class User {
        -String name
        -System system
        -List<Race> race
        -List<MagicalSkill> MagicalSkill
        -List<PhysicalSkill> PhysicalSkill
        -List<Rank> rank
    }

    class System {
        -int idade
        -float altura
        -int level
        -float xp
    }

    class Race {
        -String race
        -String description
    }

    class MagicalSkill {
        -String habMagicas
        -String description
    }

    class PhysicalSkill {
        -String habFisicas
        -String description
    }

    class Rank {
        -String rank
        -float xpRank
    }

    User --> System
    User --> Race
    User --> MagicalSkill
    User --> PhysicalSkill
    User --> Rank

```
