# demoprofiles
demo managing profiles in spring boot

There are several entries to init. spring.profiles.active  

Maven Profile
mvn package -Pdev

java -jar demoprofiles-0.0.1-SNAPSHOT.jar --spring.profiles.active=prod

maven pom spring boot plugin configuration adding a profile. 

JVM arguments -Dspring.profiles.active=prod

Enviornment argument: spring.profiles.active=prod
