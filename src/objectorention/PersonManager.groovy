package objectorention

/**
 * Person类管理器
 */
class PersonManager {
    static Person createPerson(String name, int age) {
        return Person.createPerson(name, age) //静态方法
    }
}
