package soneo

import groovy.transform.ToString

@ToString(includes = 'name')
class TrnaGene {
    String name
    Date created = new Date()
    static belongsTo = [is_a: Noncodinggene]

    static constraints = {
        name(blank: false)
    }
    static mapWith = "neo4j"
}
