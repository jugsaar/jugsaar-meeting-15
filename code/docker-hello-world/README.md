$ docker run debian echo "Hello World"          
Unable to find image 'debian:latest' locally
latest: Pulling from library/debian

d0ca40da9e35: Pull complete 
d1f66aef36c9: Pull complete 
Digest: sha256:017c4cfd3b10fe77c37a515c38f4327e0668fdb287c0aa1436967fda37010713
Status: Downloaded newer image for debian:latest
Hello World




docker run debian echo "Hello World from: uname -a"