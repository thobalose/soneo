package soneo

class Gene {
    String name
    Boolean coding
    Date created = new Date()
    static belongsTo = [is_a: Feature]

    static constraints = {
        name(blank: false)
    }

    static mapWith = "neo4j"
}
