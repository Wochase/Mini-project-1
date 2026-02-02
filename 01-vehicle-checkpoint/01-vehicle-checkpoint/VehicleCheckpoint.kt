fun main() {

    val car = Machine("Tesla", "CyberTruck", 2025, 2)
    val car2 = Machine("Toyata", "corolla", 2020, 4)

    println("\n")

    car.move()
    car.stop()

    println("\n")
    val Alex = CheckPost(2022, 19, "Owner Alex Hamilton")

    println("\n")
    val Felix = CheckPost(2021, 22, "Owner Felix Joao")

    println("\n")
    val Gomez = CheckPost(2017, 22, "Owner Gomez Joao")

    println("\n")
    val Antoin = CheckPost(2025, 16, "Owner Antoin Shelax")

    println("\n")
    val driver = CheckPost(regitrationDate = 0, driverId = 0, "")

}

class Machine(val name: String, val model: String, year: Int, doors: Int) {
    val year: Int
    val doors: Int

    init {
        if (year >= 2023 && doors == 2) {
            println("$name is a new and $name has $doors doors")
            this.doors = doors
            this.year = year
        } else {
            println("$name is old and $name has $doors doors")
            this.doors = doors
            this.year = year
        }

    }

    fun move() {
        println("$name is moving")
    }

    fun stop() {
        println("$name has stopped at the checkpoint")
    }


}

class CheckPost(regitrationDate: Int, driverId: Int, ownershipPapers: String) {


    var regitrationDate = regitrationDate
    var driverID = driverId
    var ownershipPapers = ownershipPapers

    init {
        if (regitrationDate >= 2020) {
            println("your papaers are up to date: $regitrationDate")
            this.regitrationDate = regitrationDate
        } else {
            println("your papers are down to date $regitrationDate")
            this.regitrationDate = regitrationDate
        }

        if (ownershipPapers.contains("Owner", ignoreCase = true)) {
            println("The car is your: $ownershipPapers")
            this.ownershipPapers = ownershipPapers
        } else {
            println("The car is not your: $ownershipPapers")
            this.ownershipPapers = ownershipPapers
        }

        if (driverId >= 18) {
            println("You are old enough to drive: $driverId")
            this.driverID = driverId
        } else {
            println("You are not old enough to drive: $driverId")
            this.driverID = driverId
        }

    }

}
