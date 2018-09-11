package objectorention
/**
 * 1. groovy 默认都是public
 * 2, groovy 所有类都继承groovy object
 */
class Person implements Action ,DefualtAction, Serializable{
    //所有属性都是public对象
    String name
    Integer age

    def increaseAge(Integer years) {
        this.name += years
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

    def invokeMethod(String name, Object args) {
        return "the method is ${name}, the params is ${args}"

    }

    def methodMissing(String name, Object args) {
        return "the method ${name} is missing"
    }


}
