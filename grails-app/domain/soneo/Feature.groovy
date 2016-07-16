package soneo

class Feature {
    String name
    Date created = new Date()
    static hasMany = [feature: Gene]

    static constraints = {
    }
    static mapWith = "neo4j"
}
