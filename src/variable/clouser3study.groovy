package variable

/**
 * 闭包的三个重要变量：this, owner, delegate
 * 1.大部分相同
 * 2.闭包中定义闭包， this 和（owner, delegate) 不同
 * 3.自己修改delegate 后， 可以三个都不同
 */
def scriptClouser = {
    println "scriptClouser this:" + this //代表闭包定义处的类， 就是编译完成本脚步生成的类
    println "scriptClouser owner:" + owner //代表闭包定义处的类或对象
    println "scriptClouser delegate:" + delegate // 代表任意对象，默认owner 的对象

}
scriptClouser.call()

class Person2{

//    def static classClouser = {
    def  classClouser = {
        println "classClouser this:" + this //代表闭包定义处的类， 就是编译完成本脚步生成的类
        println "classClouser owner:" + owner //代表闭包定义处的类或对象
        println "classClouser delegate:" + delegate // 代表任意对象，默认owner 的对象
    }

//    def static say() {
    def  say() {
        def  classClouser = {
            println "methodClassClouser this:" + this //代表闭包定义处的类， 就是编译完成本脚步生成的类
            println "methodClassClouser owner:" + owner //代表闭包定义处的类或对象
            println "methodClassClouser delegate:" + delegate // 代表任意对象，默认owner 的对象
        }
        classClouser.call()
    }
}

//Person2.classClouser.call() //static
//Person2.say() //static
//非静态
Person2 p = new Person2()
//p.classClouser.call()
//p.say()

//闭包中定义闭包
def nestClouser = {
    def innerClouser = {
        println "innerClouser this:" + this //代表闭包定义处的类， 就是编译完成本脚步生成的类
        println "innerClouser owner:" + owner //这指向和this不一样
        println "innerClouser delegate:" + delegate //这指向和this不一样
    }
    innerClouser.delegate = p //修改默认delegate 对象
    innerClouser.call()
}

nestClouser.call()