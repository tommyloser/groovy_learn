package variable

//def list = new ArrayList()//java 定义
def list = [1, 3, 2, 4, 5]//groovy
println list.class // 这是一个array list
println list.size()
def array = [1,2,3,4,5] as int[] // 定义int 数组
int[] array2 = [1, 2, 3, 4, 5] //定义int 数组2

/**
 * 列表的操作, 排序
 */
def sortList = [6, -3, 9, 2, -7, 1, 5]
//-------java ------ 方法
//Comparator mc = { a, b ->
//    a==b ? 0 :
//            Math.abs(a) < Math.abs(b) ? -1 :1
//}
//Collections.sort(sortList, mc)
//println sortList

//----------groovy ---- 方法
//sortList.sort()//groovy
sortList.sort{
    a, b -> a==b ? 0 :
            Math.abs(a) < Math.abs(b) ? 1 :-1
}
println sortList

def sortStringList = ['abc', 'z', 'Hello', "groovy", "java"]
sortStringList.sort{
    it -> return it.size()
}
println sortStringList

/**
 * 列表操作， 查找
 */
def findList = [-3, 9, 6, 3, -7, 2, 5]
//find
//int result = findList.find {
//    return it % 2 == 0
//}
//findAll
def result = findList.findAll {
    return it % 2 == 0
}
println result

//any
println findList.any { return it % 2 != 0}
//every
println findList.every { return it % 2 == 0 }

//min
println findList.min{return Math.abs(it)}
//max
println findList.max()

//统计
println findList.count { return Math.abs(it) % 2 == 1}




