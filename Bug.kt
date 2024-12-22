```kotlin
fun main() {
    val list = listOf(1, 2, 3, 4, 5)
    val doubledList = list.map { it * 2 }
    println(doubledList)

    val doubledList2 = list.map { it * 2 }
    println(doubledList2.size)

    val strList = listOf("a", "b", "c")
    val strListUpper = strList.map { it.uppercase() }
    println(strListUpper)

    val intList = listOf(1,2,3,4,5)
    val doubledInts = intList.map { it * 2 }
    println(doubledInts)

    val evenInts = intList.filter { it % 2 == 0 }
    println(evenInts)

    val sum = intList.sum()
    println(sum)

    val average = intList.average()
    println(average)
}
```