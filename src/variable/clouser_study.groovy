package variable

def clouser2 = {
//    println "hello groovy"
    println("hello ${it}") //默认参数
}
////调用闭包的方式
//clouser.call()
//clouser()

//带参数闭包
def clouser = { String name,int age ->
    println "hello ${name}, My age is $age"
}
clouser('groovy', 4)
clouser2("groovy")//调用默认参数

//返回值, 闭包一定有返回值
def result = clouser("tommy", 18)
println result