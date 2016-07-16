# soneo
A simple Grails App to represent the [simplified Sequence Ontology](http://gmod.org/wiki/File:So-slim-example.png) view on Neo4j.

The simplied Sequence Ontology

![So-slim-example](http://gmod.org/mediawiki/images/1/16/So-slim-example.png "So-slim-example")

### Getting Up and Running

```
$ git clone https://github.com/thobalose/soneo.git
$ cd soneo
```
Visualise on Neo4j using Docker
```
$ docker run -d \
    -e NEO4J_UID=$(id -u) -e NEO4J_GID=$(id -g) -e NEO4J_AUTH=none \
    -v $(pwd)/data/neo4j:/data \
    -p 7474:7474 \
    thoba/soneo
```