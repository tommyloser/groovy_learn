package variable


    def x = 9
    def result
    switch ( x ){
        case 'foo':
            result = 'found foo'
            break
        case 'bar':
            result = 'bar'
        case [1.23 ,4, 5, 6, 'inlist']://列表
            result = 'list'
            break
        case 12..30://范围
            result = 'range'
            break;
        case Integer://类型
            result = "integer"
            break
        case BigDecimal:
            result = 'big decimal'
            break
        default:
            result = 'default'

    }
    println result

//对范围的for循环
def sum = 0
for (i in 0..9) {
    sum += i
}
println sum
/*
对list 的循环
 */
sum = 0;
for (i in [1, 2, 3, 5, 7, 8, 9]) {
    sum += i
}
println sum

/**
 * 对map 进行循环
 */
sum = ""
for (i in ['lili': 1, 'luck': 2, 'xiaoming': 3]) {
    sum += i.key//i.value i.key i (lili=1)
}
println sum;