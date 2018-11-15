package variable

/**
 *  闭包的委托策略(resolveStrategy)
 */
class Student2 {
    String name
    def pretty = { "My name is $name" }

    @Override
    String toString() {
        pretty.call()
    }
}

class Teacher2 {
    String name1
}

def stu = new Student2(name: 'Tommy')
def tea = new Teacher2(name1: 'james')
stu.pretty.delegate = tea
//委托策略, 默认是owner_first
stu.pretty.resolveStrategy = Closure.DELEGATE_FIRST
println stu.toString()

