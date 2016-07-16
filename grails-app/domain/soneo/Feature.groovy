package soneo

class Feature {
//    String name
    Date created = new Date()
    static hasMany = [gene: Gene, exon:Exon, transcript:Transcript, utr:Utr]

    static constraints = {
//        name(blank: false)
    }
    static mapWith = "neo4j"
}
