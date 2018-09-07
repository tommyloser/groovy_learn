package variable
// groovy 所有变量都是对象
int x = 10

//println x.class

double y = 3.14
//println y.class
// 弱类型,
// 使用def, 编译器自动判断类型
def x_1 = 11;
println x_1.class
def y_1 = 3.1415
println y_1.class
def name = 'android'
println name.class
/**
 * 自己使用用def, 如果要联合其他类使用则用强类型
 */
