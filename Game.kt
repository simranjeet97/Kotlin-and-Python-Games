import javax.swing.JOptionPane

fun main(args:Array<String>) {
    var compute: Int = (Math.random() * 100 + 1).toInt()
    var user_answer: Int = 0
    println("Correct Guess is $compute")
    var count = 0
    var response: String

    // Round-1
    while (user_answer != compute && count <= 5) {
        response = JOptionPane.showInputDialog(null, "Enter the number Between 1 to 100", "Guessing Game-Round 1", 3)
        user_answer = Integer.parseInt(response)
        JOptionPane.showMessageDialog(null, determineguess_one(user_answer, compute, count))
        count++

            }

        }


        var x = count
        when (x) {
            x -> JOptionPane.showMessageDialog(null, "Game Over , Attempts Finish ${x - 1}")
        }


}

    fun determineguess_one(user_answer: Int, compute: Int, count: Int): String {
        if (user_answer <= 0 || user_answer > 100) {
            return """Guess is between 1 to 100"""
        } else if (user_answer == compute) {
            return """Guess is Correct $count"""
        } else if (user_answer > compute) {
            return """Guess is larger $count"""
        } else if (user_answer < compute) {
            return """Guess is smaller $count"""
        } else {
            return """Guess is incorrect $count"""
        }
    }

    fun determineguess_two(user_answer: Int, compute: Int, count: Int): String {
        if (user_answer <= 0 || user_answer > 500) {
            return """Guess is between 1 to 500"""
        } else if (user_answer == compute) {
            return """Guess is Correct $count"""
        } else if (user_answer > compute) {
            return """Guess is larger $count"""
        } else if (user_answer < compute) {
            return """Guess is smaller $count"""
        } else {
            return """Guess is incorrect $count"""
        }
    }
