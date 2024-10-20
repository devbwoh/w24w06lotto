package kr.ac.kumoh.s20230000.w24w06lotto.model

data class LottoNumber(
    val numbers: IntArray
)

// TODO: Warning 제거
// Property with 'Array' type in a 'data' class: it is recommended to override 'equals()' and 'hashCode()'
// 추후에 비교를 할 필요가 있을 때는, 배열의 내용을 비교하도록 만들어 줘야 함
//data class LottoNumber(
//    val numbers: IntArray
//) {
//    override fun equals(other: Any?): Boolean {
//        if (this === other) return true
//        if (other !is LottoNumber) return false
//        return numbers.contentEquals(other.numbers)
//    }
//
//    override fun hashCode(): Int {
//        return numbers.contentHashCode()
//    }
//}