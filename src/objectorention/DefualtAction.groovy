package objectorention

/**
 * 结合抽象类，和接口， 提供抽象方法， 但是也可以有实现的方法
 */
trait DefualtAction {
    abstract void eat()

    void play() {
        println 'i can play'
    }
}