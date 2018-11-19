package variable

//def map = new HashMap() java
def colors = [red: 'ff0000', green: '00ff00', blue: '0000ff']
println colors.getAt("red")
println colors['red']
println colors.green

//添加元素
//colors.yellow = 'ffff00'
//colors.leftShift("aaa": '564687')
colors.complex = [a:1, b:2]//添加一个新的map 作为value
println colors.toMapString()

println colors.getClass()//LinkedHashMap
//println colors.class //不可用

/**
 * Map 操作
 * map 中map
 */
def students = [
        1:[number: '0001', name: 'Bob', score :55, sex: 'male'],
        2:[number: '0002', name: 'Johnny', score :62, sex: 'female'],
        3:[number: '0003', name: 'Claire', score :73, sex: 'female'],
        4:[number: '0004', name: 'Amy', score :66, sex: 'male'],
]

//遍历
//students.each {
//    def student ->
//        println "the key is ${student.key}, the value is $student.value"
//}

//带索引的遍历
//students.eachWithIndex { def stu, int index ->
//    println "index is $index, the key is $stu.key, the value is $stu.value"
//}

students.each { key, value ->
    println "the key is ${key}, the value is $value"
}

students.eachWithIndex { key, value ,index->
    println "index is $index, the key is $key, the value is $value"
}

/**
 *Map 的查找操作
 */
def entry = students.find { def student ->
    return student.value.score >= 60
}
//println entry
def entry2 = students.findAll {def student ->
    return student.value.score >= 60
}
println entry2

//count 方法
def count = students.count { def student ->
    return student.value.score >= 60 &&
            student.value.sex == 'male'
}
println count

def names = students.findAll {it.value.score >= 60}.collect {
    return it.value.name
}
println names.toListString()

//groupBy
def group = students.groupBy { //返回组名，即key name
    def student ->
        return student.value.score >= 60 ? "及格":'不及格'
}
println group.toMapString()

//sort
/**
 * 排序
 * map 的排序是新的map, list的排序是原list
 */
def sort = students.sort{ def stu, def stu2 ->
    Number score1 = stu.value.score
    Number score2 = stu2.value.score
    return score1 == score2 ? 0:score1<score2?-1:1

}
println sort.toMapString()