class Car {

    var ps: Int
    var color: String
    var seats: Int
    var freeSeats: Int

    fun getIn (){
        if (freeSeats > 1){
            freeSeats - 1
        } else {
            println("Fehler")
        }
    }

    fun getOut(){
        if (freeSeats >= 1){
            freeSeats + 1
        } else {
            println("Fehler")
        }
    }

    fun startEngine(){
        if (freeSeats >=1) {
            freeSeats + 1
            println("wroom wroom")
        } else {
            println("Fehler")
        }
    }

    constructor(ps: Int, color: String, seats: Int, freeSeats: Int){
        this.ps = ps
        this.color = color
        this.seats = seats
        this.freeSeats = freeSeats
    }

}

/*
Die Klasse hat einen Konstruktor: Der Konstruktor weist den Eigenschaften ps, color und seats übergebene Werte zu. Innerhalb des Konstruktors wird die Anzahl freier Sitzplätze berechnet.
Am Anfang sitzt im Auto noch keine Person. Stelle auch im Konstruktor sicher, dass keine negativen Parameter übergeben werden (Es gibt keine -100 PS oder -2 Sitze).
 */