# soneo
A simple Grails App to represent the [simplified Sequence Ontology](http://gmod.org/wiki/File:So-slim-example.png) view on Neo4j.

![So-slim-example](https://github.com/thobalose/soneo/blob/master/soneo.png "So-slim-example")

## Getting Up and Running

```
$ git clone https://github.com/thobalose/soneo.git
$ cd soneo
```


We can start our App using `$ grails run-app` ([http://localhost:8080](http://localhost:8080)) and use the scaffold controllers to add more data.

*The App is integrated with Neo4j in embedded mode, thus one program and only one program can read and write to the database at a time.*

### Exploring data in Neo4j
To visualise the already existing/generated data, we will use a slightly modified Neo4j Docker image (`thoba/soneo`) to cater for `docker` running as `root`.
Run the image using the following command:

```
$ docker run -d \
    -e NEO4J_UID=$(id -u) -e NEO4J_GID=$(id -g) -e NEO4J_AUTH=none \
    -v $(pwd)/data/neo4j:/data \
    -p 7474:7474 \
    thoba/soneo
```
Point your browser to [http://localhost:7474](http://localhost:7474). 
