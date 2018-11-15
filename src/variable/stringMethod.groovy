package variable

//字符串方法
def str = "groovy"
//填充字符串 agroovya
println str.center(8, 'a')

//左边开始填充
println str.padLeft(8, 'a')
//右边填充
println str.padRight(8, 'a')
println str.leftShift('a')//一点a 的左边

def str3 = 'Hello'

//println str.compareTo(str3)//groovy实现了compare 方法
println str > str3 //字符串比较操作符

println str.getAt(0)
println str[0]// 中括号操作符
println str[0..1]


println str.minus('oo')//减法
println str - 'oo'//减肥操作符

println str.reverse()//反转

println str.capitalize()//首字母大写

println str.isNumber()//是否数字类型

//类型转换方法
//str.toInteger()
//str.toLong()







