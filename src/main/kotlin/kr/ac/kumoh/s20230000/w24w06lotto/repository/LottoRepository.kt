package kr.ac.kumoh.s20230000.w24w06lotto.repository

import kr.ac.kumoh.s20230000.w24w06lotto.model.LottoNumber

interface LottoRepository {
    fun save(lottoNumber: LottoNumber): LottoNumber
    fun find(): LottoNumber?
}