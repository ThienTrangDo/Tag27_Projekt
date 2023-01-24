class Hund {

    var hundenamen: String
    var age: Int
    var rasse: String

    fun bellen(){
        println("Woof!")
    }
    fun altern(){
        var geburtstag = age + 1
        println(geburtstag)
    }

    constructor(hundenamen: String, age: Int, rasse: String){
        this.hundenamen = hundenamen
        this.age = age
        this.rasse = rasse
    }
}
