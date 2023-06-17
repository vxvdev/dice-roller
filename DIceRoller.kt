import kotlin.random.Random

fun main() {

	buttonPressed()

}


	fun buttonPressed() {

		var diceFaceOne = Random.nextInt(1, 6)
		var diceFaceTwo = Random.nextInt(1, 6)
		var diceFaceThree = Random.nextInt(1, 6)


		if (diceFaceOne != diceFaceTwo && diceFaceTwo != diceFaceThree && diceFaceOne != diceFaceThree) {

			println("Button Pressed Dice is Rolling.")
			println("Dice showing on Face One: $diceFaceOne")
			println("Dice showing on Face Two : $diceFaceTwo")
			println("Dice showing on Face Three : $diceFaceThree")

			when (diceFaceOne) {
				1 -> println("1")
				2 -> println("2")
				3 -> println("3")
				4 -> println("4")
				5 -> println("5")
				6 -> println("6")
			}

			when (diceFaceTwo) {
				1 -> println("1")
				2 -> println("2")
				3 -> println("3")
				4 -> println("4")
				5 -> println("5")
				6 -> println("6")
			}
			when (diceFaceThree) {
				1 -> println("1")
				2 -> println("2")
				3 -> println("3")
				4 -> println("4")
				5 -> println("5")
				6 -> println("6")
			}

		} else {
			buttonPressed()
		}

	}



	





