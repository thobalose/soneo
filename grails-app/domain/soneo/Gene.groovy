package soneo

import groovy.transform.ToString

@ToString(includes = 'name')
class Gene {
    String name = "Gene"
    Date created = new Date()
    static belongsTo = [is_a: Feature]
    static hasMany = [coding_gene:Codinggene, noncoding_gene:Noncodinggene]
    static constraints = {
        name(blank: false)
    }

    static mapWith = "neo4j"
}
