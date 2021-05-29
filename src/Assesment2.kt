fun main() {
    detail("kigogo","fanzo","blossoms")
    var x= detail("kigogo","fanzo","blossoms")
    println(x)

}


data class Book(val title:String,var author:String,var pages:Int)

fun detail(title: String,title2: String,title3: String) {
var book=Book("kigogo","Nisambo",126)
    var title= reverseOrder<String>()
    println(title.reversed())



}

class CurrentAccount(var accountNumber:Int,var name:String,var balance:Double){
    fun deposit(amount:Double) {
        balance +=amount
        println(balance)

    }
    fun withdraw(amount: Double) {
        balance -=amount
        println(balance)

    }

    fun details() {
        println("AccountNumber $accountNumber with $balance is operated by $name")


    }}
class SavingAccount( var accountNumber:Int,var name:String,var balance:Double){
    fun deposit(amount:Double) {
        println(3445567)


    }
  }









