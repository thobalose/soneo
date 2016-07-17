# soneo
A simple Grails App to represent the [simplified Sequence Ontology](http://gmod.org/wiki/File:So-slim-example.png) view on Neo4j.

The simplied Sequence Ontology

![So-slim-example](https://github.com/thobalose/soneo/blob/master/soneo.png "So-slim-example")

### Getting Up and Running

```
$ git clone https://github.com/thobalose/soneo.git
$ cd soneo
```
You can start the App using `grails run-app` or Visualise on Neo4j using Docker.

With Neo4j in embedded mode, one program and only one program can read and write to the database at a time.

```
$ docker run -d \
    -e NEO4J_UID=$(id -u) -e NEO4J_GID=$(id -g) -e NEO4J_AUTH=none \
    -v $(pwd)/data/neo4j:/data \
    -p 7474:7474 \
    thoba/soneo
```
Point your browser to [http://localhost:7474](http://localhosT:7474). 
