package file

import groovy.json.JsonOutput
import groovy.json.JsonSlurper
import objectorention.Person

def list = [new Person(name: 'John', age: 25),
            new Person(name: 'Major', age: 26)]
def json  = JsonOutput.toJson(list)
//println JsonOutput.prettyPrint(json)

def jsonSlpuer = new JsonSlurper()
//println(jsonSlpuer.parseText(json))[0].name.text()


//def reponse = getNetworkData('http://yuexibo.top/yxbApp/course_detail.json')
//println reponse.data.head.name
//
//def getNetworkData(String url) {
//    //发送http请求
//    def connection = new URL(url).openConnection()
//    connection.setRequestMethod('GET')
//    connection.connect()
//    def response = connection.content.text
//
//    // 将json转化成实体对象
//    def jsonSluper = new JsonSlurper()
//    return jsonSluper.parseText(response)
//}