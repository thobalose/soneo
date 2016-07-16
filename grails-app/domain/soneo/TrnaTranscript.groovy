package soneo

class TrnaTranscript {
    String name
    Date created = new Date()
    static belongsTo = [is_a: Transcript, part_of: TrnaGene]

    static constraints = {
        name(blank: false)
    }
    static mapWith = "neo4j"
}
