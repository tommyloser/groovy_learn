package variable

int x = fab(5)
println x
int y = fab2(5)
println y
int z = cal(101)
println z


//用来求指定number的阶乘
int fab(int number) {
    int result = 1;
    1.upto(number, { num -> result *= num })
    return result
}

int fab2(int number) {
    int result = 1;
    number.downto(1) {
        num -> result *= num
    }
    return result
}

int cal(int number) {
    int result = 0
    number.times {
        num -> result += num
    }
    result
}

/**
 闭包和字符串的结合使用
 */
String str = 'the 2 and 3 is 5'
//each 遍历字符
//str.each {
//    String temp -> print temp
//}
//返回值就是他本身
println str.each {

}

//find 符合条件的第一个
println str.find {
    String s -> s.isNumber()
}

def list = str.findAll {
    String s -> s.isNumber()
}
println list.toListString()

def aa = str.any {
    String s -> s.isNumber()
}
println aa

println str.every {
    String s -> s.isNumber()
}

def list2 = str.collect {
    it.toUpperCase()
}
println list2.toListString()

/**
 * 闭包的三个重要变量：this, owner, delegate
 */
def scriptClouser = {
    println "scriptClouser this:" + this//跟jave 一样
    println "scriptClouser owner:" + owner//代表闭包定义出的类或对象
    println "scriptClouser delegate:" + delegate //代表任意对象， 默认owner
}
scriptClouser.call()

//定义一个内部类
class Person{

    def  classClouser = {
        println "scriptClouser this:" + this//跟jave 一样
        println "scriptClouser owner:" + owner//代表闭包定义出的类或对象
        println "scriptClouser delegate:" + delegate
    }

    def  say() {
        def classClouser = {
            println "SayscriptClouser this:" + this//跟jave 一样
            println "SayscriptClouser owner:" + owner//代表闭包定义出的类或对象
            println "SayscriptClouser delegate:" + delegate
        }
        classClouser.call()
    }
}
objectorention.Person p = new objectorention.Person();
//p.classClouser.call()
//p.say()
//闭包中定义一个闭包
def nestClouser = {
    def innerClouser = {
        println "innerscriptClouser this:" + this//跟jave 一样
        println "innerscriptClouser owner:" + owner//代表闭包定义出的类或对象
        println "innerscriptClouser delegate:" + delegate
    }
    innerClouser.delegate = p
    innerClouser.call()
}
nestClouser.call()
//当闭包中的闭包， owner 和delegate 指向闭包， this仍然执行class
//delegate 经过修改后 就与owner 的值不一样， this , owner 不能修改

/**
 * 闭包委托策略
 */
class Student {
    String name
    def pretty = {
        "My name is ${name}"
    }

    @Override
    String toString() {
        pretty.call()
    }
}

class Teacher {
    String name1
}

def stu = new Student(name: 'Sarash')
def tea = new Teacher(name1: 'android')
stu.pretty.delegate = tea //pretty 闭包 的delegate指向tea对象
stu.pretty.resolveStrategy = Closure.DELEGATE_FIRST //闭包策略
println stu.toString()

