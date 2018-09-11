package objectorention.expand

import objectorention.PersonManager

class Entry {
    static void main(def args) {
        println '应用程序正在启动...'
        //初始化
        ApplicationManager.init()
        println "应用程序初始化完成"

        def person = PersonManager.createPerson( 'tommy', 26)
        println "the person name is ${person.name}" +
                " and the age is ${person.age}"

    }
}
