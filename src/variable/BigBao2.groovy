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