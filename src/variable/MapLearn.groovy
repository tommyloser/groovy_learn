package variable

def map = new HashMap()
def colors = [red  : 'ff0000',
              green: '00ff00',
              blue : '0000ff']
println colors.getAt("red")//java
//groovy
println colors['red']
println colors.red

//添加元素-----------------------
colors.yellow = 'ffff00'
colors.complex = [a: 1, b: 2]
println colors.toMapString()
println colors.getClass()//LinkedHashMap

def students = [
        1:[number: '0001', name: 'Bob', score :55, sex: 'male'],
        2:[number: '0002', name: 'Johnny', score :62, sex: 'female'],
        3:[number: '0003', name: 'Claire', score :73, sex: 'female'],
        4:[number: '0004', name: 'Amy', score :66, sex: 'male'],
]

//遍历-----------------------------
//students.each {
//    def student -> println "the key is ${student.key},"+
//            "the value is ${student.value}"
//}
//students.eachWithIndex{ def student ,int index -> //不可以调转
//    println "index is ${index}, the key is ${student.key},"+
//            "the value is ${student.value}"
//}
    //直接遍历key-value
//students.each {
//    key, value ->
//        println "the key is ${key},"+
//                "the value is ${value}"
//}
//students.eachWithIndex {
//    key, value , index->
//        println "index is ${index}, the key is ${key},"+
//            "the value is ${value}"
//}

//Map 的查找
//def entry = students.find{
//    def student -> return student.value.score >= 60
//}
//println entry
//println entry.getClass()//LinkedHashMap

def entrys = students.findAll {
    def student -> return student.value.score >= 60
}
//println entrys

//统计
def count = students.count {
    def student -> return student.value.score >= 60 &&
            student.value.sex == "male"
}
println count

//先查找, 然后收集数据的name 放到names
def names = students.findAll { def student ->
    return student.value.score >= 60
}.collect {
    return it.value.name
}
println names.toListString()

//分组
def group = students.groupBy {
    def student ->
        return student.value.score >= 60 ? '及格' : '不及格'
}
println group.toMapString()
/*
结果 [不及格:[1:[number:0001, name:Bob, score:55, sex:male]], 及格:[2:[number:0002, name:Johnny, score:62, sex:female], 3:[number:0003, name:Claire, score:73, sex:female], 4:[number:0004, name:Amy, score:66, sex:male]]]
 */

/**
 * 排序
 */
def sort = students.sort {def student1, def student2 ->
    Number score1 = student1.value.score
    Number score2 = student2.value.score
    return score1 == score2 ? 0 : score1 < score2 ? -1 : 1
}
println sort.toMapString()
