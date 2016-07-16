package soneo

class Transcript {
    String name
    Date created = new Date()
    static belongsTo = [is_a: Feature, part_of: Gene]

    static constraints = {
        name(blank: false)
    }
    static mapWith = "neo4j"
}
