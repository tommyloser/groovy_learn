package variable

//def list = new ArrayList()
def list = [1,2,3,4,5]//groovy 定义list的方式
//println list.class //ArrayList
//println list.size() //5
def array = [1, 2, 3, 4, 5] as int[]
int[] array2 = [1, 2, 3, 4, 5]
println array.class
println array2.class

/**
 * 列表排序
 */
def sortList = [6, -3, 9, 2, -7, 1, 5]
//闭包定义comparator
//Comparator mc = {a, b -> a==b ? 0 :
//Math.abs(a) < Math.abs(b) ? -1 : 1}
//
//Collections.sort(sortList, mc)

//groovy排序
sortList.sort{
    a, b -> a==b ? 0 :
    Math.abs(a) < Math.abs(b) ? 1 : -1
}
println sortList

def sortStringList = ['abd', 'z', 'Hello', 'groovy', 'java']
sortStringList.sort{ it -> return it.size() }
println sortStringList

/**
 * 列表的查找
 */
def findList = [-3, 9, 6, 2, -7, 1, 5]
int result  = findList.find {return  it % 2 == 0}
println result
println findList.findAll { return it % 2 != 0 }

println findList.any {return it % 2 != 0 }
println findList.every { return it % 2 == 0 }

println findList.min{ return Math.abs(it)}//最大值
println findList.max()//最小值

//统计
println findList.count{ return it % 2 == 0}
println findList.count{ return it >= 60}//大于60分的学生

