fun main()
{
    var s1 =Student(10,"hello ")

    println(s1.no)
    println(s1.name)

}

class Student (var no:Int)
{
    var name:String="shivam"
    constructor(n:Int,s:String):this(n)
    {
        name=s
        println("secondary constructor code ")
    }
    init
    {
        println("init called")
    }
}