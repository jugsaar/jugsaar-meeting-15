# Spring Boot Docker App Example
### Simple Spring Boot App that generates a docker file  

* * *  

# Build the project
```
mvn clean package
```

# Build the docker image
```
mvn docker:build
```
# Run the newly created docker image
``` 
docker run -t --rm --name bootapp -p 8080:8080 jugsaar/bootapp
```

# Debug the newly created docker image
```   
docker run -t --rm --name bootapp -p 8080:8080 -p 42424:42424 jugsaar/bootapp
```

# One line version
```
mvn clean package -DskipTests && mvn docker:build &&  docker run --rm --name bootapp -p 8080:8080 -p 42424:42424 jugsaar/bootapp
```

# Rebuild the docker image from scratch
```
docker rm -f bootapp && docker rmi -f jugsaar/bootapp 
```