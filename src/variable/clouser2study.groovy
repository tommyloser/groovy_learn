package variable

int x = cal(101)
//int x = fab2(5)
println x


int fab(int number) {
    int result = 1
    1.upto(number, { num -> result *= num })
    return result
}

int fab2(int number) {
    int result = 1
    number.downto(1){ //执行number 到1 的for 循环
         result *= it
    }
    return  result
}

int cal(int number) {
    int result = 0
    number.times { //执行number 次
        num -> result += num
    }
    return result
}

/**
 * 字符串和闭包结合使用
 * each 遍历, 返回原字符串
 * find 找第一个符合字符
 * findAll 找所有符合字符
 * any 有1 就真
 * every 全一 才真
 * collect 遍历字符，处理，返回list
 */
String str = "the 2 and 3 is 5"
//each 的遍历
str.each {//字符串的遍历，返回值是str
    String temp ->
        print(temp)
}

//find 方法， 查找符合条件的第一个满足条件的字符
println str.find {
    String s -> s.isNumber()
}

//findAll 返回所有符合条件的字符，组成list 返回
def list = str.findAll {
    String s ->
        s.isNumber()
}
println list.toListString()

//any 只要有1 ， 就返回true
def result = str.any{
    String s ->
        s.isNumber()
}
println result

//every 全部为1 才返回true
println str.every {
    String s -> s.isNumber()
}

//collect 处理所有字符
def list2 = str.collect {
    String s ->
        s.toUpperCase()
}
println list2