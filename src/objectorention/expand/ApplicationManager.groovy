package objectorention.expand

import objectorention.Person


/**
 * 模拟一个应用管理类
 */
class ApplicationManager {
    static void init() {
        ExpandoMetaClass.enableGlobally()
        //为第三方类添加静态方法
        Person.metaClass.static.createPerson = {
            String name, int age ->
                new Person(name: name, age:age)
        }
    }
}
