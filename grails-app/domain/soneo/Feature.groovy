package soneo

import groovy.transform.ToString

@ToString(includes = 'name')
class Feature {
    String name = "Feature"
    Date created = new Date()
    static hasMany = [gene: Gene, exon:Exon, transcript:Transcript, utr:Utr]

    static constraints = {
        name(blank: false)
    }
    static mapWith = "neo4j"
}
