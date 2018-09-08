package variable

def range = 1..10//定义范围
println range[0]
println range.contains(10)//是否包含
println range.from//1
println range.to//10
//range 其实就是list 的子类

//遍历
range.each {
    println it
}
for (i in range) {
    println i
}

def result = getGrade(75)
println result
def getGrade(Number number) {
    def result
    switch (number) {
        case 0..60:
            result = '不及格'
            break
        case 60..<70:
            result = '及格'
            break
        case 70..<80:
            result = '良好'
            break
        case 80..100:
            result = '优秀'
            break
    }
    return result
}
