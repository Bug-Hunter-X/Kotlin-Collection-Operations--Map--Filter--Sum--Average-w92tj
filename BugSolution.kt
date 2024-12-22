```kotlin
fun main() {
    val list = listOf(1, 2, 3, 4, 5)
    val doubledList = list.map { it * 2 }
    println(doubledList) // Output: [2, 4, 6, 8, 10]

    val doubledList2 = list.map { it * 2 }
    println(doubledList2.size) // Output: 5

    val strList = listOf("a", "b", "c")
    val strListUpper = strList.map { it.uppercase() }
    println(strListUpper) // Output: [A, B, C]

    val intList = listOf(1,2,3,4,5)
    val doubledInts = intList.map { it * 2 }
    println(doubledInts) // Output: [2, 4, 6, 8, 10]

    val evenInts = intList.filter { it % 2 == 0 }
    println(evenInts) // Output: [2, 4]

    val sum = intList.sum()
    println(sum) // Output: 15

    val average = intList.average()
    println(average) // Output: 3.0
}
```