# spring-building-blocks

## Building blocks

The code in this repository is mean to build in very small steps by [using branches](https://github.com/robertmcnees/spring-building-blocks/branches).

The project is designed to take development into extremely small chunks.  You can see the differences in any 2 branches by accessing [this link](https://github.com/robertmcnees/spring-building-blocks/compare/)

[1.0](https://github.com/robertmcnees/spring-building-blocks/tree/1.0_web-server) - Using Spring Web, create a basic RESTful endpoint

[1.1](https://github.com/robertmcnees/spring-building-blocks/tree/1.1_Randomize) - Insert a bit of 'business logic' we can configure later ([incremental diff](https://github.com/robertmcnees/spring-building-blocks/compare/1.0_web-server...1.1_Randomize))

[1.2](https://github.com/robertmcnees/spring-building-blocks/tree/1.2_LocalConfig) - Use a property injection to insert business logic from `application.properties` 

[2.0](https://github.com/robertmcnees/spring-building-blocks/tree/2.0_CentralizedConfig) - Use Spring Cloud Config Server to obtain properties from an external Git repository.  Addtional Config Server deployment required.  [(incremental diff)](https://github.com/robertmcnees/spring-building-blocks/compare/1.2_LocalConfig...2.0_CentralizedConfig)

[2.1](https://github.com/robertmcnees/spring-building-blocks/tree/2.1_AzureSpringAppsDeployment) - Deploy to Azure Spring Apps (ASA) and use ASA built in Config Server.  No additional deployment required.  