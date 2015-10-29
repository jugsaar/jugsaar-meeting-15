# Docker Workflow Demo
###

* * *

## Show docker file
```
open Dockerfile
```

## Build a new image from ./Dockerfile and tag it with: jugsaar/docker-python-webserver:latest
```
docker build -t jugsaar/docker-python-webserver .
```

## Show layers of the new image
```
docker history jugsaar/docker-python-webserver
```

## Create a new container instance from the image with name: webserver
```
docker run -d -t --name webserver jugsaar/docker-python-webserver
```

## Show currently running containers
```
docker ps
```

## Inspect container configuration
```
docker inspect webserver
```

## Inspect specific container configuration with go templates
```
docker inspect -f {{.NetworkSettings.IPAddress}} webserver
docker inspect -f {{.NetworkSettings.PortBindings}} webserver
```

## Open in browser
```
open http://$(docker inspect -f {{.NetworkSettings.IPAddress}} webserver):8000
```

## Show webserver logs
```
docker logs webserver
docker logs -f webserver
```

## Stop webserver
```
docker stop webserver
```

## Remove webserver container
```
docker rm -f webserver
```


## Create new container instance
Create a new container instance from the image with name: webserver and bind local port 8000 to 8000 container 
port
```
docker run -p 8000:8000 -d --name webserver jugsaar/docker-python-webserver
```

## Investigate the container again
```
docker inspect webserver
docker inspect -f {{.HostConfig.PortBindings}} webserver 
```

## Remove container webserver
```
docker rm -f webserver
```

## Remove image
```
docker rmi -f  jugsaar/docker-python-webserver
```
