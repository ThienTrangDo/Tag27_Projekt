class Vogel {

    var vogeltyp: String
    var futtertyp: String
    var age: Int

    fun zwitschern (){
        println("zwitscher")
    }

    constructor(vogeltyp: String, futtertyp: String, age: Int){
        this.vogeltyp = vogeltyp
        this.futtertyp = futtertyp
        this.age = age
    }
}
