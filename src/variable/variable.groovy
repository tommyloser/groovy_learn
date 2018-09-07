package variable
// groovy 所有变量都是对象
int x = 10

//println x.class

double y = 3.14
//println y.class
// 弱类型,
// 使用def, 编译器自动判断类型
def x_1 = 11;
//println x_1.class
def y_1 = 3.1415
//println y_1.class
def name = 'android'
//println name.class
/*
 * 自己使用用def, 如果要联合其他类使用则用强类型
 */
x_1 = "tommy"
//println x_1.class

/*
GString
 */
//def name1 = 'a single string'
//println(name1.class)
//def name2 = 'a single \'a\' string'
//println name2
//def name3 = '''\
//line one
//line two
//line threee3
//'''
//println name3

/*
可扩展字符串
 */
//def doublename = "this a common string"
//println doublename.class
//
//def name4 = "android"
//def sayHello = "hello:${name4}"
//println sayHello
//println sayHello.class //GStringImpl 格式
//
def sum = "The sum of 2 and 3 equals ${2 + 3}"//可扩展做任意的表达式
//println sum
def result = echo(sum)
//println result.class
//println result

String echo(String message){
    return message
}

/* ============= 字符串的方法=========== */
def str = "groovy"
//println str.center(8)
//println str.center(8, 'a')
//println str.center(9, 'ab')
//println str.padLeft(8, 'a')
//println str.padRight(8, 'a')
//字符串比较
def str2 = 'Hello groovy'
println str > str2
str.compareTo(str2)

println str[0] //字符串index
str.getAt(0)

println str[0..1]//裁剪

println str.minus(str2)//剪切字符串
println str2 - str // hello

//println str.reverse()
println str.capitalize()//首字母大写
println str.isNumber()//是否数字

/*
groovy 逻辑控制
 */
//switch case
