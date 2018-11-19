package objectorention

//没有构造方法也可以传值
def person = new Person(name: 'android', age : 26)
//def person2 = new Person(name: 'android') //指定一个也可以
//println "the name is ${person.name}, the age is ${person.age}"
//'.'操作符就是getName
def s = person.increaseAge(10)//和java 一样
println s.class
println person.name
println person.age


//println person.cry() //MissingMethodException
ExpandoMetaClass.enableGlobally()//动态注入方法，属性全局适用

/**
 * 动态添加的属性和方法只能在本脚步使用
 * 除非你设置了ExpandoMetaClass.enableGlobally()
 */

//metaclass
//为类动态的添加一个属性
Person.metaClass.sex = 'male'
def person2 = new Person(name: 'Ondroid', age: 26)
println person2.sex
person2.sex = 'female'
println "the new sex is :" + person2.sex


//为类动态的添加方法, 添加一个方法 setUpperCase:（）-> ()
Person.metaClass.sexUpperCase = { -> sex.toUpperCase() }
def person3 = new Person(name: 'android', age: 26)
println person3.sexUpperCase()


//为类动态添加静态方法
Person.metaClass.static.createPerson = {
    String name, int age -> new Person(name: name, age: age)
}
def person4 = Person.createPerson('tommy', 30)
println person4.name + " and " + person4.age


