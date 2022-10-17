# 1.2 Local Configuration

## Blocks in this branch

The random element to `PondController` is now defined in the `application.properties` file via the `fishing.catch.probability` property.

### Building the Application
```shell
mvn clean package
```
#### Natively Build the Application
```shell
mvn -Pnative clean package
```

### Launching the Application
```shell
java -jar target pond-0.0.1-SNAPSHOT.jar 
```
#### Launching the Native Application
```shell
./target/pond
```

##Note
There are many different ways to inject configuration variables into an application.
More can be read about it [here](https://docs.spring.io/spring-boot/docs/current/reference/html/features.html#features.external-config).
