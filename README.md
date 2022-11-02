# code-with-quarkus Project

Steps to reproduce:
1. run ./gradlew quarkusDev
2. remove the comment marks from src/main/kotlin/org/acme/GreetingResource.kt
3. without restarting the application query localhost:8080/hello/another
4. see there is an Exception about a missing serializer
5. restart the application
6. query localhost:8080/hello/another again -> works
