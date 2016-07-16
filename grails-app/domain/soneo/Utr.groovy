package soneo

class Utr {
    String name
    Date created = new Date()
    static belongsTo = [is_a: Feature, part_of: Transcript]

    static constraints = {
        name(blank: false)
    }
    static mapWith = "neo4j"
}
