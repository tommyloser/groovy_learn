package objectorention
/**
 * 1. groovy 默认都是public
 * 2, groovy 所有类都继承groovy object
 */
class Person implements Action ,DefualtAction, Serializable{
    //所有属性都是public对象
    String name
    Integer age

    //def 返回值
    def increaseAge(Integer years) {
        this.age += years
    }

    @Override
    String toString() {
        return super.toString()
    }

    @Override
    void eat() {

    }

    @Override
    void drink() {

    }

    @Override
    void play() {

    }

    /**
     * invokeMethod person 调用没有的方法，就调用这个方法
     * @param name 方法名
     * @param args 方法参数
     * @return
     */
    def invokeMethod(String name, Object args) {
        return "the method is ${name}, the params is ${args}"

    }

    /**
     * person, 调用没有的方法的时候， 本方法 比invokeMethod 优先执行
     * @param name
     * @param args
     * @return
     */
    def methodMissing(String name, Object args) {
        return "the method ${name} is missing"
    }


}
