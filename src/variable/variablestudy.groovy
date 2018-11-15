package variable

int x = 10

//println x.class

double y = 3.14
//println y.class

def x_1 = 11
//println x_1.class
def y_1 = 3.1415
//println y_1.class //BigDecimal 类型
def name = "Qandroid"
//println name.class

//自己使用用def , 提供给其他模块， 最后使用强类型定义
x_1 = "Test"
println x_1.class//可以改变类型, def 相当于一个引用， groovy 没有了基本类型



