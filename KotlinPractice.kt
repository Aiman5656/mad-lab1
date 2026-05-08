fun main() {
    //Variables & Types
    val name = "Aiman Abdalla Amour"
    val age = 21
    println("My name is $name and I am $age years old.")
    //Function Test
    println("Area: ${area(3.0, 4.0)}")
    //Control Flow Test
    println("Grade: ${grade(75)}")
    //Loop — FizzBuzz
    println("\n--- FizzBuzz 1 to 30 ---")
    for (i in 1..30) {
        when {
            i % 15 == 0 -> println("FizzBuzz")
            i % 3 == 0 -> println("Fizz")
            i % 5 == 0 -> println("Buzz")
            else -> println(i)
        }
    }
    //List Operations
    val nums = listOf(1, 2, 3, 4, 5, 6)
    println("\nSum: ${nums.sum()}")
    println("Even numbers: ${nums.filter { it % 2 == 0 }}")
    println("Doubled: ${nums.map { it * 2 }}")
    //Classes
    val courses = listOf(
        Course("MT 822", "Mobile App Dev", 4),
        Course("IT 812", "Computerized Accounting Application", 3),
        Course("PT 822", "Ms. Visual Programming", 4)
    )
    println("\nCourses:")
    courses.forEach { println(it) }
    //Null safety in Kotlin is a built-in feature of the type system designed to eliminate the risk of NullPointerExceptions (NPE), often called the "billion-dollar mistake".
    println("\nNull safety check")
    val inputName: String? = "SUZA"
}
//Exercise 2
fun area(width: Double, height: Double): Double = width * height
//Exercise 3
fun grade(score: Int): String {
    return when {
        score >= 80 -> "A"
        score >= 70 -> "B"
        score >= 60 -> "C"
        score >= 50 -> "D"
        else -> "F"
    }
}
//Exercise 6
class Course(val code: String, val title: String, val credits: Int) {
    override fun toString(): String = "[$code] $title ($credits)"
}
//?. It is called safe call operator which is used to safely access a property or method of a variable that could be Null.
//?: It is called Elvis operator which provide fallback or default value.
