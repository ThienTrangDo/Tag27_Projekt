fun main (){
    var amsel = Vogel ("Amsel", "Früchte", 20)
    var buchfink = Vogel ("Buchfink", "Insekten", 15)
    var drossel = Vogel ("Drossel", "Himberren", 2)

    println("Eine ${amsel.vogeltyp} frisst gerne ${amsel.futtertyp} und hat eine Lebenserwartung von ${amsel.age} Jahren.")
    amsel.zwitschern()

    println("Eine ${buchfink.vogeltyp} frisst gerne ${buchfink.futtertyp} und hat eine Lebenserwartung von ${buchfink.age} Jahren.")

    println("Eine ${drossel.vogeltyp} frisst gerne ${drossel.futtertyp} und hat eine Lebenserwartung von ${drossel.age} Jahren.")
}