# boot-h2-jpa-demo

A demo project to query Japanese postal code, using SpringBoot + H2 DB + Spring Data JPA, REST


Related Qiita Entry: https://qiita.com/hrkt/items/7a70f4c4379ad0e6f795


# Build

```
.\gradlew bootJar 
```

# Run

```
java -jar build\libs\booth2jpademo-0.0.1-SNAPSHOT.jar
```

# Develop

## run development mode

activate "dev" profile to use H2 console and enable DB log.

```
.\gradlew bootRun --args='--spring.profiles.active=dev'
```

