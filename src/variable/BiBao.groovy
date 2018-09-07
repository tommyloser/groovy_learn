package variable

/**
 闭包
 */
def clouser = { println 'hello groovy!' } //闭包定义
clouser.call()//闭包调用
//clouser()// 闭包调用2

def clouser2 = { String name, int age ->
    println "hello ${name}, My age is ${age}"}
def name = 'tommy'
//clouser2('groovy!')
clouser2(name, 5)


def clouser3 = {println "hello ${it}"}//it是默认参数
def james = 'james'
clouser3(james)

//闭包返回值
def clouser4 = { String name2 ->
    println "Hello ${name2}"
}
def name2 = 'groovy!'
def result = clouser4(name2)//闭包默认返回null
println result


