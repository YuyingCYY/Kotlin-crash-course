fun main(args: Array<String>) {
    // var 定義可改變值的變數。
    var userName: String = "Yuying Chen"
    // val 定義不可改變值的變數，另外可以不聲明類型，會自行推斷
    val age = 30
    // age = 31 // Val cannot be reassigned
    // age = "30" // Type mismatch: inferred type is String but Int was expected

    // 使用$符號來串接字串
    println("Hello $userName is now $age years old.")
}