package variable

def name = 'a single \'a\' string'
println name.class //String

def thupleName = '''\
line one
line two
line three
''' //raw string
println thupleName.class //String
println thupleName

def doubleName = "this a common String" //可扩展字符串
println doubleName.class //String

def name1 = "Qndroid"
def sayHello = "Hello:${name}"
println sayHello
println sayHello.class// GStringImpl类型

def sum = "The sum of 2 and 3 equals ${2 + 3}"
//println sum

def result = echo(sum)//GString 可以当String 类型使用
println result
println result.class //String

String echo(String message) {
    return message
}
