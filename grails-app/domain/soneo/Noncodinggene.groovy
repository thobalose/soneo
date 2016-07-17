package soneo

import groovy.transform.ToString

@ToString(includes = 'name')
class Noncodinggene {
    String name
    Date created = new Date()
    static belongsTo = [is_a: Gene]
    static constraints = {
        name(blank: false)
    }

    static mapWith = "neo4j"
}
