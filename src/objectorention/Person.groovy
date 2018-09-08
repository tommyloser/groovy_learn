package objectorention
/**
 * 1. groovy 默认都是public
 * 2, groovy 所有类都继承groovy object
 */
class Person implements Action ,DefualtAction{
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
}
