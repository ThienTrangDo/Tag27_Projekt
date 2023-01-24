fun main (){

    var labrador = Hund ("Milo", 3, "Labrador")
    var chihuahua = Hund ("Sammy", 6, "Chihuahua")
    var dackel = Hund ("Charly", 5, "Dackel")

    println("Der ${labrador.rasse} heisst ${labrador.hundenamen} und ist ${labrador.age} Jahre alt.")
    labrador.bellen()
    labrador.altern()
    println("${labrador.hundenamen} hatte Geburtstag und ist jetzt ${labrador.altern()} Jahre alt.")

    println()
    println("Der ${chihuahua.rasse} heisst ${chihuahua.hundenamen} und ist ${chihuahua.age} Jahre alt.")
    println()
    println("Der ${dackel.rasse} heisst ${dackel.hundenamen} und ist ${dackel.age} Jahre alt.")
}