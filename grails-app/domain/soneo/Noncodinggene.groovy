package soneo

class Noncodinggene {
    String name
//    Date created = new Date()
    static belongsTo = [is_a: Gene]
    static constraints = {
        name(blank: false)
    }

    static mapWith = "neo4j"
}
