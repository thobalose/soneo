package soneo

class Gene {
//    String name
    Date created = new Date()
    static belongsTo = [is_a: Feature]
    static hasMany = [coding_gene:Codinggene, noncoding_gene:Noncodinggene]
    static constraints = {
//        name(blank: false)
    }

    static mapWith = "neo4j"
}
