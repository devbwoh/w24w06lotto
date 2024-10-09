package kr.ac.kumoh.s20230000.w24w06lotto.service

import org.springframework.stereotype.Service
import kotlin.random.Random

@Service
class LottoService {
    fun getLuckyNumbers(): Array<Int> {
        val numbers = arrayOf(0, 0, 0, 0, 0, 0)

        for (i in numbers.indices)
            numbers[i] = Random.nextInt(44) + 1

        return numbers
    }
}