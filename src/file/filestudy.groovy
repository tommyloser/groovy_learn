package file

import objectorention.Person

def file = new File('../../Hello Groovy.iml')//回退两步
//遍历文件内容
//file.eachLine {line ->
//    println line
//}

//第二个方法
//def text = file.getText()
//println text

//第三个方法
//def result = file.readLines()//list
//println result.toListString()

//读取文件部分内容
//def reader = file.withReader { reader ->
//    char[] buffer = new char[100]
//    reader.read(buffer)
//    return buffer
//}
//println reader

////写入文件，参考上面
//def writer = file.withWriter { writer ->
//    writer.append()
//}

def result2 = copy('../../Hello Groovy.iml', '../../Hello Groovy2.iml')
println result2
def copy(String sourcePath, String destationPath) {
    try {
        // 创建目标文件
        def desFire = new File(destationPath)
        if (!desFire.exists()) {
            desFire.createNewFile()
        }
        //TODO 判断源文件存在
        //读取源文件
        new File(sourcePath).withReader {
            reader ->
                def lines = reader.readLines()
                desFire.withWriter {
                    writer ->
                        lines.each { line ->
                            writer.append(line + "\r\n")
                        }
                }
        }
        return true
    } catch (Exception e) {
        e.printStackTrace()
    }//groovy 不用关闭流

}

/**
 * 对象存储
 * File.withObjectOutputStream
 * File.withObjectInputStream
 */
def person = new Person(name: 'tommy', age : 26)
//saveObject(person, '../../person.bin')
def result = (Person)readObject('../../person.bin')
println "the name is ${result.name} and the age is ${result.age}"
//file.newObjectInputStream()
//close()
//对象读写
def saveObject(Object object, String path) {
    try {
        // 创建目标文件
        def desFire = new File(path)
        if (!desFire.exists()) {
            desFire.createNewFile()
        }
        //写文件
        desFire.withObjectOutputStream {out ->
            out.writeObject(object)
        }
        return true
    }catch(Exception e){
        e.printStackTrace()
    }
    return false
}

def readObject(String path) {
    def obj = null
    try {
        def file = new File(path)
        if (file == null || !file.exists()) {
            return null
        }
        file.withObjectInputStream { input ->
            obj = input.readObject()
        }
    } catch (Exception e) {
        e.printStackTrace()
    }
    return obj
}