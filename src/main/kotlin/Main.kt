fun main() {
    var place = 'K'
    var person ="M"
    println(place)
    println(person)
//    temp()

    var bucket = "bird"
    bucket = "birds"
    println(bucket)
    bucket = "pigeon"
    println(bucket)

    var fname ="Martin"
    var lname = "Kasuku"
    var fullName = "$fname $lname"
    println(fullName)
    var name = "Jame"
    var age = 24
    var occupation = "pilot"
    var statement = "$name, who is $age years old is $occupation"
    println(statement)

    var nam = "Wendy"
    println("Hello $nam")

    val fruit = "Avocado"
    println(fruit[0])
    println(fruit[3])
    println(fruit.first())
    println(fruit.last())
    println(fruit.indexOf("o"))
    println(fruit.indexOf("d"))
    println(fruit.lastIndexOf("o"))

    println(fruit.indexOf('v'))

    val city = "Kigali"
    val city2 = "Kigali"
    println(city==city2)
    println(city.uppercase())
    println(city.lowercase())

    val emptyString = ""
    val blankString = " "
    println(emptyString.isEmpty())
    println(blankString.isEmpty())
    println(emptyString.isBlank())
    println(blankString.isBlank())

    val ciity =  " Kampala "
    println(ciity)
    println(ciity.trimStart())
    println(ciity.trimEnd())
    println(ciity.trim())

    val sentence = "Janet is the minister of finance"
    println(sentence.startsWith("Jant"))
    println(sentence.endsWith("t"))
    println(sentence.endsWith("finance"))
    println(sentence.replace("finance", "health"))
    println(sentence.replace("i", "v"))
    println(sentence.replace("health", "education"))

    var phoneNumber = "0722334455"
    if(phoneNumber.startsWith("07")){
        var slice = phoneNumber.substring(1)
        phoneNumber = "+254$slice"
        println(phoneNumber)
    }
    var weight = 40.8
    println(weight.toString() + "kg is how much I weigh")

    var senence = "A small bird perched on the rear window"
    println(senence.split(" "))
    println(senence.split("p"))
    println(senence.split(","))

    var email = "muyonka@gmail.com"
    val username = email.split("@")[0]
    println(username)

    val text = "akirachix"
    println(text.first())
    println(text[3])

    fun printschool(){
        var school = "Akirachix"
        println(school[0])
        println(school[2])
        println(school[3])


    }
//    fun area(){
//        var a =
//    }
     
fun school(word:String){
    var a = word[0]
    var b = word[2]
    var c = word[3]
    var result = "$a$b$c"
    println(result)

}

    fun areaOfRectangle(){
        var length =  20
        var width  = 30
        var area = length*width
        println(area)
    }





}