package file

import groovy.json.JsonOutput
import groovy.json.JsonSlurper
import objectorention.Person

/**
 * json 的转换
 * JsongOutput.toJson
 * JsonSlurper.parseText
 */
def list = [new Person(name: 'John', age: 25),
            new Person(name: 'Major', age: 26)]
//使用jsonOutput 将对象转化成json 字符串
def json  = JsonOutput.toJson(list)
println json
println JsonOutput.prettyPrint(json)

//使用JsonSlurper 将字符串变成对象
def jsonSlpuer = new JsonSlurper()
println ((jsonSlpuer.parseText(json))[0].name)
//jsonSlpuer.parse 很多重载方法


//def reponse = getNetworkData('http://yuexibo.top/yxbApp/course_detail.json')
//println reponse.data.head.name
////
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