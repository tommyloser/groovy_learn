package variable

//java switch int string char 枚举
def x = 1.23
def result
switch (x){
    case 'foo':
        result = 'found foo'
        break
    case 'bar':
        result = 'bar'
        break
    case [1.23, 4,5,6, 'inlist']://列表
        result = 'list'
        break
    case 12..30:
        result = "range"
        break
    case Integer:
        result = "integer"
        break
    case BigDecimal:
        result = "BigDeimal"
        break
    default:result = "default"

}

println result


def sum = 0
for (i in 0..9) {//范围循环
    sum += i

}
//println sum

sum = 0
for (i in [1, 2, 3, 4, 5, 6, 7, 8, 9]) {//list 循环
    sum += i
}
//println sum

sum = 0
for (i in ['lili': 1, "luck": 2, "tommy": 3]) {//Map 循环
    sum+= i.value
}
println sum


