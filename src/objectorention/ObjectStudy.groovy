package objectorention

//没有构造方法也可以传值
def person = new Person(name: 'android', age : 26)
println "the name is ${person.name}, the age is ${person.age}"
//'.'操作费就是getName
person.increaseAge(10)//和java 一样


