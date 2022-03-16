fun main(){
    jina()
    var t=numbers(9,4)
    var n=parameter("Joy",12)
    println(n)
    var r=mum("Nkimalantoi")
    println(r)

}
fun jina(){
    var y="codeHive"
    var c=y[4].toString()+y[5]+y[6]+y[7]
    println(c)
}
fun numbers(nm1:Int,nm2:Int){
    var b=nm1%nm2
    println(b)



}
fun parameter(name:String,age:Int):String{
    var v="hi my name is $name,and i am $age years old"
    return v

}
fun mum(l:String):Int{
    return l.length
}