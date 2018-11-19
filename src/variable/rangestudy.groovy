package variable

def range = 1..10
println range[0]
println range.contains(10)
println range.from //起始值
println range.to //终止值

//遍历
//range.each {
//    println it
//}

//for (i in range) {
//    println i
//}

//swich
def result = getGrade(75)
println result
def getGrade(Number numbet) {
    def result
    switch (numbet) {
        case 0..<60:
            result = '不及格'
            break
        case 60..<70:
            result = '及格'
            break
        case 70..<80:
            result = '良好'
            break
        case 80..<100:
            result = '优秀'
            break
    }
    result
}
